package RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET_Exp {

	public static void main(String args[])
	{
		
	//----------------- GET Request Example below ----------------------	
		
		Response rep=RestAssured.get("https://reqres.in/api/users");
		
		int StatusCode=rep.getStatusCode();
		System.out.println(StatusCode);
		System.out.println(rep.then());
		System.out.println(rep.getHeader("Etag"));
		
	//-------------------------------------------------------------------


	System.out.println("I done the chages here ---Danish");
        System.out.println("I Third the chages here ---Danish");
		
	}
	
}
