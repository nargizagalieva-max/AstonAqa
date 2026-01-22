import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaymentLogosTest {

    @Test
    void checkPaymentSystemLogosExist() {
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


        int logosCount = driver.findElements(By.xpath("//img")).size();


        assertTrue(
                logosCount > 0,
                "Логотипы платёжных систем не найдены"
        );

        driver.quit();
    }
}
