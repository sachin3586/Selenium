package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumWaits {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.itcportal.com");
        //implicit wait applicable for all elements in class , before NoSuch Element exception w.r.t mentioned time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement element = driver.findElement(By.xpath("(//a[@href=\"/careers/index.aspx\"])[1]"));

        // create object of webDriver class and mention expected condition before  elementNot Visible exception
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));

        wait.until(ExpectedConditions.elementToBeClickable(element));
        wait.until(ExpectedConditions.elementToBeSelected(element));

        // Static wait -- it is never used
        Thread.sleep(3000);


        driver.close();
	driver.quit();
       
    }
}
