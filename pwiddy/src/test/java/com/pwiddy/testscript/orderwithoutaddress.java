package com.pwiddy.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.pwiddy.generic.Baseclass;
import com.pwiddy.pom.Homepage;
import com.pwiddy.pom.cartpage;
import com.pwiddy.pom.menupage;

public class orderwithoutaddress extends Baseclass{
	
	
	public void withoutaddress() throws EncryptedDocumentException, IOException {
	Homepage h=new Homepage(driver);
	String restaurant = f.getExcelData("address", 3, 0);
	h.setsearch(restaurant);
	menupage m=new menupage(driver);
	String menu = f.getExcelData("address", 3, 1);
	System.out.println(menu);
	m.menuselectbutton(menu);
	String foodname = f.getExcelData("address", 3, 2);
	m.setaddfood(foodname);
	cartpage c=new cartpage(driver);
	c.setprocedtocheck();
}
}
