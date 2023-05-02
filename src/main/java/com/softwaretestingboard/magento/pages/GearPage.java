package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {
    HomePage homePage = new HomePage();
    public By overnightDuffle = By.xpath("//a[contains(text(),'Overnight Duffle')]/..");
    public By quantity = By.xpath("//input[@id='qty']");
    public String text = "3";
    public By addToCart = By.xpath("//button[@class='action primary tocart']//span[contains(text(),'Add to Cart')]");
    public By confirmationMessage = By.xpath("//div[@class='messages']//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public By messageLink = By.linkText("shopping cart");
    public By Qty = By.xpath("//input[@class='input-text qty']");
    public By price = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");
    public By Qty2 = By.xpath("//input[@class='input-text qty']");
    public By name = By.linkText("Overnight Duffle");
    public String textQty = "5";
    public By updateShoppingCart = By.xpath("//span[contains(text(),'Update Shopping Cart')]");
    public By finalPrice = By.xpath("//td[@class='col subtotal']//span[@class='cart-price']");

    public void addProductToCart(By productName, By quantity, String text, By addToCart) {
        clickOnTheElement(productName);
        changeQuantity(quantity, text);
        clickOnTheElement(addToCart);
    }

    public String getConfirmationMessage(By by) {
        return getTextFromTheElement(by);
    }

    public String verifyName(By by) {
        return getTextFromTheElement(by);
    }

    public String verifyQty(By by) {
        return getTextFromTheElement(by);
    }

    public String verifyPrice(By by) {
        return getTextFromTheElement(by);
    }
}
