package FileUpload_Cookies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUploadExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // implicit wait

        WebElement fileUpload = driver.findElement(By.id("file-upload"));
        fileUpload.sendKeys("C:\\Users\\lenovo\\Desktop\\DemoFile.txt");
        Thread.sleep(3000);

        driver.findElement(By.id("file-submit")).click();
        WebElement fileUploadMsg = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
        if(fileUploadMsg.isDisplayed()){
            System.out.println("File uploaded successfully");
        }
        else {
            System.out.println("File upload isn't successful");
        }


        Thread.sleep(3000);
        driver.close();


       // WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
    }
}
