package SeleniumAutomation.SeleniumMaven;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotTaking {

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		String ScreenPath = "./ScreenShott";
		
		new File(ScreenPath).mkdirs();
		String FinalScPath = ScreenPath +"/screenhot2.jpg";
				
		WebDriverManager.chromedriver().setup();
		WebDriver  driver  =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
			
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src, new File(FinalScPath));
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
