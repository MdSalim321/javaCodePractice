package seleniumPractice;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenBrowser {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream fis = new FileInputStream("./DataSheet/commonData.property");
		
		Properties p = new Properties();
		p.load(fis);
		
		String uName = p.getProperty("UserName");
		String pWord = p.getProperty("Password");
		
		System.out.println("UserName is: "+uName);
		System.out.println("Passwors is: "+pWord);
		
		
		
//		WebElement UserXpath = driver.findElement(By.xpath("//input[contains(@name,'username')]"));
//		UserXpath.sendKeys(uName);
//		Thread.sleep(2000);
//		
//		WebElement PassXpath = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
//		PassXpath.sendKeys(pWord);
//		Thread.sleep(2000);
//		
//		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
//		LoginButton.click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement UserNameEle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'username')]")));
		UserNameEle.sendKeys(uName);
		Thread.sleep(2000);
		
		WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement PassEle = waitt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'password')]")));
		PassEle.sendKeys(pWord);
		Thread.sleep(2000);
		
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		LoginButton.click();
		

		//input[contains(@name,'username')]
		//input[contains(@name,'password')]
		//button[@type='submit']

		// driver.quit();

	}

}
