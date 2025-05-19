package api.day2;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DealingWithHeadersAndCookies {
	
	@Test
	public void dealingWithHeaders()
	{
		RestAssured.given()
		.when()
		.header("x-api-key","reqres-free-v1")
		.get("https://reqres.in/api/users/2")
		.then().header("Content-Type",Matchers.equalTo("application/json; charset=utf-8") );
		
		//Matchers.e
		
		//
	
	}
	
	@Test
	public void dealingWithCookies()
	{
//		RestAssured.given()
//		.when()
//		.header("x-api-key","reqres-free-v1")
//		.get("https://reqres.in/api/users/2")
//		.then().cookie();
		
		//Matchers.e
		
		//
		
		
	}
	
	@Test
	public void validateAll()
	{ 
		
		//STring https://reqres.in/
		RestAssured.given()
		.when()
		.header("x-api-key","reqres-free-v1")
		.get("https://reqres.in/api/users/2");
		
	//	Sysout("Hello world");
		
	
		//status code, body, header, cookie
		
	//	res.then().log().body();
	//	res.then().header(null, null)
	//	res.then().statusCode(0)
	//	res.then().body(null, null)
		 //Two (Matchers.lessThan(2l),TimeUnit.SECONDS)
	//	res.then().time(Matchers.lessThan(2l),TimeUnit.SECONDS);
	}
}
