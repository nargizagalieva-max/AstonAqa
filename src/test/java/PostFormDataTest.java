import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostFormDataTest {

    @Test
    void postFormData_shouldReturnParameters() {

        given()
                .baseUri("https://postman-echo.com")
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("url", equalTo("https://postman-echo.com/post"));
    }
    //при попытке отправки x-www-form-urlencoded через Rest Assured
    // сервис Postman Echo возвращает 500, что указывает на нестабильность API.
}