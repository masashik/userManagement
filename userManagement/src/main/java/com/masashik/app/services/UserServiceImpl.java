package com.masashik.app.services;

import java.util.Date;
import java.util.stream.Collectors;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.masashik.app.models.Permission;
import com.masashik.app.models.User;

public class UserServiceImpl implements UserService {

	private final HashMap<Long, User> userStore;
	private final HashMap<Long, Permission> userPermission;

	public UserServiceImpl() {
		userStore = new HashMap<Long, User>();
		userPermission = new HashMap<Long, Permission>();
	}

	public Collection<User> getUsers() {
		return userStore.values();
	}

	public List<User> getUsers(String familyName) {
		//Search users by family name.
		return userStore.values().stream().filter(user -> user.getLastName().contains(familyName)).collect(Collectors.toList());
	}

	public void addUser(User user) {
		userStore.put(user.getId(), user);
	}

	public void deleteUser(Long id) {
		userStore.remove(id);
	}
	public User getUser(Long id) {
		return userStore.get(id);
	}

	public void grantPermission(User user, Permission permission) {
		if (userStore.containsKey(user.getId())) {
			permission.setGrantedDate(new Date().toString());
			userPermission.put(user.getId(), permission);
		}
	}

	public void revokePermission(User user, Permission permission) {
		if (userStore.containsKey(user.getId())) {
			userPermission.remove(user.getId(), permission);
		}
	}

	public HashMap<Long, User> getUserStore() {
		return userStore;
	}

	public HashMap<Long, Permission> getUserPermission() {
		return userPermission;
	}

	public boolean userExists(User user) {
		return userStore.containsKey(user.getId());
	}

	public boolean permissionExists(User user, Permission permission) {

		Permission retrievedPermission = userPermission.get(user.getId());

		if (retrievedPermission == null) {
			return false;
		}

		return retrievedPermission.getPermittedLevel().compareTo(permission.getPermittedLevel()) == 0;

	}
}
