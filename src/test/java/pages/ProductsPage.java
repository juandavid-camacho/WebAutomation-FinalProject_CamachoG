package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class ProductsPage extends BasePage {

    @FindBy(name = "add-to-cart-sauce-labs-fleece-jacket")
    private WebElement addToCartButton_Fleece;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCartButton_Backpack;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    private WebElement addToCartButton_Onesie;

    @FindBy(className = "shopping_cart_link")
    private WebElement cartButton;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement sideMenuButton;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutButton;

    public ProductsPage(WebDriver driver){
        super(driver);
    }

    public void addFleeceToCart(){
        addToCartButton_Fleece.click();
    }

    public void addBackpackToCart(){
        addToCartButton_Backpack.click();
    }

    public void addOnesieToCart(){
        addToCartButton_Onesie.click();
    }

    public CartPage goToCart(){
        cartButton.click();
        return new CartPage(super.getDriver());
    }

    public void openSideMenu(){
        sideMenuButton.click();
    }

    public LoginPage logout(){
        waitForItem(logoutButton);
        logoutButton.click();
        return  new LoginPage(super.getDriver());
    }

}
