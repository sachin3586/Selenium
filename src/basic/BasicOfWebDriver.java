package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOfWebDriver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();   // upcasting of chromedriver class
        
        /* Instead of Setting property and path we can directly use webdriver manager dependency
          Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        */

        ChromeDriver driver1=new ChromeDriver();  // Child class object
        driver.get("https://gemini.google.com");

        String title=driver.getTitle();
                
        System.out.println("Title is " + title);

        String url=driver.getCurrentUrl();
        System.out.println("Url of this page is " + url);
        Thread.sleep(2000);
        driver.close();

    }
}
