package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * @Author: churongzhang
 * @Github: czhang1997
 * @Date: 2/12/22
 * @Description:
 * <suite name="All Test Suite" parallel="methods" thread-count="2"> !!important
 */
public class ParallelTest2 {

    WebDriver driver;



    @Test
    public void testLogin() throws InterruptedException {
        String driverPath = "chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        Assert.assertEquals(driver.getTitle(), "OrangeHRM", "The title does not match");
        Thread.sleep(3000);
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
