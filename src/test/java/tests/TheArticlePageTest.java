package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.MainPage;
import pages.TheArticlePage;
import utils.Driver;

public class TheArticlePageTest extends Driver {

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

        basePage.verifyTitle(theArticlePage.driver.getTitle());
        String websiteTitle = theArticlePage.driver.getTitle();
        String articleTitle = theArticlePage.articleTitle.getText() +" | TechCrunch";
        System.out.println("The Title of website:"+websiteTitle);
        System.out.println("The Title of the article:"+articleTitle);
        Assert.assertEquals(websiteTitle,articleTitle);

    }

    @Test
    public void checkLinks() {

        Assert.assertTrue(basePage.checkElementsAreValid(theArticlePage.articleContentLinks));
        System.out.println("The number of the links within the news content:"+theArticlePage.articleContentLinks.size());
        basePage.waitFor(1000);

    }

}