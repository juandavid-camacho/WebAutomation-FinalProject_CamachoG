package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.*;
import utils.BaseTest;

import java.util.NoSuchElementException;

public class MainTests extends BaseTest {

    //@Test(priority = 1)
    @Parameters({"formFirstName", "formLastName", "formZipCode", "verificationText"})
    public void purchaseProductTest(String firstName, String lastName, String zipCode, String verificationText){

        ProductsPage products = loadProductsPage();
        products.addFleeceToCart();
        CartPage cart = products.goToCart();
        InformationPage infoPage = cart.goToCheckout();
        OverviewPage overview = infoPage.populateInformationForm(firstName, lastName, zipCode);
        CheckoutCompletePage chechout = overview.completePurchase();

        Assert.assertEquals(verificationText, chechout.getCompletionText());

    }

    @Test(priority = 2)
    public void removeElementsTest(){

        ProductsPage products = loadProductsPage();
        products.addBackpackToCart();
        products.addFleeceToCart();
        products.addOnesieToCart();
        CartPage cart = products.goToCart();
        cart.removeBackpack();
        cart.removeFleece();
        cart.removeOnesie();
        
        Assert.assertTrue(cart.isEmpty());

    }

    //@Test(priority = 3)
    public void logoutTest(){

        ProductsPage products = loadProductsPage();
        products.openSideMenu();

    }

}
