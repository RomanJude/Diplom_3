package pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
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

    @Step("Проверка видимости сообщения о неверном пароле")
    public void checkIncorrectPasswordMessage() {
        incorrectPasswordMessage.shouldBe(visible);
    }

    @Step ("Регистрация пользователя")
    public void registerUser(String name, String email, String password) {
        nameInputField.shouldBe(enabled);
        setNameInputField(name);
        emailInputField.shouldBe(enabled);
        setEmailInputField(email);
        passwordInputField.shouldBe(enabled);
        setPasswordInputField(password);
        registerButtonClick();
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

    private void registerButtonClick() {
        registerButton.click();
    }

    @Step ("Проверка видимости кнопки Войти")
    public void checkEntranceButtonVisibility() {
        entranceButton.shouldBe(visible);
    }

    private void entranceButtonClick() {
        entranceButton.click();
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

    @Step("Авторизация пользователя")
    public void loginUser(String email, String password) {
        loginEmailInput.shouldBe(enabled);
        loginEmailInputClick();
        setLoginEmailInput(email);
        entrancePasswordInputField.shouldBe(enabled);
        setEntrancePasswordInputField(password);
        entranceButtonClick();
    }

    @Step("Нажатие на ссылку Личный кабинет")
    public void cabinetLinkClick() {
        cabinetLink.click();
    }

    @Step("Нажатие на ссылку Выход")
    public void exitLinkClick() {
        exitLink.click();
    }

    @Step("Проверка видимости ссылки Выход")
    public void exitLinkVisible() {
        exitLink.shouldBe(visible);
    }

    @Step("Проверка видимости кнопки Войти")
    public void entranceToAccountButtonClick() {
        entranceToAccountButton.click();
    }

    @Step("Проверка видимости ссылки Войти")
    public void entranceLinkClick() {
        entranceLink.click();
    }

    @Step("Нажатие на ссылку Восстановить пароль")
    public void rememberPasswordLinkClick() {
        rememberPasswordLink.click();
    }

    @Step("Проверка видимости ссылки Войти")
    public void entranceLinkVisible() {
        entranceLink.shouldBe(visible);
    }

    @Step("Нажатие ссылки Конструктор")
    public void constructorClick() {
        constructor.click();
    }

    @Step("Проверка видимости кнопки Вход в аккаунт")
    public void entraceToAccountButtonVisible() {
        entranceToAccountButton.shouldBe(visible);
    }

    @Step("Нажатие на логотип")
    public void logotypeClick() {
        logotype.click();
    }
}
