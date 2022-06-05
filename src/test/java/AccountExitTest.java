import PageObject.PageObjectRegistration;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import io.qameta.allure.junit4.DisplayName;

import static com.codeborne.selenide.Selenide.open;

public class AccountExitTest {

    private static final String BURGERSREGISTRATION_URL = "https://stellarburgers.nomoreparties.site/register";
    private String name = "vasenka";
    private String password = "avis102";

    @Before
    public void beforeTest() {
        Configuration.browser = "chrome";
    }

    @Test
    @DisplayName("Проверка выхода из аккаунта по кнопке <Выйти>")
    public void checkExitButtonTest() {
        PageObjectRegistration registration = open(BURGERSREGISTRATION_URL, PageObjectRegistration.class);
        String email = Helper.getRandomEmail();
        registration.setFieldsForRegistration(name, email, password);
        registration.registerButtonClick();
        registration.setFieldsForEntrance(email, password);
        registration.entranceButtonClick();
        registration.cabinetLinkClick();
        registration.exitLinkClick();
        registration.entranceButtonVisible();
    }

    @After
    public void closeBrowser() {
        WebDriverRunner.getWebDriver().manage().deleteAllCookies();
        Selenide.closeWebDriver();
    }
}