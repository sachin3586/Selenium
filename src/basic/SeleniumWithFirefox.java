package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SeleniumWithFirefox {
    public static void main(String[] args) throws InterruptedException {
        FirefoxOptions firefoxOptions=new FirefoxOptions();
        firefoxOptions.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        driver.close();
    }
}
