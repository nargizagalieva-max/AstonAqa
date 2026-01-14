import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DeleteRequestTest {

    @Test
    void deleteRequest_shouldReturnSameBody() {

        String requestBody =
                "This is expected to be sent back as part of response body.";

        given()
                .baseUri("https://postman-echo.com")
                .header("Content-Type", "text/plain")
                .body(requestBody)

                .when()
                .delete("/delete")

                .then()
                .statusCode(200)
                .body("data", equalTo(requestBody))
                .body("url", equalTo("https://postman-echo.com/delete"));
    }
}
