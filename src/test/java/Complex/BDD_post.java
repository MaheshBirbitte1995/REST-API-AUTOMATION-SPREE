package Complex;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;

public class BDD_post {
	
	@Test
	public void get()
	{
		 String bearerToken = "sBTXpWAwv1Ijyb2ae2Ec6udsNhWj0lFtJO9cCHm3-K8";
		RestAssured.baseURI =  "https://s01w01.scocu.net";
		 Response response =  given()
				
.header("Access_key","")
.header("Account_id","3821027156216750")
.header("Application_id","3821029521524677")
.header("controller_id","1685961858547150")
.header("prd_id","1685353824540404") 
.header("Authorization", "Bearer " + bearerToken)
.body("{\r\n"
		+ "    \"bu_id\": \"39a8\",\r\n"
		+ "    \"name\": \"Storeaaadtrg3\",\r\n"
		+ "    \"description\": \"hyd\",\r\n"
		+ "    \"address\": \"hyad\",\r\n"
		+ "    \"location\": \"hyd\",\r\n"
		+ "    \"is_enabled_business_hours\": \"\",\r\n"
		+ "    \"business_hours_id\": \"\",\r\n"
		+ "    \"stripe_account_id\": \"\",\r\n"
		+ "    \"approval_code\": \"\",\r\n"
		+ "    \"channel_setting_id\": \"\",\r\n"
		+ "    \"data\": {\r\n"
		+ "        \"store\": {\r\n"
		+ "            \"name\": \"Store3\",\r\n"
		+ "            \"code\": \"Tstommlskre249547485\",\r\n"
		+ "            \"mail_from_address\": \"no-reply1@example.com\",\r\n"
		+ "            \"customer_support_email\": \"support1@example.com\",\r\n"
		+ "            \"new_order_notifications_email\": \"\",\r\n"
		+ "            \"default_currency\": \"USD\",\r\n"
		+ "            \"supported_currencies\": [\r\n"
		+ "                \"\",\r\n"
		+ "                \"CAD\",\r\n"
		+ "                \"CDF\"\r\n"
		+ "            ],\r\n"
		+ "            \"checkout_zone_id\": \"\",\r\n"
		+ "            \"default_country_id\": \"793\",\r\n"
		+ "            \"default_locale\": \"EN\",\r\n"
		+ "            \"supported_locales\": [\r\n"
		+ "                \"\",\r\n"
		+ "                \"fr\",\r\n"
		+ "                \"en\"\r\n"
		+ "            ],\r\n"
		+ "            \"digital_asset_authorized_clicks\": \"5\",\r\n"
		+ "            \"limit_digital_download_count\": \"1\",\r\n"
		+ "            \"digital_asset_authorized_days\": \"7\",\r\n"
		+ "            \"limit_digital_download_days\": \"1\",\r\n"
		+ "            \"digital_asset_link_expire_time\": \"300\",\r\n"
		+ "            \"seo_title\": \"Spree Commerce Demo Shop\",\r\n"
		+ "            \"meta_description\": \"This is the new Spree UX DEMO | OVERVIEW: http://bit.ly/new-spree-ux | DOCS: http://bit.ly/spree-ux-customization-docs | CONTACT: https://spreecommerce.org/contact/\",\r\n"
		+ "            \"meta_keywords\": \"[FILTERED]\",\r\n"
		+ "            \"seo_robots\": \"\",\r\n"
		+ "            \"facebook\": \"spreecommerce\",\r\n"
		+ "            \"twitter\": \"spreecommerce\",\r\n"
		+ "            \"instagram\": \"spreecommerce\",\r\n"
		+ "            \"description\": \"hyd\",\r\n"
		+ "            \"address\": \"hyd\",\r\n"
		+ "            \"contact_phone\": \"\"\r\n"
		+ "        }\r\n"
		+ "    }\r\n"
		+ "}")			

. when()
				 .post("/api/v1/service_contract/3821312346153666\r\n"
				 		+ "")
				 .then()
				 .log().all().extract().response();
	
		 String pretty = response.asPrettyString();
		   
		 System.out.println(pretty);
	
	}

}
