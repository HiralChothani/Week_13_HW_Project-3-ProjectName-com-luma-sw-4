package com.softwaretestingboard.magento.utilities;

import com.softwaretestingboard.magento.browserfactory.ManageBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Utility extends ManageBrowser {
    // This method will hover mouse on the element
    public void mouseHoverOnTheElement(By by) {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(by);
        actions.moveToElement(element).build().perform();
    }
    //  // This method will hover mouse and click on the element
    public void mouseHoverOnTheElementAndClick(By by) {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(by);
        actions.moveToElement(element).click().build().perform();
    }

    // This method will click on the element
    public void clickOnTheElement(By by) {
        driver.findElement(by).click();
    }

    // This method will select from Dropdown
    public void selectByValueFromDropDown(By by, String value) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        // select by value
        select.selectByValue(value);
    }

    public List getTextFromElements(By by) {
        List<WebElement> nameElements = driver.findElements(by);
       List<String> productNames = new ArrayList<>();
        for (WebElement element : nameElements) {
            productNames.add(element.getText());
            System.out.println(productNames);
        }
        return productNames;
    }

    public void sendTextToTheElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    public String getTextFromTheElement(By by){
        return driver.findElement(by).getText();
    }

    public void clearText(By by){
        driver.findElement(by).clear();
    }
    public void changeQuantity(By by, String text){
        clickOnTheElement(by);
        clearText(by);
        sendTextToTheElement(by,text);
    }
}
