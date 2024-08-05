package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeWithCustomBrowser {
    public static void main(String[] args) throws InterruptedException {
        // To use chrome for testing we need to create object& same object we pass while creating instance of chromedriver class

        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setBinary("C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\chrome-win64\\chrome.exe");
        System.setProperty("webDriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);

        driver.close();

    }
}
