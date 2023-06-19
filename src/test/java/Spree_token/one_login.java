package Spree_token;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import  static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class one_login {
	
	public String email_login;
	@Test
	public void loginApi()
	{

		RestAssured.baseURI = "https://devspree.uncode.io";
	                 

		 
		 
		 Response r = given().contentType(ContentType.JSON)
				 .body("{\r\n"
				 		+ "    \"user\":\r\n"
				 		+ "     {\r\n"
				 		+ "        \"email\": \"User20041161kjgj1saihhh1@gmail.com\",\r\n"
				 		+ "        \"password\": \"123456\",\r\n"
				 		+ "        \"password_confirmation\": \"123456\",\r\n"
				 		+ "        \"name\": \"User111saihhh200kjgkjg1416\",\r\n"
				 		+ "        \"industry_type\": \"Small industry\"\r\n"
				 		+ "    }\r\n"
				 		+ "}")
				 .when()
				 .post("/api/v2/registrations")
				 .then()
				.log().all().extract().response();
		
		JsonPath jsonpath = r.jsonPath();
 email_login = jsonpath.getString("email");
	System.out.println("Email is "+email_login);
		
	}

}
