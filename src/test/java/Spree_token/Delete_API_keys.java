package Spree_token;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
   

 import static io.restassured.RestAssured.given;
public class Delete_API_keys {

	
	
	@Test()
	public void DeleteAPIKeys()
	{
		RestAssured.baseURI ="https://devspree.uncode.io";
		String bearerTokenString = "nRUC23uBw37NXjJWd9G-uz1fQpUhUV_IIC8QmP37hao";
		Response res = given()
				       .contentType(ContentType.JSON)
				       .header("Authorization","bearer" +bearerTokenString)
				       .when()
				       .delete("/api/v2/apps/80").then()
				       .log().all().extract().response();
	}
	
}
