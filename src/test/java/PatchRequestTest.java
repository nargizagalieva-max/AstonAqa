import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PatchRequestTest {

    @Test
    void patchRequest_shouldReturnSameBody() {

        String requestBody =
                "This is expected to be sent back as part of response body.";

        given()
                .baseUri("https://postman-echo.com")
                .header("Content-Type", "text/plain")
                .body(requestBody)

                .when()
                .patch("/patch")

                .then()
                .statusCode(200)
                .body("data", equalTo(requestBody))
                .body("url", equalTo("https://postman-echo.com/patch"));
    }
}

