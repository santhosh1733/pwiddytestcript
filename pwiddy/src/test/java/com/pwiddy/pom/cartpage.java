package com.pwiddy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartpage {
	@FindBy(xpath = "//button[text()='Proceed to Checkout']")
	private WebElement  checkoutbutton;
	@FindBy(xpath = "//span[text()='Total']/..//span[2]")
	private WebElement total;
	@FindBy(xpath = "Clear Cart")
	private WebElement clearcartbutton;
	@FindBy(linkText = "Return to Cart")
	private WebElement returncart;
	
	
	public cartpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void setprocedtocheck() {
		checkoutbutton.click();
	}
}
