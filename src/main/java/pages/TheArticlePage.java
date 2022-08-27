package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class TheArticlePage extends BasePage{

    @FindBy(xpath = "//h1[@class='article__title']")
    public WebElement articleTitle;

    @FindBy(xpath = "//div[@class='article-content']//p//a[contains(@href,\"https://\")]")
    public List<WebElement> articleContentLinks;

}