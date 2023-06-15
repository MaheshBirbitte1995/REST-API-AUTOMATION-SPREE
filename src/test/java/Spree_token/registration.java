package Spree_token;

import static io.restassured.RestAssured.given;

import java.util.regex.Matcher;

import  static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
public class registration {
	
	@Test
	public void get()
	{
		
		RestAssured.baseURI = "https://devspree.uncode.io";
	                 

		 String   bearerToken = "bN1EXvd21bjLBbODML0lAGMGPALVO9ROBx1JFVbDw94";
		 JSONObject requestParams = new JSONObject();
		Response response = given()
				
				.header("Authorization", "Bearer " + bearerToken)
				
			//	.body(requestParams.put(bearerToken, requestParams)))
				
				
.body(conttt.go()).when()
				.post("/api/v2/platform/roles")
				.then()
				.log().all().extract().response();
		      
				
	}

}
