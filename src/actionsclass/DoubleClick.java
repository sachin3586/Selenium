package actionsclass;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        Actions actions=new Actions(driver);
        actions.doubleClick(element).perform();


        Thread.sleep(3000);
        driver.close();
    }
}
