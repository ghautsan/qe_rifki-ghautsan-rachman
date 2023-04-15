package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class IsiPulsaPage extends PageObject {
    private By phoneNumberField() {
        return By.id("phone_number");
    }

    private By productOne() {
        return By.id("Telkomsel Rp5.000");
    }

    @Step
    public void validateOnIsiPulsaPage() {
       $(phoneNumberField()).isDisplayed();
    }

    @Step
    public void inputPhoneNumber(String phoneNumber) {
        $(phoneNumberField()).type(phoneNumber);
    }

    @Step
    public void chooseProductOne() {
        $(productOne()).click();
    }
}
