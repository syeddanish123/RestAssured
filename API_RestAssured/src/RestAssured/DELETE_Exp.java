package RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DELETE_Exp {

	public static void main(String[] args) {
		
		Response resp = RestAssured.delete("https://reqres.in/api/users/2");
				int statuscode = resp.getStatusCode();
				System.out.println(statuscode);
				System.out.println(resp.getTime());
				System.out.println("====================");
				System.out.println(resp.asString());
				}

	}
