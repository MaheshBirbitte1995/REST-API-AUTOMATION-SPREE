package Complex;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;

public class BDD_get {
	
	@Test
	public void get()
	{
		 String bearerToken = "2-SWqdieiijIQSZION5XiY3Afr0hPbtgTlbJCwm9xE8";
		RestAssured.baseURI =  "https://devspree.uncode.io";
		 Response response =  given()
				

		 
		     .header("Authorization", "Bearer " + bearerToken)
				. when()
				 .get("/api/v2/platform/stores")
				 .then()
				 .log().all().extract().response();
	
		 String pretty = response.asPrettyString();
		   
		 System.out.println(pretty);
	
	}

}
