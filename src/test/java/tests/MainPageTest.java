package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.MainPage;

public class MainPageTest {

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
        System.out.println(mainPage.newsTitles.size());
        System.out.println(mainPage.newsAuthors.size());
        System.out.println(mainPage.newsImages.size());
        Assert.assertEquals(mainPage.newsAuthors.size(), mainPage.newsTitles.size());
        Assert.assertEquals(mainPage.newsImages.size(), mainPage.newsTitles.size());

    }

    @Test
    public void clickOneOfNews() {

        basePage.centerElement(mainPage.newsTitles.get(0));
        basePage.hoverOverAndClick(mainPage.newsTitles.get(0));

    }

}