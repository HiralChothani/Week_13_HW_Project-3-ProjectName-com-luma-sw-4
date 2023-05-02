package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class WomenTest extends BaseTest {
    HomePage homePage = new HomePage();
    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        homePage.clickOnJacketsViaWomenTab();
        List expectedOrder = womenPage.expectedJacketsOrder();
        womenPage.selectSortByFilterProductName();
        List actualOrder = womenPage.actualJacketsOrder();
        Collections.sort(expectedOrder);
        //expectedOrder.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
        Assert.assertEquals(actualOrder, expectedOrder);
    }

    @Test
    public void verifyTheSortByPriceFilter() {
        homePage.clickOnJacketsViaWomenTab();
        List expectedOrder = womenPage.expectedPriceOrder();
        womenPage.selectSortByFilterPrice();
        List actualOrder = womenPage.actualPriceOrder();
        Collections.sort(expectedOrder);
        Assert.assertEquals(actualOrder, expectedOrder);

    }

}
