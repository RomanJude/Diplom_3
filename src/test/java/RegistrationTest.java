import pageobject.PageObjectRegistration;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import io.qameta.allure.junit4.DisplayName;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationTest {

    private static final String BURGERSREGISTRATION_URL = "https://stellarburgers.nomoreparties.site/register";
    private String name = "vasenka";
    private String password = "avis102";
    private String email = Helper.getRandomEmail();

    @Before
    public void beforeTest() {
        Configuration.browser = "chrome";
    }

    @Test
    @DisplayName("Проверка регистрации пользователя с корректными данными")
    public void entranceByEntranceToAccountButtonTest() {
        PageObjectRegistration registration = open(BURGERSREGISTRATION_URL, PageObjectRegistration.class);
        registration.registerUser(name, email, password);
        registration.checkEntranceButtonVisibility();
    }

    @Test
    @DisplayName("Проверка регистрации пользователя с несоблюдением требований к паролю")
    public void incorrectPasswordTest() {
        String incorrectPassword = "avis5";
        PageObjectRegistration registration = open(BURGERSREGISTRATION_URL, PageObjectRegistration.class);
        registration.registerUser(name, email, incorrectPassword);
        registration.checkIncorrectPasswordMessage();
    }

    @After
    public void closeBrowser() {
        WebDriverRunner.getWebDriver().manage().deleteAllCookies();
        Selenide.closeWebDriver();
    }
}