package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;

public class PageObjectMain {

    @FindBy(how = How.XPATH, using = ".//button[text()='Войти в аккаунт']")
    private SelenideElement entranceToAccountButton; // кнопка "Войти в аккаунт

    @FindBy(how = How.XPATH, using = ".//button[text()='Войти']")
    private SelenideElement entranceButton; // кнопка "Войти"

    @FindBy(how = How.CSS, using = ".AppHeader_header__linkText__3q_va ml-2")
    private SelenideElement cabinetButton; // кнопка "Личный кабинет"

    @FindBy(how = How.XPATH, using = ".//h2[text()='Булки']")
    private SelenideElement bunLink;

    @FindBy(how = How.XPATH, using = ".//h2[text()='Соусы']")
    private SelenideElement sauseLink;

    @FindBy(how = How.XPATH, using = ".//h2[text()='Начинки']")
    private SelenideElement fillingsLink;

    public void entranceToAccountButtonClick() {
        entranceToAccountButton.click();
    }

    public void cabinetButtonClick() {
        cabinetButton.click();
    }

    public void checkEntranceButtonVisibility() {
        entranceButton.shouldBe(visible);
    }

    public void entranceButtonClick() {
        entranceButton.click();
    }

    public void bunLinkClick() {
        bunLink.click();
    }

    public void sauseLinkClick() {
        sauseLink.click();
    }

    public void fillingsLinkClick() {
        fillingsLink.shouldBe(enabled).click();
    }
}
