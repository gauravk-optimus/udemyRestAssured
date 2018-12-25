package com.udemyrestassured;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;

import org.junit.BeforeClass;

public class TestConfig{

	@BeforeClass
	public static void setup(){
		RestAssured.baseURI = "http://dummy.restapiexample.com";
//		RestAssured.port = 8080;
		RestAssured.basePath = "/api/v1/";
		RestAssured.requestSpecification = new RequestSpecBuilder().addHeader("Content-Type", "application/json").addHeader("Accept", "application/json").build();
		RestAssured.responseSpecification = new ResponseSpecBuilder().expectStatusCode(200).build();
	}
}
