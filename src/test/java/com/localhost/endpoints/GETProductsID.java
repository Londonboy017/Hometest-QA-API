package com.localhost.endpoints;

import com.localhost.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GETProductsID extends TestBase {


    @Test
    public void getProductbyId(){
        Response response = given()
                .when()
                .pathParam("id",2)
                .get("/products/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
