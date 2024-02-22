package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.*;
import utils.BaseTest;

public class MainTests extends BaseTest {

    @Test
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

    @Test
    public void removeElements(){

        ProductsPage products = loadProductsPage();
        products.addBackpackToCart();
        products.addFleeceToCart();
        products.addOnesieToCart();
        CartPage cart = products.goToCart();

    }

}
