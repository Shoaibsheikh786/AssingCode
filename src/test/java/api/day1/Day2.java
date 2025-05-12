package api.day1;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Day2 {
 
	@Test
	public void getAllStudents()
	{
     /*given()
      * -> pre-condition -> data(payload), authentication, type of payload
      * .when()
      * ->Type-> get post put delete
      * .then();
      *  ->validation, status , reposnse body,print/log*/
		//all-> cookies , body, headers
		
		//i want to print/log the response
		
		RestAssured.given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then().log().body();
	}
	/*
	 * {
    "name": "morpheus",
    "job": "leader"
}*/
	
	//post Request
	@Test
	public void createUser()
	{  
		//1.create the data 
		//-> HashMap<String,String> 
		
		HashMap<String,String> data=new HashMap<>();
		data.put("name", "morpheus");
		data.put("job", "leader");
		
		
		//am i send data-> json, html , text
		
		
		RestAssured
		.given()
		.header("x-api-key","reqres-free-v1")
		.body(data.toString()) 
		.contentType("application/json")
		.when()
		 .post("https://reqres.in/api/users")
		.then().statusCode(201);
	}
	
	@Test
	public void updateUser()
	{
		HashMap<String,String> data=new HashMap<>();
		data.put("name", "morpheus");
		data.put("job", "Tester");
		
		
		//am i send data-> json, html , text
		
		
		RestAssured
		.given()
		.header("x-api-key","reqres-free-v1")
		.body(data) 
		.contentType(ContentType.JSON)
		.when()
		 .put("https://reqres.in/api/users/2")
		.then().statusCode(200);
	}
	
	@Test
	public void deleteUser()
	{
		//we don't need any payload
		
		RestAssured.given()
		.header("x-api-key","reqres-free-v1")
		.when()
		.delete("https://reqres.in/api/users/2")
		.then().statusCode(204);
	}
	
	
}
