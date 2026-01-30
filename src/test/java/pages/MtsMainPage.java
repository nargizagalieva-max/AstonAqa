package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MtsMainPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public MtsMainPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // ===================== URL =====================
    public void open() {
        driver.get("https://www.mts.by");
    }

    // ===================== COOKIE =====================
    private By cookieButton =
            By.xpath("//button[contains(.,'Принять') or contains(.,'Соглас') or contains(.,'OK')]");

    public void acceptCookiesIfPresent() {
        try {
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(cookieButton));
            button.click();
        } catch (TimeoutException ignored) {
            // cookie нет — это нормально
        }
    }

    // ===================== TABS =====================
    private By servicesTab =
            By.xpath("//button[contains(.,'Услуги связи')]");

    private By internetTab =
            By.xpath("//button[contains(.,'Домашний интернет')]");

    private By installmentTab =
            By.xpath("//button[contains(.,'Рассрочка')]");

    private By debtTab =
            By.xpath("//button[contains(.,'Задолженность')]");

    public void openServicesTab() {
        clickTab(servicesTab);
    }

    public void openInternetTab() {
        clickTab(internetTab);
    }

    public void openInstallmentTab() {
        clickTab(installmentTab);
    }

    public void openDebtTab() {
        clickTab(debtTab);
    }

    private void clickTab(By tab) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(tab));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

    // ===================== INPUTS =====================
    private By phoneInputLocator =
            By.xpath("//input[contains(@placeholder,'Номер')]");

    private By amountInputLocator =
            By.xpath("//input[contains(@placeholder,'Сумма')]");

    public String getPhonePlaceholder() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(phoneInputLocator)
        ).getAttribute("placeholder");
    }

    public String getAmountPlaceholder() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(amountInputLocator)
        ).getAttribute("placeholder");
    }

    // ===================== FILL =====================
    public void fillPhone(String phone) {
        WebElement phoneInput = wait.until(
                ExpectedConditions.visibilityOfElementLocated(phoneInputLocator)
        );

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block:'center'});",
                phoneInput
        );

        phoneInput.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        phoneInput.sendKeys(Keys.DELETE);
        phoneInput.sendKeys(phone);
    }

    public void fillAmount(String amount) {
        WebElement amountInput = wait.until(
                ExpectedConditions.visibilityOfElementLocated(amountInputLocator)
        );

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block:'center'});",
                amountInput
        );

        amountInput.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        amountInput.sendKeys(Keys.DELETE);
        amountInput.sendKeys(amount);
    }

    // ===================== CONTINUE =====================
    private By continueButton =
            By.xpath("//button[contains(.,'Продолжить')]");

    public void clickContinue() {
        WebElement button = wait.until(
                ExpectedConditions.elementToBeClickable(continueButton)
        );
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);
    }
}
