package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
	    driver.get("https://demoqa.com/select-menu");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    Thread.sleep(2000);
	    
	  //select[contains(@id, 'oldSelectMenu')]
	   WebElement dropdown = driver.findElement(By.xpath("//select[contains(@id, 'oldSelectMenu')]"));
	   
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("arguments[0].scrollIntoView(true); ", dropdown);
	   
       Thread.sleep(2000);

	   
	   Select select = new Select(dropdown);

       // Select by visible text
       select.selectByVisibleText("Purple");
       Thread.sleep(2000);
	   
	
	}

}
