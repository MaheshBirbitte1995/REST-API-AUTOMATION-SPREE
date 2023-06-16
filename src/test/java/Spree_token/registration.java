package Spree_token;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.storepolo;
public class registration {
	
	
	
	
	
	
	Faker faker;
	
	 storepolo userpayload;
	 
	 @BeforeClass
	 public void date ()
	 {

			
	 }
	@Test
	public void get()
	{
		
		
		RestAssured.baseURI = "https://devspree.uncode.io";
	                 

		 String   bearerToken = "ySi-iF2MuE7x44r8HrEhLhvqkkxjY7C6sxUKUSOGIFo";
		 JSONObject data = new JSONObject();

		  data.put("store_id", 23);
		 
		  JSONObject detail = new JSONObject();
		    data.put("role", detail);
		    
		    detail.put("name", "sai");
		
		
		    RestAssured
	        .given()
	               .contentType(ContentType.JSON)
	               .header("Authorization", "Bearer " + bearerToken)
	               .body(data.toString())
	               .body(detail.toString())
	               .when()
	               .post("/api/v2/platform/roles").then()
	               
	               .log().all();
	
		      
				
	}
}
