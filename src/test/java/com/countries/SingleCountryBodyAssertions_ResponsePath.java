package com.countries;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SingleCountryBodyAssertions_ResponsePath {


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

        System.out.println(response.path("name").toString());

        System.out.println(response.path("name.common").toString());
        System.out.println(response.path("name.official").toString());
        System.out.println(response.path("name.nativeName").toString());


    }

    @Test
    public void singleCountryPath2() {

        baseURI = "https://restcountries.com/v3.1";

        Response response = given()
                .pathParam("name", "brazil")
                .when()
                .get("/name/{name}");

        //response.prettyPrint();

        System.out.println(response.path("name").toString());

        System.out.println(response.path("name.common").toString());
        System.out.println(response.path("name.official").toString());
        System.out.println(response.path("name.nativeName").toString());

    }

    @Test
    public void singleCountryPath3() {

        baseURI = "https://restcountries.com/v3.1";

        Response response =
                given()
                        .get("/name/turkey");

        //response.prettyPrint();

        System.out.println(response.path("name").toString());

        System.out.println(response.path("name.common").toString());
        System.out.println(response.path("name.official").toString());
        System.out.println(response.path("name.nativeName").toString());


    }
}
