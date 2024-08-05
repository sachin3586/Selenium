package iframeAndWindows;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class HandleTabs {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

      // WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(25)); // explicit wait
       // wait.until(ExpectedConditions.elementToBeClickable());


        try {
            driver.get("https://www.tcs.com");
            System.out.println("The title of first Tab is " + driver.getTitle());

            // get id of main  window
            String mainWindowHandle = driver.getWindowHandle();

            // open new tab using javascript executor
            ((JavascriptExecutor) driver).executeScript("window.open('about:blank', '_blank');");

            // switch to new Tab
            switchToNewTab(driver, mainWindowHandle);

            //navigate another webpage in new tab
            driver.get("https://www.hcltech.com");
            System.out.println("The title of second tab " + driver.getTitle());

            // switch to main tab
            driver.switchTo().window(mainWindowHandle);
            System.out.println(" Back on  main tab  " + driver.getTitle());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // close browser
            driver.quit();
            // driver.close();
        }
    }

    private static void switchToNewTab(WebDriver driver, String mainWindowHandle) {
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String handle : allWindowHandles) {

            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }
}
