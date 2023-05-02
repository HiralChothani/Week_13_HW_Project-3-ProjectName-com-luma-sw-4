package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    HomePage homePage = new HomePage();
    GearPage gearPage = new GearPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        // Mouse Hover on Gear Menu
        // Click on Bags
        homePage.clickOnBagsViaGearTab();
        // Click on Product Name ‘Overnight Duffle’
        // Verify the text ‘Overnight Duffle’
        // Change Qty 3
        // Click on ‘Add to Cart’ Button.
        gearPage.addProductToCart(gearPage.overnightDuffle, gearPage.quantity, gearPage.text, gearPage.addToCart);
        // Verify the text‘You added Overnight Duffle to your shopping cart.’
        String expectedMessage = "You added Overnight Duffle to your shopping cart.";
        Assert.assertEquals(gearPage.getConfirmationMessage(gearPage.confirmationMessage), expectedMessage, "Message not displayed");
        // Click on ‘shopping cart’ Link into message
        clickOnTheElement(gearPage.messageLink);
        // Verify the product name ‘Overnight Duffle’
        String expectedName = "Overnight Duffle";
        Assert.assertEquals(gearPage.getTextFromTheElement(gearPage.name), expectedName, "Wrong Product");
        //  Verify the Qty is ‘3’
        String expectedQty = "3";
        String actualQty = driver.findElement(gearPage.Qty).getAttribute("value");
        Assert.assertEquals(actualQty, expectedQty, "Wrong Quantity");
        // Verify the product price ‘$135.00’
        String expectedPrice = "$135.00";
        Assert.assertEquals(gearPage.getTextFromTheElement(gearPage.price), expectedPrice, "Wrong Price");
        // Change Qty to ‘5’
        changeQuantity(gearPage.Qty2, gearPage.textQty);
        // Click on ‘Update Shopping Cart’ button
        clickOnTheElement(gearPage.updateShoppingCart);
        // Verify the product price ‘$225.00’
        String expectedPriceFinal = "$225.00";
        Assert.assertEquals(gearPage.getTextFromTheElement(gearPage.finalPrice), expectedPriceFinal, "Wrong Price");




    }

}
