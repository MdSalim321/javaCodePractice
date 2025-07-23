package seleniumPractice;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class LoginWithExcelData {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//	File f = new File("./DataSheet/testData.xlsx");
		
		FileInputStream fis = new FileInputStream("./DataSheet/testData.xlsx");
	
		Workbook wb = new XSSFWorkbook(fis);
		Sheet st = wb.getSheetAt(0);
		
		String uName = st.getRow(1).getCell(0).getStringCellValue();
		String Passwd = st.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(uName);
		System.out.println(Passwd);
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement UserNameEle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'username')]")));
		UserNameEle.sendKeys(uName);
		Thread.sleep(2000);
		
		WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement PassEle = waitt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'password')]")));
		PassEle.sendKeys(Passwd);
		Thread.sleep(2000);
		
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		LoginButton.click();
		
		String ExpectedTle = "OrangeHRM";
		
		String ActualTtle = driver.getTitle();
	
		try {
			Assert.assertEquals(ActualTtle, ExpectedTle, "Title does not matched year");
			System.out.println("Title Matched");
			
			
		} catch (AssertionError e) {
			
			String path = System.getProperty("user.dir")+ "/ScreenShot";
			new File(path).mkdirs();
			String pathFinal = path+ "/ScreenShot10.jpg";
		//	File dest = new File(pathFinal);
			
			Thread.sleep(5000);
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src =ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(pathFinal));
			throw e;
			
		}
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -1000)");
		
		Thread.sleep(2000);
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		driver.findElement(By.xpath("(//a)[2]")).click();
		Thread.sleep(4000);
		WebElement checkbox = driver.findElement(By.xpath("(//span[contains(@class, 'oxd-checkbox-input oxd')])[5]")); 
		
		js.executeScript("arguments[0].scrollIntoView(true); ",checkbox );
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click();", checkbox);
		
		
		
		
		
	
			
		
		
		
		
		
		
		
		
		
		
		

	}

}
