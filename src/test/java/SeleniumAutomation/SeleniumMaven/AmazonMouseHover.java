package SeleniumAutomation.SeleniumMaven;		
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

		public class AmazonMouseHover {
		    public static void main(String[] args) {
		        // Set path to your WebDriver executable (update as needed)
		        

		        // Initialize the ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Maximize the browser window
		        driver.manage().window().maximize();

		        // Set implicit wait
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		        driver.get("https://www.flipkart.com");

}

		        // Locate the top menu element, e.g., "Fashion"
		        WebElement fashionMenu = driver.findElement(By.xpath("//div[text()='Fashion']"));

		        // Create Actions class instance
		        Actions actions = new Actions(driver);

		        // Hover over the "Fashion" menu
		        actions.moveToElement(fashionMenu).perform();

		        // Optional: Wait for a few seconds to observe the effect
		        try {
		            Thread.sleep(3000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }

		        // Close the browser
		        driver.quit();

		    }
		

		// TODO Auto-generated method stub

	}


