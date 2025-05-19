package api.day3;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

public class JsonSchema1 {

	@Test
	public void getAllStudent()
	{
	  //given()
		//preconditon . auth, data
	  //when()
		 //type of request , put, post, delete,
	  //then()
		//validate the result
		
		Response res=RestAssured.given()
		.header("x-api-key","reqres-free-v1")
		.when()
		.get("https://reqres.in/api/users?page=2");
		res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("myschema.json"));
	}
}
