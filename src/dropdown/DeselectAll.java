package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectAll {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.id("multiple-select-example"));
        Select select=new Select(element);
        select.selectByIndex(2);
        Thread.sleep(2000);

        select.selectByIndex(1);
        Thread.sleep(2000);
        select.selectByVisibleText("Apple");
        Thread.sleep(2000);

        select.deselectAll();
        Thread.sleep(2000);
        driver.close();
        //driver.quit();

    }
}
