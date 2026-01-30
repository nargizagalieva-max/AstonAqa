package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MtsMainPage;
import pages.PaymentPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaymentFlowTest {

    private WebDriver driver;
    private MtsMainPage mtsMainPage;
    private PaymentPage paymentPage;

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        mtsMainPage = new MtsMainPage(driver);
        mtsMainPage.open();
        mtsMainPage.acceptCookiesIfPresent();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void checkPaymentDataForServices() {

        // 1. Выбираем "Услуги связи"
        mtsMainPage.openServicesTab();

        // 2. Заполняем данные
        mtsMainPage.fillPhone("297777777");
        mtsMainPage.fillAmount("10");

        // 3. Нажимаем "Продолжить"
        mtsMainPage.clickContinue();

        // 4. Переходим на страницу оплаты и ЖДЁМ iframe
        paymentPage = new PaymentPage(driver);
        paymentPage.waitUntilLoaded();

        // 5. Проверяем номер и сумму
        assertTrue(paymentPage.getPhoneText().contains("297777777"));
        assertTrue(paymentPage.getAmountText().contains("10"));

        // 6. Проверяем placeholder’ы карты
        assertEquals("Номер карты", paymentPage.getCardNumberPlaceholder());
        assertEquals("Срок действия", paymentPage.getCardDatePlaceholder());
        assertEquals("CVC", paymentPage.getCardCvcPlaceholder());
    }
}
