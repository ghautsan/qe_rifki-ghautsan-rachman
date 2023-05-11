package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By title() {
        return By.xpath("//div[@class='v-select__selections']");
    }

    private By sonyPs5() {
        return By.id("12890");
    }

    private By detailButton() {
        return By.xpath("//div[4]//button[@class='button-beli v-btn v-btn--outlined theme--light v-size--small primary--text']/span[@class='v-btn__content']");
    }

    private By beliButtonPs5() {
        return By.xpath("//div[4]//button[@class='button-beli ml-3 v-btn v-btn--outlined theme--light v-size--small primary--text']/span[@class='v-btn__content']");
    }

    private By beliButtonMarbleTable() {
        return By.xpath("//div[@class='row align-stretch']/div[2]//button[@class='button-beli ml-3 v-btn v-btn--outlined theme--light v-size--small primary--text']/span[@class='v-btn__content']");
    }

    private By cartIcon() {
        return By.xpath("//i[@class='v-icon notranslate fas fa-shopping-cart theme--dark']");
    }

    private By profileIcon() {
        return By.xpath("//i[@class='v-icon notranslate fas fa-user theme--dark']");
    }

    private By logoutButton() {
        return By.xpath("//div[@class='v-list v-sheet theme--light']/div[contains(.,'Logout')]");
    }

    @Step
    public void validateHomePage() {
        $(title()).isDisplayed();
    }

    @Step
    public void clickDetailProduct() {
        $(detailButton()).click();
    }

    @Step
    public void clickCartIcon() {
        $(cartIcon()).click();
    }

    @Step
    public void clickProfileIcon() {
        $(profileIcon()).click();
    }

    @Step
    public void clickBeliButtonPs5() {
        $(beliButtonPs5()).click();
    }

    @Step
    public void clickBeliButtonMarbleTable() {
        $(beliButtonMarbleTable()).click();
    }

    @Step
    public void clickLogoutButton() {
        $(logoutButton()).click();
    }
}
