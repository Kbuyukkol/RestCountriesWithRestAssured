package com.countries;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class AllCountriesAssertions {


    @Test
    public void allCountries() {

        baseURI = "https://restcountries.com/v3.1";

        Response response = get("/all");

        assertEquals(200, response.statusCode());

        assertEquals("application/json", response.contentType());



    }
}
