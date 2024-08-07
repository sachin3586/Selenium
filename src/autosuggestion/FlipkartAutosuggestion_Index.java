package autosuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FlipkartAutosuggestion_Index {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  //implicit wait--dynamic wait
       // WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));  // explicit wait --dynamic wait
        driver.findElement(By.name("q")).sendKeys("iphone");

        Thread.sleep(3000);

        WebElement ele = driver.findElement(By.xpath("(//li[@class='_3D0G9a'])[4]"));
        ele.click();
      //  System.out.println(ele.getText());

        Thread.sleep(3000);

        driver.quit();



    }
}
