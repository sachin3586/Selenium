package autosuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestion1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  //implicit wait--dynamic wait
        // WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));  // explicit wait --dynamic wait
        driver.findElement(By.name("q")).sendKeys("shoes");

        List<WebElement> allNames = driver.findElements(By.xpath("//li[@class='_3D0G9a']"));
        System.out.println("The size of list elements is " + allNames.size());

        for (WebElement name:allNames){
            if (name.getText().contentEquals("shoes for boys")){
                name.click();
                Thread.sleep(3000);
            }
        }


        Thread.sleep(3000);
        driver.close();
    }
}
