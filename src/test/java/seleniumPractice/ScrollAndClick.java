package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollAndClick {
	
    public static void main(String[] args) throws InterruptedException {
    	
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();

        // Target element: Footer > About
        WebElement aboutLink = driver.findElement(By.xpath("(//a[contains(text(), 'About Selenium')])[2]"));

        // Scroll to and click using JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(3000);
        
        js.executeScript("arguments[0].scrollIntoView(true); ", aboutLink);
        Thread.sleep(3000);
        js.executeScript("arguments[0].click();", aboutLink);
    
        System.out.println("Clicked on About link");
        Thread.sleep(3000);
        driver.quit();
    }
}
