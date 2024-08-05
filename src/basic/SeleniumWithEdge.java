package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumWithEdge {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\edgedriver\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(4000);
        driver.close();
    }
}
