package Practise;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Templates {
@Test
void getWeatherCondition() {
	//specify the url
	RestAssured rs = new RestAssured();
	rs.baseURI="http://restapi.demoqa.com/utilities/weather/city";
	//without request we not get response 
	RequestSpecification requst = rs.given();
	// rresponse come now
	Response resp = requst.request(Method.GET,"/Hydrabad");
	//print this response 
	String body = resp.getBody().asString();
	String all = resp.prettyPrint();
	resp.statusCode();
	
}
}
