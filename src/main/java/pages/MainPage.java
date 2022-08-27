package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class MainPage extends BasePage{

    @FindBy(xpath = "//h2[@class='post-block__title']")
    public List<WebElement> newsTitles;

    @FindBy(xpath = "//span[@class='river-byline__authors']")
    public List<WebElement> newsAuthors;

    @FindBy(xpath = "//footer[@class='post-block__footer']")
    public List<WebElement> newsImages;

}