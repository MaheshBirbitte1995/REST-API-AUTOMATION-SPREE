package Complex;

import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class bdd_II {
	
	@Test
	public void A1()
	{String token = "0Wvt7nRhWXz6CVdQsDY8oOMv4LyplFAzMVeoOyafErw";
		RequestSpecification req = new  RequestSpecBuilder()
				
				.setBaseUri( "https://devspree.uncode.io").addHeader("Authorization", "Bearer"+token).build();
		
		RequestSpecification request = given().log().all().spec(req);
				
				
				
				
				
				
				ResponseSpecification res = new  ResponseSpecBuilder()
						.expectStatusCode(200).build();
				Response response = request.
				when()
				.get("/api/v2/platform/stores")
				.then().
				spec(res).log().all().extract().response();
	}

}
