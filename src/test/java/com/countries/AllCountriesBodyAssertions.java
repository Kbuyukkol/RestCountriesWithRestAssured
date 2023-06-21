package com.countries;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.get;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AllCountriesBodyAssertions {


    @Test
    public void allCountries() {

        baseURI = "https://restcountries.com/v3.1";

        Response response = get("/all");

        assertTrue(response.body().asString().contains("Brunei"));


    }
}
