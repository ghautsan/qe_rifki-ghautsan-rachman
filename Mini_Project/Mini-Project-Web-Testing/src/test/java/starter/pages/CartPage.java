package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CartPage extends PageObject {
    private By bayarButton() {
        return By.id("button-bayar");
    }

    private By plusButtonPs5() {
        return By.xpath("//div[@class='v-card__text']/div[1]//span[.='+']");
    }

    private By minusButtonMarbleTable() {
        return By.xpath("//div[@class='v-card__text']/div[2]//span[.='-']");
    }

    private By totalItemsPs5() {
        return By.xpath("//div[@class='v-card__text']/div[1]//span[@class='mx-3 label-quantity']");
    }

    private By totalItemsMarbleTable() {
        return By.xpath("//span[.='3']");
    }

    @Step
    public void clickBayarButton() {
        $(bayarButton()).click();
    }

    @Step
    public void clickPlusButtonPs5() {
        $(plusButtonPs5()).click();
    }

    @Step
    public void clickMinusButtonMarbleTable() {
        $(minusButtonMarbleTable()).click();
    }

    @Step
    public void validateTotalItemsPs5() {
        $(totalItemsPs5()).equals("2");
    }

    @Step
    public void validateTotalItemsMarbleTable() {
        $(totalItemsMarbleTable()).equals("3");
    }
}
