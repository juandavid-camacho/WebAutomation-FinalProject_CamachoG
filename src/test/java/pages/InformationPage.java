package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class InformationPage extends BasePage {

    @FindBy(name = "firstName")
    private WebElement firstNameInput;

    @FindBy(name = "lastName")
    private WebElement lastNameInput;

    @FindBy(id = "postal-code")
    private WebElement zipCodeInput;

    @FindBy(id = "continue")
    private WebElement continueButton;

    public InformationPage(WebDriver driver){
        super(driver);
    }

    public OverviewPage populateInformationForm(String firstName, String lastName, String zipCode){

        firstNameInput.click();
        firstNameInput.sendKeys(firstName);

        lastNameInput.click();
        lastNameInput.sendKeys(lastName);

        zipCodeInput.click();
        zipCodeInput.sendKeys(zipCode);

        continueButton.click();

        return new OverviewPage(super.getDriver());

    }

}