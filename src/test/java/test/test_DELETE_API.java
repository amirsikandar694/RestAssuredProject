package test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class test_DELETE_API {

	
	@Test
	public void test_Delete() {
		
		baseURI = "https://reqres.in/api";
		System.out.println("Delete");
		when()
		.delete("/users/2")
		.then()
		.statusCode(204).log().all();
	}

}
