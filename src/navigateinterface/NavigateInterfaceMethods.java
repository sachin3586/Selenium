package navigateinterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NavigateInterfaceMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      //  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));

        driver.get("https://www.google.com/");
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com/");

        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().forward();


        Thread.sleep(3000);
        driver.quit();

    }
}
