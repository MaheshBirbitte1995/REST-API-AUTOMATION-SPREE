package rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class xdv {

	@Test
	public void createUser()
	{RestAssured.baseURI = "https://petstore.swagger.io/v2";
	
	RequestSpecification httprequest = RestAssured.given();
	
	httprequest.header("Content-Type", "application/json");
	
	httprequest.body("{\r\n"
			+ "  \"id\": 0,\r\n"
			+ "  \"username\": \"katraj22august\",\r\n"
			+ "  \"firstName\": \"UserTest\",\r\n"
			+ "  \"lastName\": \"QAEngg\",\r\n"
			+ "  \"email\": \"katraj22august@gmail.com\",\r\n"
			+ "  \"password\": \"Test@1234\",\r\n"
			+ "  \"phone\": \"1234567893\",\r\n"
			+ "  \"userStatus\": 0\r\n"
			+ "}");

	Response response = httprequest.request(Method.POST, "/user");

	String stringresponse = response.asPrettyString();

	System.out.println(stringresponse);
	
	int message = response.jsonPath().getInt("message");
	
	System.out.println(message);
	
		
		
	}


}
