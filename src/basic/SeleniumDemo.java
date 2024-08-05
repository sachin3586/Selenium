package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

        Thread.sleep(3000);

        driver.close();
    }
}
