package api.day2;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidateBody {
	
	@Test
	public void validateBody()
	{
		//STring https://reqres.in/
			Response res=	RestAssured.given()
				.when()
				.header("x-api-key","reqres-free-v1")
				.get("https://reqres.in/api/users/2");
				
				//statusCode()
			
			res.then().log().body();
			res.then().body("data.email", Matchers.equalTo("janet.weaver@reqres.in"));
				
		// 1. Sdet pwan api Testin 9 videos  		
	}

}
