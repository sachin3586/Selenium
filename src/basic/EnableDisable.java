package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class EnableDisable {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement textbox = driver.findElement(By.id("enabled-example-input"));
        driver.findElement(By.id("disabled-button")).click();

        System.out.println(textbox.isEnabled());
        System.out.println(textbox.isDisplayed());

        WebElement elementbmw = driver.findElement(By.xpath("//input[@id='bmwcheck']"));
        elementbmw.click();
        System.out.println(elementbmw.isSelected());
        System.out.println(elementbmw.isDisplayed());

                Thread.sleep(3000);

        driver.quit();
    }
}
