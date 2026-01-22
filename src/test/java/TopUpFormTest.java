import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TopUpFormTest {

    @Test
    void checkTopUpFormAndContinueButton() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://www.mts.by");


        try {
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(.,'Прин')]")
            )).click();
        } catch (Exception ignored) {}


        ((JavascriptExecutor) driver)
                .executeScript("window.scrollBy(0,800)");


        WebElement formBlock = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//*[contains(.,'Онлайн пополнение')]")
                )
        );

        assertTrue(formBlock.isDisplayed(),
                "Блок пополнения не отображается");


        WebElement continueButton = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//button[contains(.,'Продолжить')]")
                )
        );

        assertTrue(continueButton.isDisplayed(),
                "Кнопка «Продолжить» не найдена");


        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", continueButton);

        driver.quit();
    }
}
