package com.masashik.app.controllers;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.masashik.app.models.User;
import com.masashik.app.services.UserService;
import com.masashik.app.services.UserServiceImpl;
import com.masashik.app.models.Permission;

import spark.Request;
import spark.Response;

import java.util.Collection;
import java.util.HashMap;
import java.util.Date;

public class UserController {

  final UserService userService = new UserServiceImpl();

  public Collection<User> getUsers(Request request, Response response) {

    response.type("application/json");

    return userService.getUsers();

  }

  public Object addUser(Request request, Response response) {

    response.type("application/json");

    User user = null;
    try {
      user = new Gson().fromJson(request.body(), User.class);
    } catch (JsonSyntaxException e) {
      response.status( 400 );
      return "Requested body is malformatted.";
    }

    user.setId(java.util.UUID.randomUUID().toString());

    userService.addUser(user);

    response.status( 201 );

    return user;
  }

  public User removeUser(Request request, Response response) {

    response.type("application/json");

    User user = null;
    try {
      user = new Gson().fromJson(request.body(), User.class);
    } catch (JsonSyntaxException e) {
      response.status( 400 );
      return user;
    }

    if (userService.userExists(user)) {
      userService.deleteUser(user.getId());
    } else {
      response.status( 404 );
      return user;
    }
    response.status( 200 );
    return user;

  }

  public Object getUser(Request request, Response response) {
    User user = userService.getUser(request.params(":id"));
    if (user == null) {
      response.status( 404 );// 404 Not Found.
      return null;
    } else {
      response.type("application/json");
      response.status( 200 );
      return user;
    }
  }

  public Object grantPermission(Request request, Response response) {
    /**
     * /user/:id/grant/:permission
     */
    User user = userService.getUser(request.params(":id"));
    Permission.LEVEL level = Permission.LEVEL.valueOf(request.params(":permission"));
    Permission newPermission = new Permission();

    if (null != user) {

      if (level == null) {
        response.status( 404 );
        response.type("application/json");
        return user;
      }

      newPermission.setPermittedLevel(level);
      newPermission.setGrantedDate(new Date().toString());

      if (!userService.permissionExists(user, newPermission)) {
        userService.getUserPermission().put(user.getId(), newPermission);
        response.type("application/json");
        response.status( 200 );
      } else {
        //Permission is already assigned to the user.
        response.type("application/json");
        response.status( 200 );
        user.setPermission(newPermission);
        return user;
      }
    } else {
      response.type("application/json");
      response.status( 404 );// Not Found
      return null;
    }

    user.setPermission(newPermission);
    return user;
  }

  public Object revokePermission(Request request, Response response) {

    User user = userService.getUser(request.params(":id"));
    Permission.LEVEL level = Permission.LEVEL.valueOf(request.params(":permission"));

    Permission newPermission = new Permission();

    if (null != user) {

      if (level == null) {
        response.status( 404 );
        return user;
      }

      newPermission.setPermittedLevel(level);
      newPermission.setGrantedDate(new Date().toString());

      if (userService.permissionExists(user, newPermission)) {
        userService.getUserPermission().remove(user.getId());
        response.type("application/json");
        response.status( 200 );
      }
    }
    user.setPermission(null);
    return user;
  }

  public Collection<User> getUsersByFamilyName(Request request, Response response) {

    String familyName = request.params(":familyName");

    return userService.getUsers(familyName);

  }

  /**
   * Test methods
   */
  public User getTestUser(Request request, Response response) {

    User testUser = new User();
    testUser.setFirstName("Masashi");
    testUser.setLastName("Kobayashi");
    testUser.setBirthDate("1998-11-05");
    testUser.setEmail("masashi@masashi.ca");
    testUser.setPassword("password");
    testUser.setId("1");

    return testUser;
  }

  public Permission getTestPermission(Request request, Response response) {

    Permission testPermission = new Permission();
    testPermission.setPermittedLevel(Permission.LEVEL.ADMIN);
    testPermission.setGrantedDate(new Date().toString());

    return testPermission;
  }

  public HashMap<String, Permission> getPermissions(Request request, Response response) {
    response.type("application/json");
    return userService.getUserPermission();
  }

  public Object removeAllUsers(Request request, Response response) {
    response.type("application/json");
    response.status( 200 );
    userService.getUserStore().clear();
    return "";
  }

  public Object revokeAllPermissions(Request request, Response response) {
    response.type("application/json");
    response.status( 200 );
    userService.getUserPermission().clear();
    return "";
  }
}