package SeleniumAutomation.SeleniumMaven;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInteraction {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions ac = new Actions(driver);
		
		Robot robot = new Robot();	
		// hovering on all the element under the fashion section
		
		WebElement Fashion = driver.findElement(By.xpath("//span[contains(text(), 'Fashion')]"));
		Thread.sleep(2);
		ac.moveToElement(Fashion).perform();
	
		List<WebElement> fashionall = driver.findElements(By.xpath("//div[contains(@class, '16rZTH')]//a"));
		for (WebElement fashionOne : fashionall) {
			
			ac.moveToElement(fashionOne).perform();
			System.out.println("Hover element is: "+fashionOne.getText());
	//		ac.contextClick(fashionOne).perform();
//			
//			robot.keyPress(KeyEvent.VK_DOWN);
//			robot.keyRelease(KeyEvent.VK_DOWN);
//			robot.keyPress(KeyEvent.VK_ENTER);
//	        robot.keyRelease(KeyEvent.VK_ENTER);
			ac.keyDown(Keys.CONTROL).click(fashionOne).keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(3);
		}
		
		driver.navigate().refresh();
		Thread.sleep(5);
		
		
		// hovering on all the element under the Home section
		
		WebElement home = driver.findElement(By.xpath("//span[contains(text(), 'Home & Furniture')]"));
		Thread.sleep(2);
		ac.moveToElement(home).perform();
		
		List<WebElement> homesall = driver.findElements(By.xpath("//div[contains(@class, '16rZTH')]//a"));
		for (WebElement homeOne : homesall) {
			
			ac.moveToElement(homeOne).perform();
			System.out.println("Hover element is: "+homeOne.getText());
			ac.keyDown(Keys.CONTROL).click(homeOne).keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(3);
		}
		driver.navigate().refresh();
		Thread.sleep(5);
		
		// hovering on all the element under the Electronics section
		
		WebElement Electronics = driver.findElement(By.xpath("//span[contains(text(), 'Electronics')]"));
		Thread.sleep(2);
		ac.moveToElement(Electronics).perform();
		
		List<WebElement> electronicsall = driver.findElements(By.xpath("//div[contains(@class, '1UgUYI _2eN8ye')]//a"));
		for (WebElement electronicsOne : electronicsall) {
			
			ac.moveToElement(electronicsOne).perform();
			System.out.println("Hover element is: "+electronicsOne.getText());
			ac.keyDown(Keys.CONTROL).click(electronicsOne).keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(3);
		}

		driver.navigate().refresh();
		Thread.sleep(5);

		// hovering on all the element under the beauty section
		
		WebElement beauty = driver.findElement(By.xpath("//span[contains(text(), 'Beauty, Toys & More')]"));
		Thread.sleep(2);
		ac.moveToElement(beauty).perform();
		
		List<WebElement> beautyall = driver.findElements(By.xpath("//div[contains(@class, '1UgUYI _2eN8ye')]//a"));
		for (WebElement beautyOne : beautyall) {
			
			ac.moveToElement(beautyOne).perform();
			System.out.println("Hover element is: "+beautyOne.getText());
			ac.keyDown(Keys.CONTROL).click(beautyOne).keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(3);
		}
		driver.navigate().refresh();
		Thread.sleep(5);
		
		
		// hovering on all the element under the Two wheeler  section
		
		WebElement twoWheeler = driver.findElement(By.xpath("//span[contains(text(), 'Two Wheelers')]"));
		Thread.sleep(2);
		ac.moveToElement(twoWheeler).perform();
		
		List<WebElement> twoWheelerall = driver.findElements(By.xpath("//div[contains(@class, '1UgUYI _2eN8ye')]//a"));
		for (WebElement twoWheelerOne : twoWheelerall) {
			
			ac.moveToElement(twoWheelerOne).perform();
			System.out.println("Hover element is: "+twoWheelerOne.getText());
			ac.keyDown(Keys.CONTROL).click(twoWheelerOne).keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(3);
		}
		driver.navigate().refresh();
		Thread.sleep(5);

	}

}
