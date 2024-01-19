package Spree_token;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;  

import static io.restassured.RestAssured.*;

public class access_token_to_hit_the_platform_API {
	static String client_uid  = "hA_1mLXkmKLYydwM22aJX4glMQpJVZYwS37B9vEwxD0";
	static String client_secret_uid ="cAgstyhzxXzH2N5R-3zGPLmjrMHqq-cjePGh9zDqHi0";

	@Test()


	public void platform_API() {


		RestAssured.baseURI="https://devspree.uncode.io";
		//String bearerToken ="nRUC23uBw37NXjJWd9G-uz1fQpUhUV_IIC8QmP37hao";                           	     
		Response res = given()
				.contentType(ContentType.JSON)
				//.header("Authorization","bearerToken" +bearerToken)

				.body("{\r\n"	
						+" \"grantType\" : \"client_credentials\"\r\n\""
						+ "\"client_id \" : \""+client_uid+"\"\r\n\""
						+ "\"client_secret\" : \""+client_secret_uid+"\"\r\n\""
						+ "\"scope\" : \"admin\"\r\n\""
						+ "  }")

				.when().post("/spree_oauth/token").then().log().all().extract().response();

	}


}
