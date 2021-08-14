package com.masashik.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SCIMUserManagementMainApp {

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

		SpringApplication.run(SCIMUserManagementMainApp.class, args);

	}
}
