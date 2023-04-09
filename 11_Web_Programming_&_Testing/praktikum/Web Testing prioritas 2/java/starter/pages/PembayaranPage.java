package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PembayaranPage extends PageObject {
    private By methodPaymentOne() {
        return By.id("label Gopay");
    }

    private By paymentButton() {
        return By.id("submit_payment");
    }



    @Step
    public void chooseMethodPayment() {
        $(methodPaymentOne()).click();
    }

    @Step
    public void clickPaymentButton() {
        $(paymentButton()).click();
    }


}
