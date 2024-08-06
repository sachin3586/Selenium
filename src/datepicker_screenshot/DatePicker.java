package datepicker_screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.switchTo().frame(0);
        driver.findElement(By.id("datepicker")).click();
        //26/05/2021
        while (true){
            String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if (year.equals("2011") && month.equals("May"))
            {
                driver.findElement(By.xpath("//a[@data-date='26']")).click();
                break;
            }
            else {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
            }
        }


       Thread.sleep(3000);
        driver.close();

    }
}
