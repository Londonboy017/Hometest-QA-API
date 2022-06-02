package com.localhost.endpoints;

import com.localhost.model.UserPojo;
import com.localhost.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostProduct extends TestBase {


    @Test
    public void postCreateProducts(){
        UserPojo userPojo = new UserPojo();
        userPojo.setName("Lime Curd check");
        userPojo.setAvailable(100);
        Response response = given()
                .when()
                .body(userPojo)
                .post("/products");
        response.prettyPrint();
        response.then().statusCode(201);
    }
}
