package ReactApp;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import  io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CRUD_WithoutBDD {
//	@Test
public void get() {
	Response resp = RestAssured.get("http://localhost:8084/projects");
	System.out.println(resp.getBody());
	System.out.println(resp.statusCode());
	System.out.println(resp.asPrettyString());
	System.out.println(resp.asString());
	
	}
@Test
public void post() {
	
//prerequest 
	JSONObject obj = new JSONObject();
	obj.put("createdBy", "Str");
	obj.put("projectName", "Flypen");
	obj.put("status", "ongoing");
	obj.put("teamSize", 10);
	

	//Response req = RestAssured.post("http://localhost:8084/addProject");

	 
	
	
}




}
