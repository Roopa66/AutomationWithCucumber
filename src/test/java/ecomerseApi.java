import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import pojo.LoginRequest;
import pojo.LoginResponse;

import org.testng.annotations.Test;

import com.aventstack.extentreports.gherkin.model.Given;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class ecomerseApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com/")
				.setContentType(ContentType.JSON).build();
		LoginResponse loginResponse=new LoginResponse();
		LoginRequest loginRequest= new LoginRequest();
		loginRequest.setUserEmail("yrupa1839@gmail.com");
		loginRequest.setUserPassword("Roopa11@#$");
		
		RequestSpecification reqLogin=given().spec(req).body(loginRequest);
		
		when().post("/api/ecom/auth/login").then().extract().response().as(LoginResponse.class);
		
		System.out.println(loginResponse.getMessage());
		System.out.println(loginResponse.getToken());
		System.out.println(loginResponse.getUserId());
	}

}
