import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ServiceDetailsLinkTest {

    @Test
    void checkServiceDetailsLinkWorks() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.mts.by");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));


        try {
            wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//button[contains(.,'Прин')]")
                    )
            ).click();
        } catch (Exception e) {

        }

        String startUrl = driver.getCurrentUrl();


        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[contains(.,'Подробнее о сервисе')]")
                )
        ).click();


        wait.until(ExpectedConditions.not(
                ExpectedConditions.urlToBe(startUrl)
        ));

        String newUrl = driver.getCurrentUrl();

        assertNotEquals(
                startUrl,
                newUrl,
                "URL не изменился после клика по ссылке"
        );

        driver.quit();
    }
}
