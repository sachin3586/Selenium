package iframeAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWithinFrame {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@href=\"#Multiple\"]")).click();
        // switch to parent frame
        WebElement parentFrame = driver.findElement(By.xpath("//div[@class=\"container iframes-page-container\"]"));
        driver.switchTo().frame(parentFrame);

        // switch to child frame
        WebElement childFrame = driver.findElement(By.name("iFrame Demo"));
        driver.switchTo().frame(childFrame);

        //interact with child frame element
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("SachinDadhe");

        // switching back to default content and interact outside frame element
        driver.switchTo().defaultContent();

        //interact with outside frame element
        WebElement outsideelement = driver.findElement(By.xpath("//a[@href=\"WebTable.html\"]"));
        System.out.println(outsideelement.getText());
        Thread.sleep(3000);
        driver.close();

    }
}
