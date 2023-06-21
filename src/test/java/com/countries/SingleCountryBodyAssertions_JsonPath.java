package com.countries;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class SingleCountryBodyAssertions_JsonPath {


    @Test
    public void singleCountryPath() {

        baseURI = "https://restcountries.com/v3.1";

        Response response = given()
                .accept(ContentType.JSON)
                .and()
                .pathParam("name", "peru")
                .when()
                .get("/name/{name}");

        //response.prettyPrint();


        JsonPath jsonPath = response.jsonPath();

        System.out.println(jsonPath.getString("name"));
        System.out.println(jsonPath.getString("name.common"));
        System.out.println(jsonPath.getString("name.official"));
        System.out.println(jsonPath.getString("name.nativeName"));


    }




}
