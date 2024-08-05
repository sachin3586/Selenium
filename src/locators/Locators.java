package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
       // WebElement element = driver.findElement(By.className("signinbtn"));  // by className
       // WebElement element1 = driver.findElement(By.name("proceed"));          // by name
       // WebElement element2 = driver.findElement(By.linkText("Create a new account"));  // LinkText
        WebElement element3 = driver.findElement(By.partialLinkText("Create "));

        element3.click();
        Thread.sleep(2000);
        driver.close();













    }
}