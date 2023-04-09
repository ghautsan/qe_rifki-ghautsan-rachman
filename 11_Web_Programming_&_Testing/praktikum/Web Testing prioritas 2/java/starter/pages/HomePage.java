package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    private By pulsa() {
        return By.id("product_type_0");
    }

    private By homeButton() {
        return By.id("button_home");
    }

    @Step
    public void validateOnHomePage() {
        $(homeButton()).isDisplayed();
    }

    @Step
    public void chooseProduct() {
        $(pulsa()).click();
    }
}