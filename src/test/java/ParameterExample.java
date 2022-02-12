import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @Author: churongzhang
 * @Github: czhang1997
 * @Date: 2/12/22
 * @Description:
 */
public class ParameterExample {

    WebDriver driver;

    @BeforeClass
    @Parameters({"browser", "url"})
    public void setup(String browser, String app) {
        if (browser.equalsIgnoreCase("chrome")) {
            String driverPath = "chromedriver";
            System.setProperty("webdriver.chrome.driver", driverPath);
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            // pretent there is such firefox driver
//            String driverPath = "chromedriver";
//            System.setProperty("webdriver.chrome.driver", driverPath);
//            driver = new FirefoxDriver();
//            driver.get("https://opensource-demo.orangehrmlive.com/");
        } else {
            System.out.println("no driver was selected!");
        }
        driver.get(app);
    }

    @Test
    public void testLogo() {
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not display in the page");
    }

    @Test
    public void testHomePageTitle() {
        Assert.assertEquals(driver.getTitle(), "OrangeHRM", "The title does not match");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
