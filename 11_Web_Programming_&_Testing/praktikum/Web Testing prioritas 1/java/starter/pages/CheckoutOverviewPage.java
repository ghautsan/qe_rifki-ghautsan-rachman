package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutOverviewPage extends PageObject {
    private By finishButton() {
        return By.id("finish");
    }

    @Step
    public boolean validateOnCheckoutOverviewPage() {
        return $(finishButton()).isDisplayed();
    }

    @Step
    public void clickFinishButton() {
        $(finishButton()).click();
    }
}