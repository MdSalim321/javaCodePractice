package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    WebElement alert = driver.findElement(By.xpath("//button[contains(text(), 'Click me')]"));
        Thread.sleep(4000);
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
 	   js.executeScript("arguments[0].scrollIntoView(true); ", alert);
 	   js.executeScript("arguments[0].click(); ", alert);
       Thread.sleep(2000);

        driver.switchTo().alert().accept();
       
        driver.quit();
    }
}

