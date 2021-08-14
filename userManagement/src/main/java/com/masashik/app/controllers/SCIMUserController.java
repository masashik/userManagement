package com.masashik.app.controllers;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.masashik.app.models.Permission;
import com.masashik.app.models.User;
import com.masashik.app.services.UserService;
import com.masashik.app.services.UserServiceImpl;
import com.masashik.app.data.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/scim/users")
public class SCIMUserController {

	/**
	 *
	 *	private final UserRepository userRepo;
   *
	 *	SCIMUserController(UserRepository _userRepo) {
	 *		this.userRepo = _userRepo;
	 *	}
	*/

	@Autowired
	private UserRepository userRepo;

	/**
	 * http://localhost:8080/scim/users?familyName=Kobayashi
	 * @param lastName
	 * @return List of found Users.
	 */
	@GetMapping
	public List<User> findUsersByLastName(@RequestParam("familyName") String lastName) {
		return userRepo.findByLastName(lastName);
	}
}
