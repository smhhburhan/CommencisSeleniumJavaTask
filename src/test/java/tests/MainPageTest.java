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

        //Assert.assertEquals(Integer.valueOf(element.getText()), openPositionsPage.positionLocation.size());


    }

    @Test
    public void clickOneOfNews() {

        basePage.centerElement(mainPage.newsTitles.get(0));
        basePage.hoverOverAndClick(mainPage.newsTitles.get(0));





        /*

        public void jseClick(WebElement element) {

        centerElement(element);
        jse.executeScript("arguments[0].click()", element);

    }


        public WebElement loopAndMatch(List<WebElement> elements, String text) {

        for (int i = 0; i < elements.size(); i++) {

            if (elements.get(i).getText().contains(text))

                return elements.get(i);

        }

        return null;

    }

        @FindBy(css = "[class*=\"btn btn-outline-secondary rounded\"]")
    public WebElement seeAllTeamsButton;

@FindBy(xpath = "//*[contains(@class,\"job-title\")]//a//h3")
    public List<WebElement> teamTitles;

        basePage.jseClick(careerPage.seeAllTeamsButton);
        basePage.waitFor(1500);
        basePage.scrollDown();
        basePage.click(basePage.loopAndMatch(careerPage.teamTitles, "Quality Assurance"));
        basePage.verifyUrl("https://useinsider.com/careers/quality-assurance/");
 */


        /*
        @FindBy(xpath = "//span[@id='select2-filter-by-location-container']")
    public WebElement filterByLocation;

        @FindBy(css = "[class=\"select2-results__option\"]")
    public List<WebElement> jobLocations;

        basePage.click(openPositionsPage.filterByLocation);
        basePage.loopAndMatch(openPositionsPage.jobLocations, "Istanbul").click();
        basePage.waitFor(1000);
         */


        /*
        public void hoverOverAndClick(WebElement element) {

        actions.moveToElement(element)
                .click()
                .build().perform();

    }

        @FindBy(css = "[class*=\"btn btn-navy rounded pt-2 pr-5 pb-2 pl-5\"]")
    public List<WebElement> applyNowButton;

        basePage.centerElement(openPositionsPage.applyNowButton.get(1));
        basePage.hoverOverAndClick(openPositionsPage.applyNowButton.get(1));
        basePage.switchTab();
        basePage.urlContains("https://jobs.lever.co");

         */



    }

}