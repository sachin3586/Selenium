package iframeAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class GetWindowHandles {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver-new\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.id("openwindow")).click();
        String parentWindowId = driver.getWindowHandle();  // return only parent window id

        Set<String> allWindowId = driver.getWindowHandles();  // return all windows id
        System.out.println(allWindowId);

        for (String s:allWindowId){
            if (!parentWindowId.contentEquals(s)){
                driver.switchTo().window(s);
                Thread.sleep(2000);

                WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Sign In']"));
                System.out.println(element.getText());
                driver.close();

            }
        }

        Thread.sleep(3000);
        driver.switchTo().window(parentWindowId);
        System.out.println(driver.getTitle());

        Thread.sleep(3000);
        driver.quit();
    }
}
