package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//input[@type='text']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(element).click(element)
                .keyDown(Keys.SHIFT)
                .sendKeys("tshirt")
                .keyUp(Keys.SHIFT)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();


        Thread.sleep(3000);
        driver.close();

    }
}
