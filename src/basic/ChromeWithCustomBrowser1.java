package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeWithCustomBrowser1 {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setBinary("C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chrome.exe");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.get("http://localhost:8080/login?from=%2F");
        System.out.println(driver.getTitle());

        Thread.sleep(3000);

        driver.close();
    }
}
