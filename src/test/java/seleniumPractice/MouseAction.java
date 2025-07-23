package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
	    driver.get("https://jqueryui.com/droppable/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    Thread.sleep(2000);
	   
	 driver.switchTo().frame(0);
	 
	 WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
	 Thread.sleep(2000);
	 
	 WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
	 Thread.sleep(2000);
	 
	  //div[@id='draggable']
	  //div[@id = 'droppable']
	    
	    Actions ac = new Actions(driver);
	    Thread.sleep(2000);
	    ac.dragAndDrop(src, dest).perform();
	    
	    
		
		
		
		
		
	}

}
