package com.masashik.app;

import static spark.Spark.port;
import static spark.Spark.get;
import static spark.Spark.delete;
import static spark.Spark.post;

import com.masashik.app.controllers.UserController;
import com.masashik.app.transformers.JsonResponseTransformer;

public class UserManagementMainApp {

	public static void main(String[] args) {

		/**
		 * 	This API App has the following functionalities.
		 *
		 * 	- list all users
		 * 	- add user
		 * 	- remove user
		 * 	- get single user
		 * 	- grant permission for a user
		 * 	- revoke permission for a user
		 * 	- search users by family name
		 */

		port(8000);

		var userController = new UserController();

		var transformer = new JsonResponseTransformer();


		// list all users
		get("/users", userController::getUsers, transformer);

		// add user
		post("/users", userController::addUser, transformer);

		// remove user
		delete("/users", userController::removeUser, transformer);

		// get single user
		get("/user/:id", userController::getUser, transformer);

		// grant permission for a user
		post("/user/:id/grant/:permission", userController::grantPermission, transformer);

		// revoke permission for a user
		post("/user/:id/revoke/:permission", userController::revokePermission, transformer);

		// <mark>search users by family name <– this will be a stretch goal</mark>
		get("/users/:familyName", userController::getUsersByFamilyName, transformer);

		// Get all stored permissions
		get("/permissions", userController::getPermissions, transformer);

		// Remove all users
		delete("/users/reset", userController::removeAllUsers);

		// Rovoke all permissions
		delete("/permissions/reset", userController::revokeAllPermissions);

		// test endpoint to get a statically prepared user data.
		get("/testUser", userController::getTestUser, transformer);

		// test endpoint to get a statically prepared permission data.
		get("/testPermission", userController::getTestPermission, transformer);
	}
}
