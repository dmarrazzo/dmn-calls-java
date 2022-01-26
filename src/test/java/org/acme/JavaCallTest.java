package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class JavaCallTest {

    @Test
    public void testJavaCall() {
        given()
          .body("{\"input\": \"test\"}")
          .contentType(ContentType.JSON)
          .when()
            .post("/java-call")
          .then()
            .statusCode(200)
            .body("'java call'", is("useful test"));
    }
}
