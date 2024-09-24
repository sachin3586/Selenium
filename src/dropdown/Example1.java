package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver-new\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement dropDownElement = driver.findElement(By.xpath("//select[@name='cars']"));
        Select select = new Select(dropDownElement);

        List<WebElement> alloptions = select.getOptions();
        for (WebElement element : alloptions) {
            System.out.println(element.getText());
        }
        driver.close();
    }
}