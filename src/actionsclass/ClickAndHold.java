package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ClickAndHold {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        WebElement elementF = driver.findElement(By.xpath("//li[@name='F']"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(elementF).pause(Duration.ofSeconds(4))
                .release().build().perform();


        Thread.sleep(2000);
        driver.close();
    }
}
