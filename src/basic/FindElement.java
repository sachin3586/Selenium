package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();       // Upcasting
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
       WebElement element= driver.findElement(By.id("login1"));
       element.sendKeys("SACHNDADHE");
        Thread.sleep(2000);
        driver.close();
    }
}
