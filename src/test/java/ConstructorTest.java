import pageobject.PageObjectMain;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import io.qameta.allure.junit4.DisplayName;

import static com.codeborne.selenide.Selenide.open;

public class ConstructorTest {

    private static final String BURGER_URL = "https://stellarburgers.nomoreparties.site/";

    @Before
    public void beforeTest() {
        Configuration.browser = "chrome";
    }

    @Test
    @DisplayName("Проверка возможности кликнуть на вкладку <Соус> в конструкторе")
    public void sauseLinkClickTest() {
        PageObjectMain main = open(BURGER_URL, PageObjectMain.class);
        main.sauseLinkClick();
    }

    @Test
    @DisplayName("Проверка возможности кликнуть на вкладку <Булки> в конструкторе")
    public void bunLinkClickTest() {
        PageObjectMain main = open(BURGER_URL, PageObjectMain.class);
        main.bunLinkClick();
    }

    @Test
    @DisplayName("Проверка возможности кликнуть на вкладку <Начинки> в конструкторе")
    public void fillingsLinkClickTest() {
        PageObjectMain main = open(BURGER_URL, PageObjectMain.class);
        main.fillingsLinkClick();
    }

    @After
    public void closeBrowser() {
        WebDriverRunner.getWebDriver().manage().deleteAllCookies();
        Selenide.closeWebDriver();
    }
}