package SeleniumAutomation.SeleniumMaven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardInteraction {

	public static void main(String[] args) throws InterruptedException, AWTException {

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebElement searchBox = driver.findElement(By.name("q"));
	    
	    searchBox.sendKeys("Selenium");
	    Thread.sleep(2000);
	    searchBox.sendKeys(Keys.ENTER);
	    
//	    Robot r = new Robot();
//	    r.keyPress(KeyEvent.VK_ENTER);
//	    r.keyRelease(KeyEvent.VK_ENTER);
//	    Thread.sleep(2000);
	    
	    Actions ac = new Actions(driver);
	    ac.contextClick(searchBox).perform();
	}

}
