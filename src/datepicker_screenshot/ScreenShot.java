package datepicker_screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.io.FileHandler;

import static java.util.logging.FileHandler.*;

public class ScreenShot {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://sunpharma.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Implicit wait-wait before showing
                                                                           // "No Such Element Exception"
      //  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        // wait before its showing Visibility of element not located
       // wait.until(ExpectedConditions.visibilityOfElementLocated(element))

        File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination=new File("C:\\Users\\lenovo\\Desktop\\Testing\\sunpharma.png");
        FileHandler.copy(screenShot,destination);

        System.out.println("Title is " + driver.getTitle());


        driver.close();

    }
}
