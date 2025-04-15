package com.pwiddy.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.pwiddy.generic.Baseclass;
import com.pwiddy.pom.Homepage;
import com.pwiddy.pom.cartpage;
import com.pwiddy.pom.checkoutpage;
import com.pwiddy.pom.menupage;

public class orderwithoutcarddetails extends Baseclass{
	
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
		checkoutpage cop=new checkoutpage(driver);
		String cardname = f.getExcelData("address", 3, 7);
		String cardnum = f.getExcelData("address", 3, 8);
		String edate = f.getExcelData("address", 3, 9);
		String cvv = f.getExcelData("address", 3, 10);
		cop.carddetails(cardname, cardnum, edate, cvv);
	}
}
