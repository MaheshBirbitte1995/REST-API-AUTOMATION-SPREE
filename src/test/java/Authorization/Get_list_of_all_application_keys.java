package Authorization;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class Get_list_of_all_application_keys {

	@Test()
	public void oauth() {
		RestAssured.baseURI="https://devspree.uncode.io";
		String bearerTokenString = "vjuFS_7xYqof9lE0hawM8s8cEvcK1PpzQPwy4Rr_lbM";

		Response res = given()
				.contentType(ContentType.JSON)
				.header("Authorization","Bearer " +bearerTokenString)

				
				.when()
				.get("/api/v2/apps").then().log().all().extract().response();



	}

}


