package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

import java.util.List;

public class WomenPage extends Utility {
    By dropDown = By.xpath("//select[@id='sorter']");
    String jacketsValue = "name";
    String priceValue = "price";
    By expectedProductNameOrder = By.xpath("//div[@class='product details product-item-details']//strong[@class='product name product-item-name']");
    By actualProductNameOrder = By.xpath("//div[@class='product details product-item-details']//strong[@class='product name product-item-name']");

    By expectedPriceOrder = By.xpath("//div[@class='price-box price-final_price']//span[@class='price']");
    By actualPriceOrder = By.xpath("//span[@class='normal-price']//span[@class='price-wrapper ']");

    // Select Sort By filter “Product Name”
    public void selectSortByFilterProductName() {
        selectByValueFromDropDown(dropDown, jacketsValue);

    } // Select Sort By filter “Price”
    public void selectSortByFilterPrice() {
        selectByValueFromDropDown(dropDown, priceValue);

    }

    // Verify the products name display in alphabetical order
    public List expectedJacketsOrder() {
       return getTextFromElements(expectedProductNameOrder);
//        return null;
    }

    public List actualJacketsOrder(){
        return getTextFromElements(actualProductNameOrder);
//        return null;
    }

    public List expectedPriceOrder(){
       return getTextFromElements(expectedPriceOrder);
//        return null;
    }
    public List actualPriceOrder(){
        return getTextFromElements(actualPriceOrder);
//        return null;
    }
}
