package datepicker_screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class DynamicScreenShot {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // implicit wait

        //WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20)) ;
        driver.navigate().to("https://www.tatapower.com/");

        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String timestamp=new SimpleDateFormat("yyyy-MM-dd_HHmmss").format(new Date());
        File dest=new File("C:/Users/lenovo/Desktop/Testing/ScreenShot " + timestamp+ ".png");

        FileHandler.copy(src,dest);

        Thread.sleep(3000);
        driver.close();



    }
}
