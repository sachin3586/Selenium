package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//input[@name='enter-name']"));
        element.sendKeys("SHLOK");
        driver.findElement(By.id("confirmbtn")).click();

        //driver.switchTo().alert().accept();
        String alertText = driver.switchTo().alert().getText();
        System.out.println(alertText);
        driver.switchTo().alert().dismiss();

        Thread.sleep(5000);
        driver.close();

    }

}
