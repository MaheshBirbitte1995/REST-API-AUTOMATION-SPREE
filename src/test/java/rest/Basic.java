package rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Basic {
	
	@Test
	public void Getall()
	{
		RestAssured.baseURI="https://reqres.in"
				;
		RequestSpecification req = RestAssured.given();
		Response response = req.request(Method.GET,"/api/users?page=2");
System.out.println(response);
		
	}
	@Test
	public void get ()
	{
		RestAssured.baseURI = "https://reqres.in";
		
		RequestSpecification req = RestAssured.given();
		Response response = req.request(Method.GET, "/api/users/2");
		System.out.println(response.asPrettyString());
		 int code = response.getStatusCode();
		 System.out.println(code);
		
		
	}

}
