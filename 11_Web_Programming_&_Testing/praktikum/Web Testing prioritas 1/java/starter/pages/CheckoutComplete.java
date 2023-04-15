package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutComplete extends PageObject {
    private By backToHome() {
        return By.id("back-to-products");
    }

    @Step
    public boolean validateOnCheckoutCompletePage() {
        return $(backToHome()).isDisplayed();
    }

    @Step
    public void clickOnBackToHomeButton() {
        $(backToHome()).click();
    }
}
