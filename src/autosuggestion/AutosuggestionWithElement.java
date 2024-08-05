package autosuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutosuggestionWithElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  //implicit wait--dynamic wait
        // WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));  // explicit wait --dynamic wait
        driver.findElement(By.name("q")).sendKeys("iphone");

        Thread.sleep(3000);

        List<WebElement> allSuggestion = driver.findElements(By.xpath("//li[@class='_3D0G9a']"));
        System.out.println("The size is " + allSuggestion.size());
        for (WebElement e:allSuggestion){
            System.out.println(e.getText());
            if(e.getText().contentEquals("iphone 11")){

                e.click();
            }
        }

        Thread.sleep(3000);
        driver.close();
    }
}