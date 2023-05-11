package starter.pages;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.ui.InputField;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    public String createRandomName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    public String name = createRandomName();

    public String password = "password";

    private By nameField() {
        return By.id("input-29");
    }

    private By emailField() {
        return By.id("input-32");
    }

    private By passwordField() {
        return By.id("input-35");
    }

    private By registerButton() {
        return By.xpath("//span[.='Register']");
    }

    @Step
    public void inputNameField() {
        Faker faker = new Faker();
        name = faker.name().firstName();
        $(nameField()).type(name);
    }

    @Step
    public void inputEmailField() {
        $(emailField()).type(name + "@gmail.com");
    }

    @Step
    public void inputPasswordField() {
        $(passwordField()).type(password);
    }

    @Step
    public void clickRegisterButton() {
        $(registerButton()).click();
    }
}
