package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class CartPage extends BasePage {

    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    public CartPage(WebDriver driver){
        super(driver);
    }

    public InformationPage goToCheckout(){
        checkoutButton.click();
        return new InformationPage(super.getDriver());
    }

}
