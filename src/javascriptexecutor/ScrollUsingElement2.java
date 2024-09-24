package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollUsingElement2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver-new\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gailonline.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

       WebElement scrollElementNew=driver.findElement(By.xpath("//a[@title='PROJECT DASHBOARD']"));

        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",scrollElementNew);

        scrollElementNew.click();

        Thread.sleep(3000);

        driver.close();
    }
}