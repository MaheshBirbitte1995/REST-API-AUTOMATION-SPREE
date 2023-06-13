package rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BasicPost {
	@Test
	public void post1()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		RequestSpecification req =RestAssured.given();
		req.header("Content-Type","application/json");
		
		
		
		
		req.body("{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"username\": \"string\",\r\n"
				+ "  \"firstName\": \"string\",\r\n"
				+ "  \"lastName\": \"string\",\r\n"
				+ "  \"email\": \"string\",\r\n"
				+ "  \"password\": \"string\",\r\n"
				+ "  \"phone\": \"string\",\r\n"
				+ "  \"userStatus\": 0\r\n"
				+ "}");
		Response response = req.request(Method.POST,"/user");
		
		String code = response.asPrettyString();
		System.out.println(code);
		

		
	}
	

}
