package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverMethodsChrome {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        // implicitlyWait--Dynamic wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // explicit wait  -- Dynamic wait
      /*  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));

       */
        driver.manage().window().maximize();
        Thread.sleep(2000);           // static wait
        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();

    }
}
