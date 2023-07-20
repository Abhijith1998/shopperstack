package utilityLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadTestData implements FrameworkConstants {
	public File absPath = new File(EXCEL_PATH);
	public Workbook workbook = null;

	public String readDataFromPropertyFile(String key) {
		File absPath;
		FileInputStream fis;
		Properties prop = null;
		try {
			absPath = new File(PROPERTYFILE_PATH);
			fis = new FileInputStream(absPath);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}

	public String readStringDataFromExcel(String sheetName, int row, int col) {
		try {
			FileInputStream fis = new FileInputStream(absPath);
			try {
				workbook = WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
	}
}
