package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class CartPage extends BasePage {

    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    @FindBy(xpath = "//*[@id=\"remove-sauce-labs-backpack\"]")
    private WebElement removeBackpackButton;

    @FindBy(name = "remove-sauce-labs-fleece-jacket")
    private WebElement removeFleeceButton;

    @FindBy(id = "remove-sauce-labs-onesie")
    private WebElement removeOnesieButton;

    @FindBy(className = "cart_item")
    private WebElement cartItem;

    public CartPage(WebDriver driver){
        super(driver);
    }

    public InformationPage goToCheckout(){
        checkoutButton.click();
        return new InformationPage(super.getDriver());
    }

    public void removeBackpack(){
        removeBackpackButton.click();
    }

    public void removeFleece(){
        removeFleeceButton.click();
    }

    public void removeOnesie(){
        removeOnesieButton.click();
    }

    public Boolean isEmpty(){

        Boolean empty;

        try {
            empty = !cartItem.isDisplayed();
        } catch (NoSuchElementException e){
            empty = true;
        }

        return empty;

    }

}
