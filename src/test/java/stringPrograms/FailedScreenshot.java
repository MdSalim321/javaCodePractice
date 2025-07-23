
	
	
package stringPrograms

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FailedScreenshot implements ITestListener {
    public static WebDriver driver;

    @Override
    public void onTestFailure(ITestResult result) {
        if (driver != null) {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String testName = result.getName();
            try {
                FileUtils.copyFile(src, new File("screenshots/" + testName + ".png"));
                System.out.println("📸 Screenshot saved: screenshots/" + testName + ".png");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
    
	



