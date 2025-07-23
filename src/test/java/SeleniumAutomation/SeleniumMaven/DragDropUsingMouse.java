package SeleniumAutomation.SeleniumMaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragDropUsingMouse {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
	    driver.get("https://jqueryui.com/droppable/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    Thread.sleep(2000);
	    
	    driver.switchTo().frame(0);
	    		
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='draggable']")));
	    
	    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(40));
	    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='droppable']")));

	    
	    WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
	    Thread.sleep(2000);
        WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
        Thread.sleep(2000);
    	Actions ac = new Actions(driver);
    	
    	
    	Thread.sleep(2000);
    	ac.dragAndDrop(source, target).perform();
	    
	  
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
