package brokenlinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaginationHandler {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage with pagination
        driver.get("https://example.com/paginated-page");

        // Wait for the page to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Next Page']")));

        // Handle pagination using a loop
        while (true) {
            // Find the next page button
            WebElement nextPageButton = driver.findElement(By.xpath("//button[text()='Next Page']"));

            // Check if the next page button is visible
            if (!nextPageButton.isDisplayed()) {
                break; // No more pages
            }

            // Click the next page button
            nextPageButton.click();

            // Wait for the next page to load
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Next Page']")));

            // Perform actions on the current page
            // ...

            // Check if there's a "Previous Page" button to go back
            WebElement previousPageButton = driver.findElement(By.xpath("//button[text()='Previous Page']"));
            if (previousPageButton.isDisplayed()) {
                // ... (handle going back to the previous page)
            }
        }

        // Close the browser
        driver.quit();
    }
}