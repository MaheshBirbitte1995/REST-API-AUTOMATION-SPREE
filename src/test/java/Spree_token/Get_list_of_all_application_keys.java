package Spree_token;

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
        String bearerTokenString = "nRUC23uBw37NXjJWd9G-uz1fQpUhUV_IIC8QmP37hao";
        
        Response res = given()
        		                   .contentType(ContentType.JSON)
        		                   .header("Authorization","bearer" +bearerTokenString)
        		                   .when()
        		                   .get("/api/v2/apps").then()
        		                  .log().all().extract().response();
        
        
        		                   
        		                   
       
       
       }

}


