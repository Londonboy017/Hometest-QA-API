package com.localhost.endpoints;

import com.localhost.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteProduct extends TestBase {


    @Test
    public void deleteProducts(){
        Response response = given()
                .when()
                .pathParam("id",1)
                .delete("/products/{id}");
        response.prettyPrint();
        response.then().statusCode(204);
    }
}
