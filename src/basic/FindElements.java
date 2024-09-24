package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class FindElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\chromedriver-new\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        List<WebElement> elements = driver.findElements(By.tagName("input"));

        System.out.println(elements.size());

        for (WebElement a:elements)
        {

            System.out.println(a);
            System.out.println(a.getText());


        }
        driver.close();

    }
}
