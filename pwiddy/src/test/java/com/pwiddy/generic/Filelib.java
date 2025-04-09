package com.pwiddy.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib {
	public static String getpropertdata(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
		
	}
	public String getExcelData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	}

}
