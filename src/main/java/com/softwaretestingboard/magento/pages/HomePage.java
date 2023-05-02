package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
By womenTab = By.xpath("//a[@id='ui-id-4']//span[contains(text(),'Women')]");
By tops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
By jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
By manTab = By.xpath("//span[contains(text(),'Men')]//preceding-sibling::span");
By bottoms = By.xpath("//a[@id='ui-id-18']");
By pants = By.xpath("//a[@id='ui-id-23']");
By gearTab = By.xpath("//a[@role='menuitem']//span[contains(text(),'Gear')]");
By bags = By.xpath("//span[contains(text(),'Bags')]/..");
public void clickOnJacketsViaWomenTab(){
    mouseHoverOnTheElement(womenTab);
    mouseHoverOnTheElement(tops);
    clickOnTheElement(jackets);
}

public void clickOnPantsViaMenTab(){
    mouseHoverOnTheElement(manTab);
    mouseHoverOnTheElement(bottoms);
    clickOnTheElement(pants);
}

public void clickOnBagsViaGearTab(){
    mouseHoverOnTheElement(gearTab);
    mouseHoverOnTheElementAndClick(bags);
}
}
