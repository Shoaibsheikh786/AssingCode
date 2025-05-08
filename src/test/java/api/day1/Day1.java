package api.day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Day1 {
	
	//post 
	//put
	//get 
	//delete
	
	@Test
	public void getAllStudent()
	{
	  //given()
		//preconditon . auth, data
	  //when()
		 //type of request , put, post, delete,
	  //then()
		//validate the result
		
		RestAssured.given()
		
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then().log().all();
	}

}
