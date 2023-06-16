package Spree_token;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class regrat_get {
	@Test
	public void grey()
	
	{
		RestAssured.baseURI="https://s01w01.scocu.net";
		 JSONObject data = new JSONObject();
String bearerToken="ySi-iF2MuE7x44r8HrEhLhvqkkxjY7C6sxUKUSOGIFo";
		  data.put("store_id", 23);
		Response response = given()
				.header("Authorization","Bearer"+bearerToken)
			.body(data.toString()) .when()
				.get("/api/v2/platform/roles")
				.then().log().all().extract().response();
		
	}

}
