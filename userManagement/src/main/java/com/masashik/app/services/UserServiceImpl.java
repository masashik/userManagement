package com.masashik.app.services;

import java.util.Date;
import java.util.stream.Collectors;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.masashik.app.models.Permission;
import com.masashik.app.models.User;

public class UserServiceImpl implements UserService {

	private final HashMap<String, User> userStore;
	private final HashMap<String, Permission> userPermission;

	public UserServiceImpl() {
		userStore = new HashMap<String, User>();
		userPermission = new HashMap<String, Permission>();
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

	public void deleteUser(String id) {
		userStore.remove(id);
	}
	public User getUser(String id) {
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

	public HashMap<String, Permission> getUserPermission() {
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
