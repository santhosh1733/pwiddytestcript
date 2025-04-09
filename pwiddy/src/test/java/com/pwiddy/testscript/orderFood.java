package com.pwiddy.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.pwiddy.generic.Baseclass;
import com.pwiddy.pom.Homepage;

public class orderFood extends Baseclass{
	@Test
	public void restaurant() throws EncryptedDocumentException, IOException {
		Homepage h=new Homepage(driver);
		String restaurant = f.getExcelData("address", 1, 0);
		String street = f.getExcelData("address", 1, 1);
		String city = f.getExcelData("address", 1, 2);
		String zip = f.getExcelData("address", 1, 3);
		String phone = f.getExcelData("address", 1, 4);
		h.searchbar(restaurant,street,city,zip,phone);
	}

}
