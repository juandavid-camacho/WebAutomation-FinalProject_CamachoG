package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class OverviewPage extends BasePage {

    @FindBy(id = "finish")
    private WebElement finishButton;

    public OverviewPage(WebDriver driver){
        super(driver);
    }

    public CheckoutCompletePage completePurchase(){
        finishButton.click();
        return new CheckoutCompletePage(super.getDriver());
    }

}
