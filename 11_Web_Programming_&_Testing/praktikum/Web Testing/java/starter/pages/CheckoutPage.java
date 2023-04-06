package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutPage extends PageObject {
    private By checkoutButton() {
        return By.id("checkout");
    }

    @Step
    public void validateOnCheckoutPage() {
        $(checkoutButton()).isDisplayed();
    }
    @Step
    public void clickOnCheckoutButton() {
        $(checkoutButton()).click();
    }
}
