package com.countries;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.get;
import static org.junit.jupiter.api.Assertions.*;

public class AllCountriesHeaderAssertions {


    @Test
    public void allCountries() {

        baseURI = "https://restcountries.com/v3.1";

        Response response = get("/all");

        assertEquals("gzip",response.getHeader("content-encoding"));

        assertEquals("170880",response.getHeader("content-length"));

        assertEquals("Keep-Alive",response.getHeader("Connection"));

        System.out.println("response.header(\"Date\") = " + response.header("Date"));

        System.out.println("response.header(\"Server\") = " + response.header("Server"));

        assertTrue(response.headers().hasHeaderWithName("Connection"));



    }
}
