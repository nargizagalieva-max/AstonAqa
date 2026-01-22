import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OpenMtsTest {

    @Test
    void checkTopUpBlockTitle() {

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


        WebElement title = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//*[contains(.,'Онлайн пополнение')]")
                )
        );

        String actualText = title.getText();


        assertTrue(
                actualText.contains("Онлайн пополнение"),
                "Заголовок блока не содержит ожидаемый текст"
        );


        driver.quit();
    }
}
