package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\Driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        driver.manage().window().maximize();

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement destination = driver.findElement(By.id("droppable"));

        Actions actions=new Actions(driver);
        actions.dragAndDrop(source,destination).perform();
        Thread.sleep(3000);

        driver.close();



    }
}
