package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BaseTest;

public class MainTests extends BaseTest {

    @Test
    @Parameters({"user", "password"})
    public void purchaseProductTest(String user, String password){

        LoginPage login = loadLogin();
        login.login(user, password);

    }

}
