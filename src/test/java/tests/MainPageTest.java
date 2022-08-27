package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.MainPage;
import utils.Driver;

public class MainPageTest extends Driver {

    BasePage basePage;
    MainPage mainPage;

    @BeforeClass
    public void initiliaze() {

        basePage = new BasePage();
        mainPage = new MainPage();

    }

    @Test
    public void goToUrl() {

        basePage.navigateToUrl("https://techcrunch.com/");
        System.out.println(driver.getCurrentUrl());

    }

    @Test
    public void checkUrl() {

        basePage.verifyUrl("https://techcrunch.com/");

    }

    @Test
    public void checkAuthorsImages() {

        Assert.assertTrue(basePage.checkElementsAreValid(mainPage.newsTitles));
        Assert.assertTrue(basePage.checkElementsAreValid(mainPage.newsAuthors));
        Assert.assertTrue(basePage.checkElementsAreValid(mainPage.newsImages));
        System.out.println("The number of Titles from The Latest News:"+mainPage.newsTitles.size());
        System.out.println("The number of Authors from The Latest News:"+mainPage.newsAuthors.size());
        System.out.println("The number of Images from The Latest News:"+mainPage.newsImages.size());
        Assert.assertEquals(mainPage.newsAuthors.size(), mainPage.newsTitles.size());
        Assert.assertEquals(mainPage.newsImages.size(), mainPage.newsTitles.size());

    }

    @Test
    public void clickOneOfNews() {

        basePage.centerElement(mainPage.newsTitlesLinks.get(1));
        basePage.click(mainPage.newsTitlesLinks.get(1));
        basePage.waitFor(1000);

    }

}