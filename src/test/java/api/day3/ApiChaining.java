package api.day3;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiChaining {
	
	int id;
	//CRUD Operations
	@Test(priority=1)
	public void createAuser()
	{
		HashMap<String,String> data=new HashMap<>();
		data.put("name", "Shoaibsheikh");
		data.put("job", "Tester");
		
		
		//am i send data-> json, html , text
		
		
		Response res=RestAssured
		.given()
		.header("x-api-key","reqres-free-v1")
		.body(data) 
		.contentType("application/json")
		.when()
		 .post("http://localhost:3000/users");
		//id test will genereta
	id=	res.jsonPath().getInt("id");
	
	System.out.println("This is id"+id);
	}
	
	@Test(priority=2)
	public void readUser()
	{  
		
		RestAssured.given()
		.when()
		.get("http://localhost:3000/users/48")
		.then().log().body();
	}
	
	@Test(priority=3)
	public void deleteUser()
	{
		//5

		RestAssured.given()
		.when()
		.delete("http://localhost:3000/users/"+id)
		.then().log().body();
	}

}
