package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        // CSS selector using simple TagName, Attribute & value
        driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("ShlokDadhe");
       // driver.findElement(By.cssSelector("input#login1")).sendKeys("SarikaDadhe"); // Attribute is replaced by #
        // while using class & its value for css locator class is replaced by "."

        Thread.sleep(2000);

        driver.close();












    }
}