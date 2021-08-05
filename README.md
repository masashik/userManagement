# REST API endpoints that manages users and associated permissions.

## Requirements
 
1. A user should have at least the following attributes:
   - family name
   - given name
   - birthdate
   - email
   - password

2. A user's permission should have at least the following attributes:
   - type
   - granted date
  
3. The API should provide the endpoints to satisfy at least the following functional requirements:
   - list all users
   - add user
   - remove user
   - get single user
   - grant permission for a user
   - revoke permission for a user
   - <mark>search users by family name <– this will be a stretch goal</mark>

*Please keep in mind that the purpose is not solely to provide a working solution. We are looking for you to demonstrate the principles and practices you  feel are important in software engineering: dependency management, testing, project structure, data modelling, etc.

## Environment

- Run the API App as JVM
	- Java 11
	- Maven ver 3.8.1

- Run the API App as container process by Docker
	- Docker runtime

			docker build -t usermanagement:v1 .
			docker run -d -p 8000:8000 usermanagement:v1

## Get Started

 - Usage to launch the API server(Jetty)

		$ gh repo clone masashik/userManagement
		$ cd userManagement/userManagement
		$ mvn clean compile test exec:java

		The API server is running at port 8000.

 - Available API endpoints

    	HTTP GET    /users - List all users
    	HTTP POST   /users - Add new user
    	HTTP DELETE /users - Remove single user
    	HTTP GET    /user/:id - Get single user
    	HTTP POST   /user/:id/grant/:permission - Grant permission for a user
    	HTTP POST   /user/:id/revoke/:permission - Revoke permission from a user
    	HTTP GET    /users/:familyName - List all users containing the family name

 - Dependency management 

 		Apache Maven is used for managing dependent resources.

- Testing

	- Unit Test
	- Integration Test
	- End-to-end Test

 - Data modelling

 	- User
 	- Permission

 - Project structure

    	 ~/userManagement/ <-- Store project related files
    	├── LICENSE
    	├── README.md
    	└── userManagement <-- Store project specific files
    	    ├── pom.xml
    	    └── src
    	        ├── main
    	        │   └── java
    	        │       └── com
    	        │           └── masashik
    	        │               └── app
    	        │                   ├── MainApp.java
    	        │                   ├── Response.java
    	        │                   ├── StatusResponse.java
    	        │                   ├── controllers
    	        │                   │   └── UserController.java
    	        │                   ├── exceptions
    	        │                   ├── filters
    	        │                   │   └── JsonParsingFilter.java
    	        │                   ├── models
    	        │                   │   ├── Permission.java
    	        │                   │   └── User.java
    	        │                   ├── services
    	        │                   │   ├── UserService.java
    	        │                   │   └── UserServiceImpl.java
    	        │                   └── transformers
    	        │                       └── JsonResponseTransformer.java
    	        └── test
    	            └── java
    	                └── com
    	                    └── masashik
    	                        └── app
    	                            └── AppTest.java


### TODO

- [ ] Create develop and feature branch for gitflow
- [ ] Develop test case for unit, integration, and end-to-end (regression)
- [ ] Containerize the API App.
- [ ] Enable logging for service health observability
- [ ] JWT based API endpoints protection
- [ ] Rate limiting for service availability
- [ ] Resilience handling by circuit breaker
