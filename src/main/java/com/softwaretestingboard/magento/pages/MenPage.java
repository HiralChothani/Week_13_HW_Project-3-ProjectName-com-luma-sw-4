package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {
    HomePage homePage = new HomePage();
    public By cronusYogaPant = By.xpath("//a[contains(text(),'Cronus Yoga Pant')]");
    public By size32 = By.id("option-label-size-143-item-175");
    public By blackColour = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    public By addToCart = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]");
    public By confirmationMessage = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public By text = By.xpath("//span[@class='base'][1]");
    public By name = By.xpath("//strong[@class='product-item-name']");
    public By size = By.xpath("//dd[contains(text(),'32')]");
    public By colour = By.xpath("//dd[contains(text(),'Black')]");
    public By linkInMessage = By.linkText("shopping cart");

    public void addProductToCart(By by1, By by2, By by3, By by4) {
        homePage.clickOnPantsViaMenTab();
        mouseHoverOnTheElement(by1);
        clickOnTheElement(by2);
        mouseHoverOnTheElementAndClick(by3);
        //mouseHoverOnTheElement(cronusYogaPant);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        WebElement userName = wait.until(ExpectedConditions.visibilityOfElementLocated(addToCart));
        clickOnTheElement(by4);
        // mouseHoverOnTheElementAndClick(addToCart);
    }

    public String getConfirmationMessage(By by) {
        return getTextFromTheElement(by);
    }

    public void clickOnLinkInMessage(By by) {
        clickOnTheElement(by);
    }

    public String verifyText(By by) {
        return getTextFromTheElement(by);

    }

    public String verifyName(By by) {
        return getTextFromTheElement(by);
    }

    public String verifySize(By by) {
        return getTextFromTheElement(by);
    }

    public String verifyColour(By by) {
        return getTextFromTheElement(by);
    }
}
