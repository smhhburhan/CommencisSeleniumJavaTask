package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.MainPage;
import pages.TheArticlePage;

public class TheArticlePageTest {

    BasePage basePage;
    MainPage mainPage;
    TheArticlePage theArticlePage;

    @BeforeClass
    public void initiliaze() {

        basePage = new BasePage();
        mainPage = new MainPage();
        theArticlePage = new TheArticlePage();

    }

    @Test
    public void browserTitle() {

        basePage.verifyUrl(theArticlePage.driver.getTitle());
        System.out.println(theArticlePage.driver.getTitle());
        System.out.println(theArticlePage.articleTitle);
        Assert.assertEquals(theArticlePage.articleTitle,theArticlePage.driver.getTitle());

    }

    @Test
    public void checkLinks() {

        Assert.assertTrue(basePage.checkElementsAreValid(theArticlePage.articleContentLinks));
        System.out.println(theArticlePage.articleContentLinks.size());

        /*
        Assert.assertTrue(basePage.checkElementsAreValid(mainPage.newsTitles));
        Assert.assertTrue(basePage.checkElementsAreValid(mainPage.newsAuthors));
        Assert.assertTrue(basePage.checkElementsAreValid(mainPage.newsImages));
        System.out.println(mainPage.newsTitles.size());
        System.out.println(mainPage.newsAuthors.size());
        System.out.println(mainPage.newsImages.size());
        Assert.assertEquals(mainPage.newsAuthors.size(), mainPage.newsTitles.size());
        Assert.assertEquals(mainPage.newsImages.size(), mainPage.newsTitles.size());
         */

    }


}