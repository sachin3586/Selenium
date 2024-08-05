package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingContains {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        // for any xpath when we use attribute compulsory we use "@" symbol for locating same element
        WebElement element = driver.findElement(By.xpath("//input[contains(@class,'signinbtn')]"));
        element.click();
        Thread.sleep(2000);
        driver.close();
    }
}
