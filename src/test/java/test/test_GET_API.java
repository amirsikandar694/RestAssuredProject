package test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

public class test_GET_API {

	@Test
	public void test_Get() {

		given()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200).body("data[1].id", equalTo(8)).log().all();

	}

}
