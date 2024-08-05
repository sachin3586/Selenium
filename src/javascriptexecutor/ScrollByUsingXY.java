package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class ScrollByUsingXY {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        Thread.sleep(3000);

       JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;  // DownCasting
        javascriptExecutor.executeScript("window.scrollBy(0,2000)");








       // driver.close();

    }
}
