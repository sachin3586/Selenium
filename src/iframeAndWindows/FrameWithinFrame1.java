package iframeAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FrameWithinFrame1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        /* WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(ele));

         */
        driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
        // switch to parent frame
        WebElement parentFrame = driver.findElement(By.xpath("//div[@class='container iframes-page-container']"));
        driver.switchTo().frame(parentFrame);
        // switch to child frame
        WebElement childFrame = driver.findElement(By.name("iFrame Demo"));
        driver.switchTo().frame(childFrame);

        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("SHLOK DADHE");
            // switch to parent frame
        driver.switchTo().defaultContent();
        driver.getTitle();

        Thread.sleep(3000);
        driver.quit();

    }
}
