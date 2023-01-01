package com.cyberteck.day12;
import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import com.cyberteck.utilities.SpartanNewBase;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class OldRestAssuredTest extends SpartanNewBase {

    @Test
    public void getAllSpartan(){

        given()
                .accept(ContentType.JSON)
                .and()
                .auth().basic("admin","admin")
                .log().all()

                .when()
                .get("/spartans")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("id[0]",is(10))// birinci cikmayinca ikinci cikmaz
                .body("id[5]",is(199))
                .log().all();
    }
    /*
             in previous version of Restassured, the given when then style
             was actually written in given expect when format.
             it will assert all the result and give one answer and does not fail whole thing
             if first one fail unlike new structure.
          */
    @Test
    public void test2(){
        given()
                .accept(ContentType.JSON)
                .and()
                .auth().basic("admin","admin")
                .log().all()
                .expect()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("id[0]",is(10))// birinci cikmasada ikinci cikar
                .body("id[5]",is(199))
                .logDetail(LogDetail.ALL) //log way using with expect()
                .when()
                .get("/spartans");



    }

}
