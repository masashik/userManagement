package com.masashik.app;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class UserManagementAppTest {
  /**
   * 		 * 	- add user
   * 		 * 	- remove user
   * 		 * 	- get single user
   * 		 * 	- grant permission for a user
   * 		 * 	- revoke permission for a user
   * 		 * 	- search users by family name
   */

//  private Server server;
//
//  @Before
//  public void setupAndStartJetty() throws Exception {
//    server = new Server(8000);
//    ServletContextHandler context = new ServletContextHandler();
//    ServletHolder defaultServ = new ServletHolder("default", DefaultServlet.class);
//    defaultServ.setInitParameter("resourceBase",System.getProperty("user.dir"));
//    defaultServ.setInitParameter("dirAllowed","true");
//    context.addServlet(defaultServ,"/");
//    server.setHandler(context);
//    server.start();
//  }
//
//  @After
//  public void stopJetty() {
//    try {
//      server.stop();
//    } catch (Exception e) {
//      e.printStackTrace();
//    }
//  }

  @Test
  public void getAllUser() {
    given().
    when().
      get("http://localhost:8000/users").
    then().
      statusCode(200).
    and().
      contentType(ContentType.JSON)
    .log().everything();
  }
}
