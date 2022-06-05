package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;

public class PageObjectRegistration {

    @FindBy(how = How.XPATH, using = ".//form[@class='Auth_form__3qKeq mb-20']//fieldset[@class='Auth_fieldset__1QzWN mb-6'][1]//div[@class='input__container']//div[@class='input pr-6 pl-6 input_type_text input_size_default']//input")
    private SelenideElement nameInputField;

    @FindBy(how = How.XPATH, using = ".//form[@class='Auth_form__3qKeq mb-20']//fieldset[@class='Auth_fieldset__1QzWN mb-6'][2]//div[@class='input__container']//div[@class='input pr-6 pl-6 input_type_text input_size_default']//input")
    private SelenideElement emailInputField;

    @FindBy(how = How.XPATH, using = ".//form[@class='Auth_form__3qKeq mb-20']//fieldset[@class='Auth_fieldset__1QzWN mb-6'][3]//div[@class='input__container']//div[@class='input pr-6 pl-6 input_type_password input_size_default']//input")
    private SelenideElement passwordInputField;

    @FindBy(how = How.XPATH, using = ".//button[text()='Зарегистрироваться']")
    private SelenideElement registerButton;

    @FindBy(how = How.XPATH, using = ".//button[text()='Войти']")
    private SelenideElement entranceButton; // кнопка "Войти"

    @FindBy(how = How.XPATH, using = ".//p[text()='Некорректный пароль']")
    private SelenideElement incorrectPasswordMessage;

    @FindBy(how = How.XPATH, using = ".//button[text()='Оформить заказ']")
    private SelenideElement makeOrderButton;

    @FindBy(how = How.XPATH, using = ".//input[@class='text input__textfield text_type_main-default']")
    private SelenideElement loginEmailInput;

    @FindBy(how = How.XPATH, using = ".//form[@class='Auth_form__3qKeq mb-20']//fieldset[@class='Auth_fieldset__1QzWN mb-6'][2]//div[@class='input__container']//div[@class='input pr-6 pl-6 input_type_password input_size_default']//input")
    private SelenideElement entrancePasswordInputField;

    @FindBy(how = How.XPATH, using = ".//p[text()='Личный Кабинет']")
    private SelenideElement cabinetLink;

    @FindBy(how = How.XPATH, using = ".//button[text()='Выход']")
    private SelenideElement exitLink;

    @FindBy(how = How.XPATH, using = ".//button[text()='Войти в аккаунт']")
    private SelenideElement entranceToAccountButton;

    @FindBy(how = How.XPATH, using = ".//a[text()='Войти']")
    private SelenideElement entranceLink;

    @FindBy(how = How.XPATH, using = ".//a[text()='Восстановить пароль']")
    private SelenideElement rememberPasswordLink;

    @FindBy(how = How.XPATH, using = ".//p[text()='Конструктор']")
    private SelenideElement constructor;

    @FindBy(how = How.XPATH, using = ".//a[@href='/']")
    private SelenideElement logotype;

    public void checkIncorrectPasswordMessage() {
        incorrectPasswordMessage.shouldBe(visible);
    }

    public void setFieldsForRegistration(String name, String email, String password) {
        nameInputField.shouldBe(enabled);
        setNameInputField(name);
        emailInputField.shouldBe(enabled);
        setEmailInputField(email);
        passwordInputField.shouldBe(enabled);
        setPasswordInputField(password);
    }

    private void setNameInputField(String name) {
        this.nameInputField.setValue(name);
    }

    private void setEmailInputField(String email) {
        this.emailInputField.setValue(email);
    }

    private void setPasswordInputField(String password) {
        this.passwordInputField.setValue(password);
    }

    public void registerButtonClick() {
        registerButton.click();
    }

    public void checkEntranceButtonVisibility() {
        entranceButton.shouldBe(visible);
    }

    public void entranceButtonClick() {
        entranceButton.click();
    }

    public void entranceButtonVisible() {
        entranceButton.shouldBe(visible);
    }

    public void makeOrderButtonVisible() {
        makeOrderButton.shouldBe(visible);
    }

    private void setLoginEmailInput(String email) {
        this.loginEmailInput.setValue(email);
    }

    private void setEntrancePasswordInputField(String password) {
        this.entrancePasswordInputField.setValue(password);
    }

    private void loginEmailInputClick() {
        loginEmailInput.click();
    }

    public void setFieldsForEntrance(String email, String password) {
        loginEmailInput.shouldBe(enabled);
        loginEmailInputClick();
        setLoginEmailInput(email);
        entrancePasswordInputField.shouldBe(enabled);
        setEntrancePasswordInputField(password);
    }

    public void cabinetLinkClick() {
        cabinetLink.click();
    }

    public void exitLinkClick() {
        exitLink.click();
    }

    public void exitLinkVisible() {
        exitLink.shouldBe(visible);
    }

    public void entranceToAccountButtonClick() {
        entranceToAccountButton.click();
    }

    public void entranceLinkClick() {
        entranceLink.click();
    }

    public void rememberPasswordLinkClick() {
        rememberPasswordLink.click();
    }

    public void entranceLinkVisible() {
        entranceLink.shouldBe(visible);
    }

    public void constructorClick() {
        constructor.click();
    }

    public void entraceToAccountButtonVisible() {
        entranceToAccountButton.shouldBe(visible);
    }

    public void logotypeClick() {
        logotype.click();
    }
}
