package com.masashik.app;

import com.masashik.app.models.Permission;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.assertTrue;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

import com.masashik.app.models.User;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class UserManagementAppTest {

  //@After
	//public void cleanUp() {
	//	//Remove all users and permissions from the server.
	//	System.out.println("Cleaning up all users and permissions...");

	//	given().
	//					contentType("application/json").
	//					when().
	//					delete("http://localhost:8000/users/reset").
	//					then().
	//					statusCode(200).
	//					and().
	//					log().everything();

	//	given().
	//					contentType("application/json").
	//					when().
	//					delete("http://localhost:8000/permissions/reset").
	//					then().
	//					statusCode(200).
	//					and().
	//					log().everything();
	//}

	///**
	// * Test HTTP GET /users - List all users.
	// */
  //@Test
  //public void getAllUserAndReturnHTTP200() {

	//	given().
	//		contentType("application/json").
	//		when().
	//		get("http://localhost:8000/users").
	//		then().
	//		statusCode(200).
	//		and().
	//		contentType(ContentType.JSON)
	//		.log().everything();
  //}

	//@Test
	//public void addMultipleNewUsersTest() {

	//	Map<String, String> masashi = new HashMap<>();
	//	masashi.put("firstName","Masashi");
	//	masashi.put("lastName","Kobayashi");
	//	masashi.put("birthDate","1984-12-03");
	//	masashi.put("email","masashi@kobayashi.com");
	//	masashi.put("password","password");

	//	Map<String, String> ai = new HashMap<>();
	//	ai.put("firstName","Ai");
	//	ai.put("lastName","Sakai");
	//	ai.put("birthDate","1987-11-13");
	//	ai.put("email","ai@masashi.ca");
	//	ai.put("password","password");

	//	Map<String, String> seana = new HashMap<>();
	//	seana.put("firstName","Seana");
	//	seana.put("lastName","Kobayashi");
	//	seana.put("birthDate","2016-10-18");
	//	seana.put("email","seana@makeanart.com");
	//	seana.put("password","password");

	//	Map<String, String> zeno = new HashMap<>();
	//	zeno.put("firstName","Zeno");
	//	zeno.put("lastName","Obayashi");
	//	zeno.put("birthDate","2020-01-01");
	//	zeno.put("email","zeno@makeanart.com");
	//	zeno.put("password","password");

	//	//Create HTTP Request and POST
	//	given().
	//					contentType("application/json").
	//					body(masashi).
	//					when().
	//					post("http://localhost:8000/users").
	//					then().
	//					statusCode(201).
	//					and().
	//					contentType(ContentType.JSON)
	//					.log().everything();

	//	given().
	//					contentType("application/json").
	//					body(ai).
	//					when().
	//					post("http://localhost:8000/users").
	//					then().
	//					statusCode(201).
	//					and().
	//					contentType(ContentType.JSON)
	//					.log().everything();

	//	given().
	//					contentType("application/json").
	//					body(seana).
	//					when().
	//					post("http://localhost:8000/users").
	//					then().
	//					statusCode(201).
	//					and().
	//					contentType(ContentType.JSON)
	//					.log().everything();

	//	given().
	//					contentType("application/json").
	//					body(zeno).
	//					when().
	//					post("http://localhost:8000/users").
	//					then().
	//					statusCode(201).
	//					and().
	//					contentType(ContentType.JSON)
	//					.log().everything();

	//	List<User> users = given().
	//					contentType("application/json").
	//					when().
	//					get("http://localhost:8000/users").
	//					then().
	//					extract().
	//					body().
	//					jsonPath().
	//					getList(".", User.class);

	//	System.out.println(users.size());

	//	assertTrue(users.size() == 4);
	//}

	///**
	// * Test HTTP POST /users - add user
	// */
	//@Test
  //public void addNewUserAndReturnHTTP201() {

	//	//Create User Data
  //  Map<String, String> masashi = new HashMap<>();
	//	  masashi.put("firstName","Masashi");
	//	  masashi.put("lastName","Kobayashi");
	//	  masashi.put("birthDate","1994-11-03");
	//	  masashi.put("email","masashi@kobayashi.com");
	//	  masashi.put("password","password");

	//	//Create HTTP Request and POST
  //  given().
  //    contentType("application/json").
  //    body(masashi).
  //    when().
  //    post("http://localhost:8000/users").
  //    then().
  //    statusCode(201).
  //    and().
  //    contentType(ContentType.JSON)
  //    .log().everything();
  //}

	//@Test
	//public void addNewUserVerifyUserBody() {

  //  //Create User Data
  //  Map<String, String> masashi = new HashMap<>();
  //  masashi.put("firstName","Masashi");
  //  masashi.put("lastName","Kobayashi");
  //  masashi.put("birthDate","1984-12-03");
  //  masashi.put("email","masashi@kobayashi.com");
  //  masashi.put("password","password");

	//	User user = given().
	//		contentType("application/json").
  //    body(masashi).
  //    when().
  //    post("http://localhost:8000/users").
	//		as(User.class);

	//	assertTrue(user.getFirstName().compareTo("Masashi") == 0);
	//}

	///**
	// * Test HTTP DELETE /users - remove user
	// */
	//@Test
	//public void removeExistingUserAndReturnHTTP200() {

	//	//Create User Data
	//	Map<String, String> masashi = new HashMap<>();
	//	masashi.put("firstName","Masashi");
	//	masashi.put("lastName","Kobayashi");
	//	masashi.put("birthDate","1984-12-03");
	//	masashi.put("email","masashi@kobayashi.com");
	//	masashi.put("password","password");

	//	given().
	//					contentType("application/json").
	//					body(masashi).
	//					when().
	//					post("http://localhost:8000/users").
	//					then().
	//					statusCode(201).
	//					and().
	//					contentType(ContentType.JSON)
	//					.log().everything();

	//	List<User> users = given().
	//					contentType("application/json").
	//					when().
	//					get("http://localhost:8000/users").
	//					then().
	//					extract().
	//					body().
	//					jsonPath().
	//					getList(".", User.class);

	//	assertTrue(users.size() == 1);

	//	given().
	//					contentType("application/json").
	//					body(users.get(0)).
	//					when().
	//					delete("http://localhost:8000/users").
	//					then().
	//					statusCode(200).
	//					and().
	//					log().everything();

	//	users = given().
	//					contentType("application/json").
	//					when().
	//					get("http://localhost:8000/users").
	//					then().
	//					extract().
	//					body().
	//					jsonPath().
	//					getList(".", User.class);

	//	assertTrue(users.size() == 0);	
	//}

	//@Test
	//public void removeNonExistingUserAndReturnHTTP404() {

	//	//Create User Data
	//	Map<String, String> masashi = new HashMap<>();
	//	masashi.put("firstName","Masashi");
	//	masashi.put("lastName","Kobayashi");
	//	masashi.put("birthDate","1984-12-03");
	//	masashi.put("email","masashi@kobayashi.com");
	//	masashi.put("password","password");

	//	given().
	//					contentType("application/json").
	//					body(masashi).
	//					when().
	//					post("http://localhost:8000/users").
	//					then().
	//					statusCode(201).
	//					and().
	//					contentType(ContentType.JSON)
	//					.log().everything();

	//	List<User> users = given().
	//					contentType("application/json").
	//					when().
	//					get("http://localhost:8000/users").
	//					then().
	//					extract().
	//					body().
	//					jsonPath().
	//					getList(".", User.class);

	//	assertTrue(users.size() == 1);

	//	// Malform the requesting User payload.
	//	User user = users.get(0);
	//	user.setId("non-existent");

	//	given().
	//					contentType("application/json").
	//					body(user).
	//					when().
	//					delete("http://localhost:8000/users").
	//					then().
	//					statusCode(404).
	//					and().
	//					log().everything();

	//	// Check if the requested User still exists.
	//	users = given().
	//					contentType("application/json").
	//					when().
	//					get("http://localhost:8000/users").
	//					then().
	//					extract().
	//					body().
	//					jsonPath().
	//					getList(".", User.class);

	//	assertTrue(users.size() == 1);
	//}

	//@Test
	//public void removeExistingUserWithBadRequestBodyAndReturnHTTP404() {

	//	//Create User Data
	//	Map<String, String> masashi = new HashMap<>();
	//	masashi.put("firstName","Masashi");
	//	masashi.put("lastName","Kobayashi");
	//	masashi.put("birthDate","1984-12-03");
	//	masashi.put("email","masashi@kobayashi.com");
	//	masashi.put("password","password");

	//	given().
	//					contentType("application/json").
	//					body(masashi).
	//					when().
	//					post("http://localhost:8000/users").
	//					then().
	//					statusCode(201).
	//					and().
	//					contentType(ContentType.JSON)
	//					.log().everything();

	//	List<User> users = given().
	//					contentType("application/json").
	//					when().
	//					get("http://localhost:8000/users").
	//					then().
	//					extract().
	//					body().
	//					jsonPath().
	//					getList(".", User.class);

	//	assertTrue(users.size() == 1);

	//	User user = users.get(0);
	//	user.setId(null);
	//	user.setFirstName(null);
	//	user.setLastName(null);
	//	user.setBirthDate(null);
	//	user.setEmail(null);
	//	user.setPassword(null);
	//	user.setPermission(null);

	//	given().
	//					contentType("application/json").
	//					body(user).
	//					when().
	//					delete("http://localhost:8000/users").
	//					then().
	//					statusCode(404).
	//					and().
	//					log().everything();

	//	// Check if the requested User still exists.
	//	users = given().
	//					contentType("application/json").
	//					when().
	//					get("http://localhost:8000/users").
	//					then().
	//					extract().
	//					body().
	//					jsonPath().
	//					getList(".", User.class);

	//	assertTrue(users.size() == 1);

	//}

	///**
	// * HTTP GET /user/:id - get single user
	// */
	//@Test
	//public void getSingleUserAndReturnHTTP200() {

	//	//Create User Data
	//	Map<String, String> masashi = new HashMap<>();
	//	masashi.put("firstName","Masashi");
	//	masashi.put("lastName","Kobayashi");
	//	masashi.put("birthDate","1984-12-03");
	//	masashi.put("email","masashi@kobayashi.com");
	//	masashi.put("password","password");

	//	given().
	//					contentType("application/json").
	//					body(masashi).
	//					when().
	//					post("http://localhost:8000/users").
	//					then().
	//					statusCode(201).
	//					and().
	//					contentType(ContentType.JSON)
	//					.log().everything();

	//	//Get users and only one.
	//	List<User> users = given().
	//					contentType("application/json").
	//					when().
	//					get("http://localhost:8000/users").
	//					then().
	//					extract().
	//					body().
	//					jsonPath().
	//					getList(".", User.class);

	//	User user = users.get(0);

	//	String id = user.getId();
	//	String url = "http://localhost:8000/user/" + id;

	//	user = given().
	//					when().
	//					get(url).
	//					as(User.class);

	//	assertTrue(user.getFirstName().compareTo("Masashi") == 0);
	//	assertTrue(user.getLastName().compareTo("Kobayashi") == 0);
	//	assertTrue(user.getBirthDate().compareTo("1984-12-03") == 0);
	//	assertTrue(user.getEmail().compareTo("masashi@kobayashi.com") == 0);
	//	assertTrue(user.getPassword().compareTo("password") == 0);

	//}

	//@Test
	//public void getSingleNonExistentUserAndReturnHTTP404() {

	//	//Create User Data
	//	Map<String, String> masashi = new HashMap<>();
	//	masashi.put("firstName","Masashi");
	//	masashi.put("lastName","Kobayashi");
	//	masashi.put("birthDate","1984-12-03");
	//	masashi.put("email","masashi@kobayashi.com");
	//	masashi.put("password","password");

	//	given().
	//					contentType("application/json").
	//					body(masashi).
	//					when().
	//					post("http://localhost:8000/users").
	//					then().
	//					statusCode(201).
	//					and().
	//					contentType(ContentType.JSON)
	//					.log().everything();

	//	//Get users and only one.
	//	List<User> users = given().
	//					contentType("application/json").
	//					when().
	//					get("http://localhost:8000/users").
	//					then().
	//					extract().
	//					body().
	//					jsonPath().
	//					getList(".", User.class);

	//	User user = users.get(0);

	//	String id = user.getId();

	//	String malformed = "malformed";

	//	String url = "http://localhost:8000/user/" + id + malformed;

	//	given().
	//					when().
	//					get(url).
	//					then().
	//					statusCode(404).
	//					and().
	//					log().
	//					everything();

	//}
	///**
	// * HTTP POST /user/:id/grant/:permission - grant permission for a user
	// */
	//@Test
	//public void grantPermissionUserAndReturnHTTP200() {

	//	//Create User Data
	//	Map<String, String> masashi = new HashMap<>();
	//	masashi.put("firstName","Masashi");
	//	masashi.put("lastName","Kobayashi");
	//	masashi.put("birthDate","1984-12-03");
	//	masashi.put("email","masashi@kobayashi.com");
	//	masashi.put("password","password");

	//	User createdUser = given().
	//					contentType(ContentType.JSON).
	//					body(masashi).
	//					when().
	//						post("http://localhost:8000/users").
	//					as(User.class);

	//	given().
	//					contentType("application/json").
	//					when().
	//					post("http://localhost:8000/user/" + createdUser.getId() + "/grant/" + Permission.LEVEL.ADMIN.toString()).
	//					then().
	//					statusCode(200).
	//					and().
	//					contentType(ContentType.JSON)
	//					.log().everything();
	//}

	///**
	// * HTTP POST /user/:id/revoke/:permission - revoke permission for a user
	// */
	//@Test
	//public void revokePermissionUserAndReturnHTTP200() {

	//	//Create User Data
	//	Map<String, String> masashi = new HashMap<>();
	//	masashi.put("firstName","Masashi");
	//	masashi.put("lastName","Kobayashi");
	//	masashi.put("birthDate","1984-12-03");
	//	masashi.put("email","masashi@kobayashi.com");
	//	masashi.put("password","password");

	//	//Create User
	//	User createdUser = given().
	//					contentType(ContentType.JSON).
	//					body(masashi).
	//					when().
	//					post("http://localhost:8000/users").
	//					as(User.class);

	//	// Grant User ADMIN permission.
	//	given().
	//					contentType("application/json").
	//					when().
	//					post("http://localhost:8000/user/" + createdUser.getId() + "/grant/" + Permission.LEVEL.ADMIN.toString()).
	//					then().
	//					statusCode(200).
	//					and().
	//					contentType(ContentType.JSON)
	//					.log().everything();

	//	// Check if User got ADMIN permission.
 	//	String id = createdUser.getId();
	//	String url = "http://localhost:8000/user/" + id;

	//	User retrievedUser = given().
	//					when().
	//					get(url).
	//					as(User.class);

	//	assertTrue(retrievedUser.getPermission().getPermittedLevel().compareTo(Permission.LEVEL.ADMIN) == 0);

	//	// Revoke User ADMIN permission.
	//	given().
	//					contentType("application/json").
	//					when().
	//					post("http://localhost:8000/user/" + createdUser.getId() + "/revoke/" + Permission.LEVEL.ADMIN.toString()).
	//					then().
	//					statusCode(200).
	//					and().
	//					contentType(ContentType.JSON)
	//					.log().everything();

	//	// Check if User lost ADMIN permission.
	//	retrievedUser = given().
	//					when().
	//					get(url).
	//					as(User.class);

	//	assertTrue(retrievedUser.getPermission() == null);
	//}
	///**
	// * HTTP GET /users/:familyName - search users by family name
	// */
	//@Test
	//public void findUserByFamilyNameAndReturnHTTP200() {

	//	//Create multiple users.

	//	Map<String, String> masashi = new HashMap<>();
	//	masashi.put("firstName","Masashi");
	//	masashi.put("lastName","Kobayashi");
	//	masashi.put("birthDate","1984-12-03");
	//	masashi.put("email","masashi@kobayashi.com");
	//	masashi.put("password","password");

	//	Map<String, String> ai = new HashMap<>();
	//	ai.put("firstName","Ai");
	//	ai.put("lastName","Sakai");
	//	ai.put("birthDate","1987-11-13");
	//	ai.put("email","ai@masashi.ca");
	//	ai.put("password","password");

	//	Map<String, String> seana = new HashMap<>();
	//	seana.put("firstName","Seana");
	//	seana.put("lastName","Kobayashi");
	//	seana.put("birthDate","2016-10-18");
	//	seana.put("email","seana@makeanart.com");
	//	seana.put("password","password");

	//	Map<String, String> zeno = new HashMap<>();
	//	zeno.put("firstName","Zeno");
	//	zeno.put("lastName","Kobayashi");
	//	zeno.put("birthDate","2020-01-01");
	//	zeno.put("email","zeno@makeanart.com");
	//	zeno.put("password","password");

	//	Map<String, String> toshi = new HashMap<>();
	//	toshi.put("firstName","Toshimitsu");
	//	toshi.put("lastName","Sakai");
	//	toshi.put("birthDate","2020-01-01");
	//	toshi.put("email","toshi@makeanart.com");
	//	toshi.put("password","password");

	//	Map<String, String> yuichi = new HashMap<>();
	//	yuichi.put("firstName","Yuiichi");
	//	yuichi.put("lastName","Sakai");
	//	yuichi.put("birthDate","2020-01-01");
	//	yuichi.put("email","yuichi@makeanart.com");
	//	yuichi.put("password","password");

	//	//Create HTTP Request and POST
	//	given().
	//					contentType("application/json").
	//					body(masashi).
	//					when().
	//					post("http://localhost:8000/users").
	//					then().
	//					statusCode(201).
	//					and().
	//					contentType(ContentType.JSON)
	//					.log().everything();

	//	given().
	//					contentType("application/json").
	//					body(ai).
	//					when().
	//					post("http://localhost:8000/users").
	//					then().
	//					statusCode(201).
	//					and().
	//					contentType(ContentType.JSON)
	//					.log().everything();

	//	given().
	//					contentType("application/json").
	//					body(seana).
	//					when().
	//					post("http://localhost:8000/users").
	//					then().
	//					statusCode(201).
	//					and().
	//					contentType(ContentType.JSON)
	//					.log().everything();

	//	given().
	//					contentType("application/json").
	//					body(zeno).
	//					when().
	//					post("http://localhost:8000/users").
	//					then().
	//					statusCode(201).
	//					and().
	//					contentType(ContentType.JSON)
	//					.log().everything();

	//	given().
	//					contentType("application/json").
	//					body(toshi).
	//					when().
	//					post("http://localhost:8000/users").
	//					then().
	//					statusCode(201).
	//					and().
	//					contentType(ContentType.JSON)
	//					.log().everything();

	//	given().
	//					contentType("application/json").
	//					body(yuichi).
	//					when().
	//					post("http://localhost:8000/users").
	//					then().
	//					statusCode(201).
	//					and().
	//					contentType(ContentType.JSON)
	//					.log().everything();

	//	String familyNameSakai = "Sakai";

	//	List<User> sakaiFamily = given().
	//					contentType("application/json").
	//					when().
	//					get("http://localhost:8000/users/" + familyNameSakai).
	//					then().
	//					extract().
	//					body().
	//					jsonPath().
	//					getList(".", User.class);

	//	assertTrue(sakaiFamily.size() == 3);

	//	String familyNameKobayashi = "Kobayashi";

	//	List<User> kobayashiFamily = given().
	//					contentType("application/json").
	//					when().
	//					get("http://localhost:8000/users/" + familyNameKobayashi).
	//					then().
	//					extract().
	//					body().
	//					jsonPath().
	//					getList(".", User.class);

	//	assertTrue(kobayashiFamily.size() == 3);

	//}
}
