package jsonContainer;

public class josncontain {
public static String CreateString()
{
	
	String s = "{\r\n"
			+ "\"dashboard\": {\r\n"
			+ "\"purchaseAmount\": 910,\r\n"
			+ "\"website\": \"www.google.com\"\r\n"
			+ "},\r\n"
			+ "\"courses\": [\r\n"
			+ "{\r\n"
			+ "\"title\": \"Selenium webdriver with java\",\r\n"
			+ "\"price\": 50,\r\n"
			+ "\"copies\": 6\r\n"
			+ "},\r\n"
			+ "{\r\n"
			+ "\"title\": \"RestAssured\",\r\n"
			+ "\"price\": 40,\r\n"
			+ "\"copies\": 4\r\n"
			+ "},\r\n"
			+ "{\r\n"
			+ "\"title\": \"BDD with cucumbber\",\r\n"
			+ "\"price\": 45,\r\n"
			+ "\"copies\": 10\r\n"
			+ "}\r\n"
			+ "]\r\n"
			+ "}";
	return s;
}
}
