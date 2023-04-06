package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By title() {
        return By.className("title");
    }
    private By addToCartButton() {
        return By.id("add-to-cart-sauce-labs-fleece-jacket");
    }
    private By cartButton() {
        return By.id("shopping_cart_container");
    }

    @Step
    public void validateOnHomePage() {
        $(title()).isDisplayed();
    }
    @Step
    public void clickOnAddToCartButton() {
        $(addToCartButton()).click();
    }
    @Step
    public void clickOnCartButton() {
        $(cartButton()).click();
    }
}