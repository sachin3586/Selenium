package FileUpload_Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class CookiesName {
    public static void main(String[] args) throws InterruptedException {
 // This is CookiesName class
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.princepipes.com");

        Thread.sleep(3000);
        Set<Cookie> allcookies = driver.manage().getCookies();  // getting all cookies names

        System.out.println(allcookies);
        for (Cookie c:allcookies){
            System.out.println(c);
        }

        driver.close();
    }
}
