package iframeAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class GetWindowHandle1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.findElement(By.id("openwindow")).click();
        String parentWindowID = driver.getWindowHandle();
        System.out.println(parentWindowID);

        Set<String> allWindowsID = driver.getWindowHandles();
        System.out.println(allWindowsID);

        for (String id:allWindowsID){
            if (!parentWindowID.contentEquals(id)){

                driver.switchTo().window(id);
                Thread.sleep(3000);
                System.out.println(driver.getTitle());

            }
        }









        driver.quit();
    }
}
