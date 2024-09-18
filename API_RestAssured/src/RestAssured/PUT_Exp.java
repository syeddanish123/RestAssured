package RestAssured;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class PUT_Exp {

	public static void main(String[] args) {
		
		JSONObject data = new JSONObject();
		data.put("101", "ksuresh");
		data.put("102", "aaaa");
		Response resp = RestAssured.given()
		                           .contentType(ContentType.JSON)
		                           .body(data.toJSONString())
		                           .put("https://reqres.in/api/users/2");
		int statuscode = resp.getStatusCode();
		System.out.println(statuscode);
		System.out.println(resp.getTime());
		System.out.println("========================");
		System.out.println(resp.asString());
		}
	
	}
