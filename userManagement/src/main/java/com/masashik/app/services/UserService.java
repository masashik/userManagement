package com.masashik.app.services;

import com.masashik.app.models.User;
import com.masashik.app.models.Permission;

import java.util.Collection;
import java.util.HashMap;

public interface UserService {

	public Collection<User> getUsers();
	public Collection<User> getUsers(String filter);
	public void addUser(User user);
	public void deleteUser(String id);
	public User getUser(String id);
	public void grantPermission(User user, Permission permission);
	public void revokePermission(User user, Permission permission);
	public HashMap<String, Permission> getUserPermission();
	public boolean permissionExists(User user, Permission permission);
	public boolean userExists(User user);
}
