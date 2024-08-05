package FileUpload_Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddDeleteCookies {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.zomato.com");

        Cookie cookie = new Cookie("My Stock", "Sun Pharma");
        driver.manage().addCookie(cookie);

        //  driver.manage().deleteAllCookies();
        // driver.manage().deleteCookie(cookie);

        driver.quit();

    }
}
