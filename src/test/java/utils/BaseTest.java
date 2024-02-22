package utils;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import pages.LoginPage;

public class BaseTest {

    TheDriver driver;

    @BeforeTest(alwaysRun = true)
    @Parameters({"url"})
    public void beforeTest(String url){

        driver = new TheDriver();
        driver.getDriver().manage().window().maximize();
        driver.getDriver().get(url);

    }

    public LoginPage loadLogin(){
        return new LoginPage(driver.getDriver());
    }

}
