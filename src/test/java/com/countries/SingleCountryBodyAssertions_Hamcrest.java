package com.countries;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class SingleCountryBodyAssertions_Hamcrest {


    @Test
    public void singleCountryPath() {

        baseURI = "https://restcountries.com/v3.1";

        given()
                .pathParam("name", "peru")
                .when()
                .get("/name/{name}")
                .then()
                .statusCode(200)
                .and().assertThat()
                .contentType("application/json")
                .and()
                .body("name.common", contains("Peru"),
                        ("name.official"), contains ("Republic of Peru"));


    }


}
