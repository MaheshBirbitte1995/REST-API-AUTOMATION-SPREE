package Complex;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import jsonContainer.josncontain;

import static io.restassured.RestAssured.*;

public class Postpp {
	
	@Test
	public void BDD()
	{
		
		RestAssured .baseURI = "https://petstore.swagger.io/v2";
		Response response = given()
			          .header("Content-Type", "application/json")
			          .when()
			          .body(josncontain.CreateString())
			          .post("/user")
			          .then()
			          .log()
			          .all()
			          .extract()
			          .response();
		System.out.println(response);
		
	}

}
