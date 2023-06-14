package User;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;
import pojo.user;

public class Endpont {
	
	
	public static Response createUser(user payload) {
		
	Response response = given()
			.contentType("application/json")
			.accept("application/json")
			.body(payload)
	        .when()
	        .post(to_main.xpath.Post_url);
	return response;
	}
public static Response getUser(String UserName)
{
	Response response = given()
			.pathParam("username", UserName)
			.when()
			.get(to_main.xpath.Get_url);
	return response;

}

public static Response updateUser(user payload, String UserName) {
	
	Response response = given()
			.contentType("application/json")
			.accept("application/json")
	        .when()
	        .put(to_main.xpath.put_url);
	return response;
	}

public static Response deleteUser(String UserName)
{
	Response response = given()
			.pathParam("username", UserName)
			.when()
			.delete(to_main.xpath.delete_url);
	return response;

}
}
