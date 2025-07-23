package SeleniumAutomation.SeleniumMaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.poi.ss.usermodel.*;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException, InterruptedException {	
		
	File f = new File("./DataSheet/testData.xlsx");
	
	FileInputStream fis = new FileInputStream(f);
	
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sh =wb.getSheetAt(0);
	Row row = sh.getRow(1);

	String FullName = row.getCell(0).getStringCellValue();
	String phNo = row.getCell(1).getStringCellValue();
	String email = row.getCell(2).getStringCellValue();
    String company = row.getCell(3).getStringCellValue();
    String country = row.getCell(4).getStringCellValue();
    String employees = row.getCell(5).getStringCellValue();
    
    
  Thread.sleep(2000);
  
    
    Cell cell = row.createCell(8);
    cell.setCellValue("testing");
    fis.close();
    
    FileOutputStream fos = new FileOutputStream(f);
    wb.write(fos);
    
    fos.close();
    wb.close();
    
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.orangehrm.com/en/book-a-free-demo");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    
    driver.findElement(By.xpath("//input[contains(@name, 'FullName')]")).sendKeys(FullName);
    driver.findElement(By.xpath("//input[contains(@name, 'Contact')]")).sendKeys(phNo);
    driver.findElement(By.xpath("//input[contains(@name, 'Email')]")).sendKeys(email);
    driver.findElement(By.xpath("//input[contains(@name, 'CompanyName')]")).sendKeys(company);
    
    WebElement country_Xpath = driver.findElement(By.xpath("//select[contains(@name, 'Country')]"));
    Select s = new Select(country_Xpath);
    s.selectByValue(country);
    
    WebElement employee_Xpath = driver.findElement(By.xpath("//select[contains(@name, 'NoOfEmployees')]"));
    Select s1 = new Select(employee_Xpath);
    s1.selectByValue(employees);
    
    Thread.sleep(4000);
    
    
    driver.switchTo().frame(0);
    Thread.sleep(2000);
   
    
    Thread.sleep(2000);
    driver.quit();
    
    
    
//    WebElement checkbox = 	driver.findElement(By.xpath("//span[contains(@role,'checkbox')]"));
//    checkbox.click();
//    Thread.sleep(2000);
//    WebElement submitButton = 	driver.findElement(By.xpath("//input[contains(@value, 'Get a Free Demo')]"));
//    submitButton.click();
    
    
    
//    JavascriptExecutor js  = (JavascriptExecutor)driver;
//    js.executeScript("arguments[0].scrollIntoView(true);", submitButton);
//    Thread.sleep(2000);
//    js.executeScript("window.scrollBy(0,1000)");
//    Thread.sleep(2000);
//    js.executeScript("window.scrollBy(0,-1000)");
//    Thread.sleep(3000);
//    js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//    
//    Thread.sleep(2000);
 

    
   // js.executeScript("arguments[0].click());", submitButton);
   
 
	}

}
