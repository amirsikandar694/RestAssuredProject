package test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class test_POST_API {

	@Test
	public void test_Post() {
		
		//Map<String,Object>map=new HashMap<String,Object>();

		JSONObject request = new JSONObject();
		request.put("name","Amir");
		request.put("job", "Engg");
		System.out.println(request);
		baseURI = "https://reqres.in/api";
		given()
		.body(request.toJSONString()).
		when()
		.post("/users")
		.then()
		.statusCode(201).log().all();
	}

}
