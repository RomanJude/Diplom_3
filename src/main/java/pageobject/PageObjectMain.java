package pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.enabled;

public class PageObjectMain {

    @FindBy(how = How.XPATH, using = ".//h2[text()='Булки']")
    private SelenideElement bunLink;

    @FindBy(how = How.XPATH, using = ".//h2[text()='Соусы']")
    private SelenideElement sauseLink;

    @FindBy(how = How.XPATH, using = ".//h2[text()='Начинки']")
    private SelenideElement fillingsLink;

    @Step("Нажатие на ссылку Булки")
    public void bunLinkClick() {
        bunLink.click();
    }

    @Step("Нажатие на ссылку Соусы")
    public void sauseLinkClick() {
        sauseLink.click();
    }

    @Step("Нажатие на ссылку Начинки")
    public void fillingsLinkClick() {
        fillingsLink.shouldBe(enabled).click();
    }
}
