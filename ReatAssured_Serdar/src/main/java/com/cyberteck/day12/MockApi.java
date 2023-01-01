package com.cyberteck.day12;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.http.*;
import org.junit.jupiter.api.*;



public class MockApi {

   // https://fbad0b0b-977c-4975-8425-a11b5fc6a5ef.mock.pstmn.io

    @Test
    public void test1(){

        given().baseUri("https://fbad0b0b-977c-4975-8425-a11b5fc6a5ef.mock.pstmn.io")
                .accept(ContentType.JSON)
                .when()
                .get("/customer")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("firstName",is("John"));

    }

    @Test
    public void test2(){

        given().baseUri("https://fbad0b0b-977c-4975-8425-a11b5fc6a5ef.mock.pstmn.io")
                .accept(ContentType.JSON)
                .when()
                .get("/employees")
                .prettyPrint();

    }

}
