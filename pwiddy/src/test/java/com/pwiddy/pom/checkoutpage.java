package com.pwiddy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class checkoutpage  {
	@FindBy(xpath = "//label[text()='Cash on Delivery']")
	private WebElement cashpayment;
	@FindBy(xpath = "//label[text()='Credit/Debit Card']")
	private WebElement cardpayment;
	@FindBy(id = "address")
	private WebElement streetaddress;
	@FindBy(id = "city")
	private WebElement cityname;
	@FindBy(id = "zipCode")
	private WebElement zipcode;
	@FindBy(id = "phone")
	private WebElement phonenum;
	@FindBy(id = "name")
	private WebElement nameoncard;
	@FindBy(id = "number")
	private WebElement cardnumber;
	@FindBy(id = "expiry")
	private WebElement expirydate;
	@FindBy(id = "cvv")
	private WebElement cvvnumber;
	@FindBy(linkText = "Return to Cart")
	private WebElement returntocartbutton;
	@FindBy(xpath = "//span[text()='Total']/../span[2]")
	private WebElement total;
	@FindBy(xpath = "//button[text()='Place Order']")
	private WebElement button;
	
	public checkoutpage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void paymentmethod(String payment) {
		String pay = cardpayment.getText();
		if(pay.equalsIgnoreCase(payment)) {
			cardpayment.click();
		}
		else {
			cashpayment.click();
		}
		
	}
	public void address(String street, String city,String zip, String phone) {
		for(int i=0;street.length()>=0;i++) {
			char cha = street.charAt(i);
			String res = "";
			if(cha>=65 && cha<=90 || cha>=97 && cha<=122 || cha==32) {
				res=cha+res;
				streetaddress.sendKeys(res);
			}
			else {
				Reporter.log("enter valied street address", true);
			}
		}
		for(int i=0;city.length()>=0;i++) {
			char cha1 = city.charAt(i);
			String res1 = "";
			if(cha1>=65 && cha1<=90 || cha1>=97 && cha1<=122 ) {
				res1=cha1+res1;
				cityname.sendKeys(res1);
			}
			else {
				Reporter.log("enter valied city", true);
			}
		}
		if(zip.length()==6) {
		for(int i=0;zip.length()>=0;i++) {
			char cha2 = zip.charAt(i);
			String res2 = "";
			if(cha2>=48 && cha2<=57 ) {
				res2=cha2+res2;
				zipcode.sendKeys(res2);
			}
			else {
				Reporter.log("enter valied zip", true);
			}
		}
		}else {
			Reporter.log("enter valied zip", true);
		}
		if(phone.length()==10) {
		for(int i=0;phone.length()>=0;i++) {
			char cha3 = phone.charAt(i);
			String res3 = "";
			if(cha3>=48 && cha3<=57 ) {
				res3=cha3+res3;
				phonenum.sendKeys(res3);
			}
			else {
				Reporter.log("enter valied phonenumber", true);
			}
		}
	}else {
		Reporter.log("enter valied phonenumber", true);
	}
	}
	
	
	public void carddetails(String holdername, String cadrnumber,String date, String cvv) {
		for(int i=0;holdername.length()>=0;i++) {
			char cha = holdername.charAt(i);
			String res = "";
			if(cha>=65 && cha<=90 || cha>=97 && cha<=122 || cha==32) {
				res=cha+res;
				nameoncard.sendKeys(res);
			}
			else {
				Reporter.log("enter valied card holder name", true);
			}
		}if(cadrnumber.length()== 16) {
		for(int i=0;cadrnumber.length()>=0;i++) {
			char cha1 = cadrnumber.charAt(i);
			String res1 = "";
			if(cha1>=48 && cha1<=57 ) {
				res1=cha1+res1;
				cardnumber.sendKeys(res1); 
			}
			else {
				Reporter.log("enter valied cardnumber", true);
			}
		}
		if(date.length()==5) {
		for(int i=0;date.length()>=0;i++) {
			char cha2 = date.charAt(i);
			String res2 = "";
			if(cha2>=48 && cha2<=57 ) {
				res2=cha2+res2;
				expirydate.sendKeys(res2);
			}
			else {
				Reporter.log("enter valied date", true);
			}
		}
		}else {
			Reporter.log("enter valied date", true);
		}
		if(cvv.length()==3) {
		for(int i=0;cvv.length()>=0;i++) {
			char cha3 = cvv.charAt(i);
			String res3 = "";
			if(cha3>=48 && cha3<=57 ) {
				res3=cha3+res3;
				cvvnumber.sendKeys(res3);
			}
			else {
				Reporter.log("enter valied cvvnumber", true);
			}
		}
	}else {
		Reporter.log("enter valied cvvnumber", true);
	}
	}
	
	}
	
	
	
	public void placeorder() {
	    boolean name = nameoncard.getAttribute("value").isEmpty();
		boolean num = cardnumber.getAttribute("value").isEmpty();
		boolean edate = expirydate.getAttribute("value").isEmpty();
		boolean cnum = cvvnumber.getAttribute("value").isEmpty();
		
		if(name== true && num == true && edate == true && cnum == true) {
			button.click();
		}
		
	}
}
