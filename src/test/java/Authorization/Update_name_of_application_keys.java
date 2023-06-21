package Authorization;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Update_name_of_application_keys {
	private static final String  characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	public static void main(String[] args) {

		String randomString = generateRandomString(10);
		System.out.println(randomString);
	}
	public static String generateRandomString(int length) {
		Random random = new Random();
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<length; i++) {
			int randomindex = random.nextInt(characters.length());
			char randomchars =  characters.charAt(randomindex);
			sb.append(randomchars);
		}
		return sb.toString();}





	@Test()
	public static void application_keys() {

		RestAssured.baseURI="https://devspree.uncode.io";
		String bearerString = "v1TqP4yKupbqYc-2A_Adapenbf7Gd9iNEmXLxWAH3KI";
		Response res = given()
				.contentType(ContentType.JSON)
				.header("Authorization","Bearer " +bearerString)
				.body("{\r\n"
						+ "    \"oauth_application\": {\r\n"
						+ "        \"name\": "+RandomStringGenerator.generateRandomString(8)+"\"@gmail.com\"\r\n"
						+ "    }\r\n"
						+ "}")
				.when().put("/api/v2/apps/152").then().log().all().extract().response();








	}


}
