package iframeAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleFrame {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver-new\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();

        // Switch to frame By Id
        driver.switchTo().frame("singleframe");

        // Switch to frame By Index------generally not used
        // driver.switchTo().frame(2);

        WebElement element = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        element.sendKeys("Shlok dadhe");

        driver.switchTo().parentFrame();   // switching from child frame to parent
                                           // OR we can use switchTo().DefaultContains() method to exit from nested frame

        WebElement element1 = driver.findElement(By.xpath("//a[@href=\"Register.html\"]"));
        System.out.println(element1.getText());
        Thread.sleep(3000);

        driver.close();
    }
}
