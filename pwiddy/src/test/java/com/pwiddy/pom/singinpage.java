package com.pwiddy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class singinpage {
	
	@FindBy(id = "email-address")
	private WebElement emailaddresstextfield;
	@FindBy(id = "password")
	private WebElement passwordtextfield;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement singinbutton;
	public singinpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void setsingin(String emailid,String password) {
		emailaddresstextfield.sendKeys(emailid);
		passwordtextfield.sendKeys(password);
		singinbutton.click();
	}
}
