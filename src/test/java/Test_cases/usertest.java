package Test_cases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import User.Endpont;
import io.restassured.response.Response;
import pojo.user;

public class usertest {

	Faker faker;
	user userpayload;
	 @BeforeClass
	 
	 public void daTa()
	 {
		 faker = new Faker();
		 userpayload = new user();
		   
		 userpayload.setId(faker.idNumber().hashCode());
		 userpayload.setFirstName(faker.name().firstName());
		 userpayload.setUsername(faker.name().username());
		 userpayload.setLastName(faker.name().lastName());
		 userpayload.setEmail(faker.internet().safeEmailAddress());
		 userpayload.setPassword(faker.internet().password(1, 6));
		 userpayload.setPhone(faker.phoneNumber().cellPhone());
		 
	 } 
	 @Test
	 public void CreatePost()
	 {
		 Response response = Endpont.createUser(userpayload).then().log().all().extract().response();
	 }
	 
	 @Test
	 public void Getget()
	 {
	Response response = Endpont.getUser(userpayload.getUsername()).then().log().all().extract().response();
	 }
}
