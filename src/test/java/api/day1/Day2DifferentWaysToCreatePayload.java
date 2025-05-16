package api.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Day2DifferentWaysToCreatePayload {
	
	//1. HashMap
	//2. JsonObject
	//3. POJO(java )
	//4. External File 
	
	@Test
	public void test1()
	{
//		JSONObject data =new JSONObject();
//		data.put("name", "msyx");
//		data.put("job", "leaderABCE");
//		
//		HashMap<String,String> data=new HashMap<>();
//		data.put("name", "morpheus");
//		data.put("job", "leader");
		
		// data--> data.toString();
		
		User data=new User();
//		data.setName("Shaoib");
//		data.setJob("Devops");
		data.name="Shaoib";
		data.job="tester";
		RestAssured
		.given()
		.contentType("application/json")
		.header("x-api-key","reqres-free-v1")
		.body(data) //json-> covert it 
		.when()
		 .post("https://reqres.in/api/users")
		.then().log().body();
	}
	
	/*
	 * {
    "name": "morpheus",
    "job": "leader"
}*/
	
	
	@Test
	public void readExternalFile() throws FileNotFoundException
	{
		//1. Location of File
		//2.Conection /read the file
		//3. JSONTokerner
		//4.JSONObect
		
		File file=new File("./body.json");
		FileReader fr=new FileReader(file);
		JSONTokener jt=new JSONTokener(fr);
		JSONObject jo=new JSONObject(jt);
		
		RestAssured
		.given()
		.contentType("application/json")
		.header("x-api-key","reqres-free-v1")
		.body(jo.toString()) //json-> covert it 
		.when()
		 .post("https://reqres.in/api/users")
		.then().log().body();
		
		
				
	}

}
