package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathStartsWith {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        // when use attribute use @ for locating same attrubute
        driver.findElement(By.xpath("//input[starts-with(@id,'password')]")).sendKeys("SACHIN");
        Thread.sleep(2000);
        driver.close();
    }
}
