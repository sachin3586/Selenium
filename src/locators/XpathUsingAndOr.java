package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingAndOr {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

      //  WebElement element = driver.findElement(By.xpath("//input[@id='login1' and @name='login']"));
        WebElement element1 = driver.findElement(By.xpath("//input[@id='login1' or @name='login']"));

        element1.sendKeys("SARIKADADHE");
        Thread.sleep(2000);
        driver.close();


    }
}
