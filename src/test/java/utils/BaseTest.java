package utils;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import pages.LoginPage;
import pages.ProductsPage;

public class BaseTest {

    TheDriver driver;

    @BeforeMethod(alwaysRun = true)
    @Parameters({"url", "user", "password"})
    public void beforeTest(String url, String user, String password){

        driver = new TheDriver();
        driver.getDriver().manage().window().maximize();
        driver.getDriver().get(url);

        LoginPage login = new LoginPage(driver.getDriver());
        login.login(user, password);

    }

    public ProductsPage loadProductsPage(){
        return new ProductsPage(driver.getDriver());
    }

    @AfterMethod()
    public void afterMethod(){
        driver.getDriver().close();
    }

}
