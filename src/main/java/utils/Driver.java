package utils;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class Driver {

    public static WebDriver driver;

    @BeforeSuite
    @Parameters({"browserName"})
    public void startDriver(String browserName) {

        if (browserName.equals("Chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (browserName.equals("Firefox")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        } else {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }

        driver.manage().window().maximize();

    }

    @AfterSuite
    public void endDriver() {

        driver.quit();

    }
}