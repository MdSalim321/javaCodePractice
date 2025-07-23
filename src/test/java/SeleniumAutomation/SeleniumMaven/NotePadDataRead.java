package SeleniumAutomation.SeleniumMaven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class NotePadDataRead {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./DataSheet/commonData.property");
		
		Properties p = new Properties();
		p.load(fis);
		
		String userName = p.getProperty("UserName");
		String password = p.getProperty("Password");
		System.out.println(userName +" "+password);
		
		

	}
}
