package navigateinterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NavigateInterface1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.naukri.com/mnjuser/profile");

        System.out.println("First page title is " + driver.getTitle());

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        // explicit wait
        //wait.until(ExpectedConditions.elementToBeClickable(ele));

        driver.navigate().to("https://chatgpt.com/");
        System.out.println("Second page title is " + driver.getTitle() );
        driver.navigate().refresh();

        Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(3000);

        driver.close();
    }
}