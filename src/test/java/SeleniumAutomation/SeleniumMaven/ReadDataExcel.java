package SeleniumAutomation.SeleniumMaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcel {

	public static void main(String[] args) throws IOException {
		
		File f = new File("./DataSheet/testData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sht = wb.getSheetAt(0);
		Row rw = sht.getRow(0);
		
		String data = rw.getCell(0).getStringCellValue();
		System.out.println(data);
		
		Cell cl = rw.createCell(10);
		cl.setCellValue("WritingData");
		fis.close();
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		
		fos.close();
		wb.close();
		
		
		
		
		
	}

}
