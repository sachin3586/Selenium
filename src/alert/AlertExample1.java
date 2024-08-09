package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertExample1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement element = driver.findElement(By.xpath("//input[@name='enter-name']"));
        element.sendKeys("SACHIN DADHE");
        driver.findElement(By.id("confirmbtn")).click();


       System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

        Thread.sleep(3000);

        driver.close();
    }
}