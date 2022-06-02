package com.localhost.endpoints;

import com.localhost.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GETProducts extends TestBase {


    @Test
    public void getProducts(){
        Response response = given()
                .when()
                .get("/products");
        response.prettyPrint();
        response.then().statusCode(200);

    }
}
