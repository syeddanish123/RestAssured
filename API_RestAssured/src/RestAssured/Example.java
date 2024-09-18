package RestAssured;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Example {

	public static void main(String[] args) {
		
		JSONObject data=new JSONObject();
				
	   data.put("101","Shamsher");
	   data.put("102","Nadeem");	
	   data.put("103","Idhris");
	   
	   Response resp=RestAssured.given()
			                    .contentType(ContentType.JSON)
			                    .body(data.toJSONString())
			                    .post("https://reqres.in/api/users");
	   
	   int statusCode=resp.getStatusCode();
	   
	   ValidatableResponse a=resp.then().assertThat().statusCode(201);
	   
	    if(statusCode==201)
	    {
	    	System.out.println("Post Request Succesfull Done");
	    }
	    
	    else
	    {
	    	System.out.println("Post Request Succesfull Not Done");
	    }
	   
	}

}
