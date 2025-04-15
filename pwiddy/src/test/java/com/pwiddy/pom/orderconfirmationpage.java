package com.pwiddy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderconfirmationpage {
	@FindBy(xpath = "//h1[text()='Thank you for your order!']")
	private WebElement confirmationtext;
	@FindBy(xpath = "//span[text()='Total']/../span[2]")
	private WebElement total;
	@FindBy(xpath = "Payment Method")
	private WebElement paymentmethod;
	
	
	
	
	public orderconfirmationpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
}
