package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class BootStrapDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://qaautomation.expert/2019/12/16/how-to-automate-bootstrap-dropdown-using-selenium-webdriver");


        WebElement ele = driver.findElement(By.className("dropdown-link"));
        Actions actions=new Actions(driver);
        actions.moveToElement(ele).build().perform();

        List<WebElement> allElements = driver.findElements(By.xpath("//a[text()='Reports']/following-sibling::ul/child::li"));

        for (WebElement e:allElements){
            if (e.getText().trim().equalsIgnoreCase("Extent Reports")){
                e.click();
                break;
            }

        }


        Thread.sleep(3000);
        driver.close();

    }
}
