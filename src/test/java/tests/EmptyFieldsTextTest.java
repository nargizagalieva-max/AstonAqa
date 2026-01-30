package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MtsMainPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmptyFieldsTextTest {

    private WebDriver driver;
    private MtsMainPage mtsMainPage;

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        mtsMainPage = new MtsMainPage(driver);
        mtsMainPage.open();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void checkEmptyFieldsForServices() {
        mtsMainPage.openServicesTab();

        assertEquals("Номер телефона", mtsMainPage.getPhonePlaceholder());
        assertEquals("Сумма", mtsMainPage.getAmountPlaceholder());
    }

    @Test
    void checkEmptyFieldsForHomeInternet() {
        mtsMainPage.openInternetTab();

        assertEquals("Номер договора", mtsMainPage.getPhonePlaceholder());
        assertEquals("Сумма", mtsMainPage.getAmountPlaceholder());
    }

    @Test
    void checkEmptyFieldsForInstallment() {
        mtsMainPage.openInstallmentTab();

        assertEquals("Номер счета", mtsMainPage.getPhonePlaceholder());
        assertEquals("Сумма", mtsMainPage.getAmountPlaceholder());
    }

    @Test
    void checkEmptyFieldsForDebt() {
        mtsMainPage.openDebtTab();

        assertEquals("Номер счета", mtsMainPage.getPhonePlaceholder());
        assertEquals("Сумма", mtsMainPage.getAmountPlaceholder());
    }
}
