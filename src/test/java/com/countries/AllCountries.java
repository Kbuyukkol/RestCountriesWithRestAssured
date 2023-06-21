package com.countries;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class AllCountries {

    String url = "https://restcountries.com/v3.1/all";

    @Test
    public void allCountries() {

        Response response = RestAssured.get(url);

        //response.prettyPrint();

        System.out.println("response.statusCode() = " + response.statusCode());

        //response.print();

    }


}
