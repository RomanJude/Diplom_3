import pageobject.PageObjectRegistration;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import io.qameta.allure.junit4.DisplayName;

import static com.codeborne.selenide.Selenide.*;

public class EntranceTest {

    private static final String BURGERSREGISTRATION_URL = "https://stellarburgers.nomoreparties.site/register";
    private static final String BURGER_URL = "https://stellarburgers.nomoreparties.site/";
    private String name = "vasenka";
    private String password = "avis102";
    private String email = Helper.getRandomEmail();

    @Before
    public void beforeTest() {
        Configuration.browser = "chrome";
    }

    @Test
    @DisplayName("Проверка выхода из аккаунта с применением кнопки «Выйти» в личном кабинете")
    public void checkExitButtonTest() {
        PageObjectRegistration registration = open(BURGERSREGISTRATION_URL, PageObjectRegistration.class);
        registration.registerUser(name, email, password);
        registration.loginUser(email, password);
        registration.cabinetLinkClick();
        registration.exitLinkClick();
        registration.checkEntranceButtonVisibility();
    }

    @Test
    @DisplayName("Проверка перехода по клику на «Личный кабинет» на главной странице авторизованного пользователя")
    public void checkCabinetTest() {
        PageObjectRegistration registration = open(BURGERSREGISTRATION_URL, PageObjectRegistration.class);
        registration.registerUser(name, email, password);
        registration.loginUser(email, password);
        registration.cabinetLinkClick();
        registration.exitLinkVisible();
    }

    @Test
    @DisplayName("Проверка перехода по клику на «Личный кабинет» на главной странице неавторизованного пользователя")
    public void cabinetLinkEntranceTest() {
        PageObjectRegistration registration = open(BURGER_URL, PageObjectRegistration.class);
        registration.cabinetLinkClick();
        registration.checkEntranceButtonVisibility();
    }

    @Test
    @DisplayName("Проверка перехода по клику на «Войти в аккаунт» на главной странице неавторизованного пользователя")
    public void entranceToAccountButtonClickTest() {
        PageObjectRegistration registration = open(BURGER_URL, PageObjectRegistration.class);
        registration.entranceToAccountButtonClick();
        registration.checkEntranceButtonVisibility();
    }

    @Test
    @DisplayName("Проверка входа через кнопку в форме регистрации")
    public void entranceLinkEcntanceToAccount() {
        PageObjectRegistration registration = open(BURGERSREGISTRATION_URL, PageObjectRegistration.class);
        registration.entranceLinkClick();
        registration.checkEntranceButtonVisibility();
    }

    @Test
    @DisplayName("Проверка входа через кнопку в форме восстановления пароля")
    public void rememberPasswordLinkEntranceTest() {
        PageObjectRegistration registration = open(BURGER_URL, PageObjectRegistration.class);
        registration.entranceToAccountButtonClick();
        registration.rememberPasswordLinkClick();
        registration.entranceLinkVisible();
    }

    @Test
    @DisplayName("Проверка перехода по клику на «Конструктор»")
    public void constructorEntranceTest() {
        PageObjectRegistration registration = open(BURGERSREGISTRATION_URL, PageObjectRegistration.class);
        registration.constructorClick();
        registration.entraceToAccountButtonVisible();
    }

    @Test
    @DisplayName("Проверка перехода по клику на логотип Stellar Burgers")
    public void logotypeClickTest() {
        PageObjectRegistration registration = open(BURGERSREGISTRATION_URL, PageObjectRegistration.class);
        registration.logotypeClick();
        registration.entraceToAccountButtonVisible();
    }

    @After
    public void cleanUp() {
        WebDriverRunner.getWebDriver().manage().deleteAllCookies();
        Selenide.closeWebDriver();
    }
}