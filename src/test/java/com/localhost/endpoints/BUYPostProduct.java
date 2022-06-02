package com.localhost.endpoints;

import com.localhost.model.UserPojo;
import com.localhost.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BUYPostProduct extends TestBase {


    @Test
    public void buyProduct(){
        UserPojo userPojo = new UserPojo();
        userPojo.setUser_id(2);
        userPojo.setAmount(3);
        Response response = given()
                .when()
                .pathParam("id",1)
                .body(userPojo)
                .post("/products/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
