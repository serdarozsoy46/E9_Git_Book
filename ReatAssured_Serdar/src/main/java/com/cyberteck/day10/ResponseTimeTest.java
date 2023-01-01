package com.cyberteck.day10;

import com.cyberteck.utilities.SpartanAuthTestBase;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class ResponseTimeTest extends SpartanAuthTestBase {

    @Test
    public void test1(){

        Response response = given()
                .auth().basic("admin", "admin")
                .accept(ContentType.JSON)
                .when()
                .get("/api/spartans")
         .then()
               .time(both(greaterThan(500L)).and(lessThanOrEqualTo(1100L)))
               .extract().response();

        System.out.println("response.getTime() = " + response.getTime());


    }
}


