package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutInformationPage extends PageObject {
    private By firstNameField() {
        return By.id("first-name");
    }

    private By lastNameField() {
        return By.id("last-name");
    }

    private By postalCodeField() {
        return By.id("postal-code");
    }

    private By continueButton() {
        return By.id("continue");
    }

    @Step
    public boolean validateOnCheckoutInformationPage() {
        return $(firstNameField()).isDisplayed();
    }
    @Step
    public void inputFirstName(String firstName) {
        $(firstNameField()).type(firstName);
    }
    @Step
    public void inputLastName(String lastName) {
        $(lastNameField()).type(lastName);
    }
    @Step
    public void inputPostalCode(String postalCode) {
        $(postalCodeField()).type(postalCode);
    }
    @Step
    public void clickContinueButton() {
        $(continueButton()).click();
    }
}
