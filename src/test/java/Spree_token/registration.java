package Spree_token;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
public class registration {
	
	@Test
	public void get()
	{
		
		RestAssured.baseURI = "https://devspree.uncode.io";
	                 

		 String   bearerToken = "oXyIFHtas9SVi4eSSVzEuxqlfjlqagjAAhbHm0AhbkE";
		 JSONObject requestParams = new JSONObject();
		Response response = given()
				
				.header("Authorization", "Bearer " + bearerToken)
			//	.body(requestParams.put(bearerToken, requestParams))
				.body("\r\n"
						+ "    \"store_id\": \"23\",\r\n")
.body("{\r\n"
		
		+ "\r\n"
		+ "    \"store_id\": \"23\",\r\n"
		+ "\r\n"
		+ "    \"tax_rate\": {\r\n"
		+ "\r\n"
		+ "        \"amount\": 0.05,\r\n"
		+ "\r\n"
		+ "        \"zone_id\": \"2\",\r\n"
		+ "\r\n"
		+ "        \"tax_category_id\": \"1\",\r\n"
		+ "\r\n"
		+ "        \"included_in_price\": true,\r\n"
		+ "\r\n"
		+ "        \"name\": \"California\",\r\n"
		+ "\r\n"
		+ "        \"show_rate_in_label\": false,\r\n"
		+ "\r\n"
		+ "        \"calculator_attributes\": {\r\n"
		+ "\r\n"
		+ "            \"type\": \"Spree::Calculator::FlatRate\",\r\n"
		+ "\r\n"
		+ "            \"preferences\": {\r\n"
		+ "\r\n"
		+ "                \"amount\": 0,\r\n"
		+ "\r\n"
		+ "                \"currency\": \"USD\"\r\n"
		+ "\r\n"
		+ "            }\r\n"
		+ "\r\n"
		+ "        }\r\n"
		+ "\r\n"
		+ "    }\r\n"
		+ "\r\n"
		+ "}")
				.when()
				.post("/api/v2/platform/tax_rates")
				.then()
				.log().all().extract().response();
		      
				
	}

}
