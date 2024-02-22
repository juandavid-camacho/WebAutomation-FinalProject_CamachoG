package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class CheckoutCompletePage extends BasePage {

    @FindBy(className = "complete-text")
    private WebElement completionText;

    public CheckoutCompletePage(WebDriver driver){
        super(driver);
    }

    public String getCompletionText(){
        return completionText.getText();
    }

}
