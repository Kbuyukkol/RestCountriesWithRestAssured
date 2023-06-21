package com.countries;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

public class SingleCountryBodyAssertions_JsonToJava {


    @Test
    public void singleCountryPath() {

        baseURI = "https://restcountries.com/v3.1";

        Response response = given()
                .accept(ContentType.JSON)
                .pathParam("name", "peru")
                .when()
                .get("/name/{name}");





    }


}
