package com.pwiddy.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pwiddy.generic.Baseclass;
import com.pwiddy.pom.Homepage;
import com.pwiddy.pom.menupage;
@Listeners(com.pwiddy.generic.listenerimplimentaion.class)
public class orderFood extends Baseclass{
	public void restaurant() throws EncryptedDocumentException, IOException, InterruptedException {
		Homepage h=new Homepage(driver);
		String restaurant = f.getExcelData("address", 2, 0);
		h.setsearch(restaurant);
		menupage m=new menupage(driver);
		String menu = f.getExcelData("address", 2, 1);
		System.out.println(menu);
		m.menuselectbutton(menu);
		String foodname = f.getExcelData("address", 2, 2);
		m.setaddfood(foodname);
	}

}
