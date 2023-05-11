package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class TransactionPage extends PageObject {
    private By transactionText() {
        return By.xpath("//h1[.='Transactions']");
    }

    @Step
    public void validateOnTransactionPage() {
        $(transactionText()).isDisplayed();
    }
}
