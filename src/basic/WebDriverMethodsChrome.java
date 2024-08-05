package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodsChrome {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();

    }
}
