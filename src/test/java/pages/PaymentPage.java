package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By paymentFrame =
            By.xpath("//iframe[contains(@src,'pay')]");

    private By phoneText =
            By.xpath("//span[contains(@class,'phone')]");

    private By amountText =
            By.xpath("//span[contains(@class,'amount')]");

    private By cardNumberInput =
            By.xpath("//input[@placeholder='Номер карты']");

    private By cardDateInput =
            By.xpath("//input[contains(@placeholder,'Срок')]");

    private By cardCvcInput =
            By.xpath("//input[@placeholder='CVC']");

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(25));
    }

    // ⭐ ВОТ ОН — недостающий метод
    public void waitUntilLoaded() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(paymentFrame));
    }

    public String getPhoneText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(phoneText))
                .getText();
    }

    public String getAmountText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(amountText))
                .getText();
    }

    public String getCardNumberPlaceholder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cardNumberInput))
                .getAttribute("placeholder");
    }

    public String getCardDatePlaceholder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cardDateInput))
                .getAttribute("placeholder");
    }

    public String getCardCvcPlaceholder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cardCvcInput))
                .getAttribute("placeholder");
    }
}
