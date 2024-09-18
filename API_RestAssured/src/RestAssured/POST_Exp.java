package RestAssured;

import org.json.simple.JSONObject;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POST_Exp {

	public static void main(String[] args) {
		
		JSONObject data = new JSONObject();
		data.put("101", "suresh");
		data.put("102", "aaaa");
		Response resp = RestAssured.given()
		                           .contentType(ContentType.JSON)
		                           .body(data.toJSONString())
		                           .post("https://reqres.in/api/users");		
		
		int statuscode = resp.getStatusCode();
		System.out.println(statuscode);
		System.out.println(resp.getTime());
		System.out.println("========================");
		System.out.println(resp.asString());
		}

	}
