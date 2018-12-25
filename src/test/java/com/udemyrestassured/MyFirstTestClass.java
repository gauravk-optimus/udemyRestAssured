package com.udemyrestassured;

import org.junit.Test;

import static io.restassured.RestAssured.*;
public class MyFirstTestClass extends TestConfig{
	@Test
	public void myFirstTest(){
		given().log().all().when().get("employees").then().statusCode(200);

	}
	
	@Test
	public void secondTest(){
		given().log().ifValidationFails().when().get("employees");
//		given().log().ifValidationFails().when().get("employees").then().log().all();
	}
}
