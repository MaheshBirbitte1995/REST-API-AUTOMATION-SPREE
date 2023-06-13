package Complex;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class post {
	
	
  @Test
  public void postassret()
  {
	  RestAssured.baseURI="https://petstore.swagger.io/v2";
	  RequestSpecification req = RestAssured.given();
	  req.header("Content-type","application/json");
	  req.body("{\r\n"
	  		+ "  \"id\": 0,\r\n"
	  		+ "  \"username\": \"Saigaurav\",\r\n"
	  		+ "  \"firstName\": \"string\",\r\n"
	  		+ "  \"lastName\": \"string\",\r\n"
	  		+ "  \"email\": \"string\",\r\n"
	  		+ "  \"password\": \"string\",\r\n"
	  		+ "  \"phone\": \"string\",\r\n"
	  		+ "  \"userStatus\": 0\r\n"
	  		+ "}");
	  Response response = req.request(Method.POST,"/user");
	  System.out.println(response.asPrettyString());
	  
	 String message = response.jsonPath().getString("type");
		
		System.out.println(message);
	  
	  
  }
  @Test
  public void check()
  {
	  RestAssured.baseURI="https://petstore.swagger.io/v2";
	  RequestSpecification req = RestAssured.given();
	  Response response = req.request(Method.GET,"/user/Saigaurav");
	  System.out.println(response.asPrettyString());
	  String user= response.jsonPath().getString("username");
	  System.out.println(user);
  }
}
