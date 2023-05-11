package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetailProductPage extends PageObject {
    private By productExplanation() {
        return By.xpath("//div[@class='v-card__text']");
    }

    @Step
    public void onProductDetail() {
        $(productExplanation()).isDisplayed();
    }
}
