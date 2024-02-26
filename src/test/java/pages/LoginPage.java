package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(name = "login-button")
    private WebElement loginButon;

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void login(String username, String passwordEntered){

        userName.click();
        userName.sendKeys(username);

        password.click();
        password.sendKeys(passwordEntered);

        loginButon.click();

    }

    public Boolean amIHere(){
        return loginButon.isDisplayed();
    }

}
