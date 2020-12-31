package test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Example {
	
	@Test
	public void example()
	{
	Response response=RestAssured.get("https://reqres.in/api/users?page=2");
	System.out.println(response.getBody().asPrettyString());
	System.out.println(response.getTime());
	System.out.println(response.getStatusCode());
	}

}
