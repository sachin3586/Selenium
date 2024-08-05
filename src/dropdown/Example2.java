package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("carselect"));

        Select select=new Select(element);

        select.selectByIndex(1);
        Thread.sleep(2000);

        // select using visible text

        select.selectByVisibleText("Honda");
        Thread.sleep(2000);

        select.selectByValue("bmw");
        Thread.sleep(2000);
        driver.close();
    }
}
