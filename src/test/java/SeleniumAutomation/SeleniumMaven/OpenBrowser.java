package SeleniumAutomation.SeleniumMaven;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser 
{
	public static void main(String[] args) 
	{
			WebDriver driver  =new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().window().maximize();
			
			Set<String>	allWh = driver.getWindowHandles();
			int count = allWh.size();
			System.out.println(count);
			
			for(String text : allWh)
			{
				System.out.println(text);
			}
	}
}

