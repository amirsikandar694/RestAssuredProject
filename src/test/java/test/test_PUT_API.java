package test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class test_PUT_API {

	@Test
	public void test_Put() {
		
		JSONObject request = new JSONObject();
		request.put("name","Amir");
		request.put("job", "Engg");
		System.out.println(request);
		baseURI = "https://reqres.in/api";
		given()
		.body(request.toJSONString()).
		when()
		.put("/users/2")
		.then()
		.statusCode(200).log().all();
	}

}
