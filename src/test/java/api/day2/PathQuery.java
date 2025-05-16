package api.day2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PathQuery {
	
	@Test
	public void pathParmaters()
	{
		//https://reqres.in/api/users/2
		int id=3;
		RestAssured.given()
		.pathParam("id", id)
		.when()
		.header("x-api-key","reqres-free-v1")
		.get("https://reqres.in/api/users/{id}")
		.then().log().body();
	}
	
	// ? question , query parameter
	
	@Test
	public void queryParameter()
	{ 
		
		//https://reqres.in/api/users?page=2
		int p=3;
		RestAssured.given()
		.queryParam("page", p)
		.when()
		.header("x-api-key","reqres-free-v1")
		.get("https://reqres.in/api/users")
		.then().log().all();
	}

}
