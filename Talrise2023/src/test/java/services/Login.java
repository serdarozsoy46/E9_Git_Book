package services;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.internal.RestAssuredResponseImpl;
import io.restassured.response.Response;
import org.junit.Assert;;import java.util.HashMap;
import java.util.Map;

public class Login {

    static String token;
    static String email;
    String firstName;
    String linkedIn;

    Response response;
    public void loginWithValidInfo(){
/*
        {
            "email": "serdar_ozsoy@msn.com",
                "password": "Test123456!"
        }
        */

        String body=  " {\n" +
                "            \"email\": \"serdar_ozsoy@msn.com\",\n" +
                "                \"password\": \"Test123456!\"\n" +
                "        }";

        response= RestAssured.given().contentType(ContentType.JSON)
                .body(body).log().all()
                .when().post("auth/login").prettyPeek();
        token = response.jsonPath().getString("data.token");
        email = response.jsonPath().getString("data.email}");
        firstName = response.jsonPath().getString("data.firstName");
        linkedIn = response.jsonPath().getString("data.linkedIn");
    }

    public void verifyStatuscode(int StatusCode){

         Assert.assertEquals(StatusCode,response.statusCode());
        //Assert.assertNotNull(response.jsonPath().getString("data.token"));
        Assert.assertNotNull(token);
        Assert.assertEquals("serdar",firstName);
        Assert.assertEquals("serdar_ozsoy@msn.com",email);
        Assert.assertEquals("https://www.linkedin.com/in/ozsoyserdar",linkedIn);

    }

    public void loginWithParameter(String email, String password){

        Map<String,Object>body = new HashMap<>();

        body.put("email",email);
        body.put("password",password);

        response = RestAssured.given().contentType(ContentType.JSON).
                body(body).log().all().
                with().post("auth/login").prettyPeek();


    }
}
