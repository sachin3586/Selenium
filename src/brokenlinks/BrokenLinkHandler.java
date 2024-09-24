package brokenlinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BrokenLinkHandler {
    public static void main(String[] args) {
        // Set up the WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver-new\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://ntpc.co.in/");

        // Get the current window handle (original tab)
        String originalWindow = driver.getWindowHandle();

        // Find all links on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        // Iterate through each link and check if it's broken
        for (WebElement link : links) {
            String href = link.getAttribute("href");

            // Skip links without a valid href attribute
            if (href == null || href.isEmpty()) {
                continue;
            }

            // Create a new tab to open the link in
            WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);

            // Navigate to the link
            newTab.get(href);

            try {
                // Wait for the page to load
                WebDriverWait wait = new WebDriverWait(newTab, Duration.ofSeconds(10));
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));

                // Check if the link is broken (404 or error in URL)
                if (newTab.getCurrentUrl().contains("404") || newTab.getCurrentUrl().contains("error")) {
                    System.out.println("Broken link: " + href);
                }
            } catch (Exception e) {
                System.out.println("Error checking link: " + href + " - " + e.getMessage());
            }

            // Close the new tab
            newTab.close();

            // Switch back to the original tab
            driver.switchTo().window(originalWindow);
        }

        // Quit the driver
        driver.quit();
    }
}
