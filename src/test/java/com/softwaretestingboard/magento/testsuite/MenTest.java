package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    HomePage homePage = new HomePage();
    MenPage menPage = new MenPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        homePage.clickOnPantsViaMenTab();
        Thread.sleep(2000);
        menPage.addProductToCart(menPage.cronusYogaPant, menPage.size32, menPage.blackColour, menPage.addToCart);
        String expectedMessage = "You added Cronus Yoga Pant to your shopping cart.";
        Assert.assertEquals(menPage.getConfirmationMessage(menPage.confirmationMessage), expectedMessage, "Message not displayed");
        menPage.clickOnLinkInMessage(menPage.linkInMessage);
        String expextedText = "Shopping Cart";
        Assert.assertEquals(menPage.verifyText(menPage.text), expextedText, "Text Not Displayed");
        String expectedName = "Cronus Yoga Pant";
        Assert.assertEquals(menPage.verifyName(menPage.name), expectedName, "Name Does not match");
        String expectedSize = "32";
        Assert.assertEquals(menPage.verifySize(menPage.size), expectedSize, "Size not correct");
        String expectedColour = "Black";
        Assert.assertEquals(menPage.verifyColour(menPage.colour), expectedColour, "Colour not right");
    }
}
