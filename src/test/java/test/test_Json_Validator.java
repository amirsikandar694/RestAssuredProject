package test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

public class test_Json_Validator {

	@Test
	public void test_JsonValidator() {

		given()
			.get("https://reqres.in/api/users?page=2")
		.then()
		.assertThat().body(matchesJsonSchemaInClasspath("schema.json"))
			.statusCode(200).body("data[1].id", equalTo(8)).log().all();

	}

}
