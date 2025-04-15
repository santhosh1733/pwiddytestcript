package com.pwiddy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createyouraccountpage {
	@FindBy(id = "name")
	private WebElement nametextfield;
	@FindBy(id = "email")
	private WebElement emailidtextfield;
	@FindBy(id = "password")
	private WebElement passwordtextfield;
	@FindBy(id = "confirmPassword")
	private WebElement confirmpasswordtextfield;
	@FindBy(xpath = "//button[text()='Create account']")
    private WebElement createaccountbutton;

	public createyouraccountpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void createaccount(String name, String emailid, String password, String confirmpassword) {
		nametextfield.sendKeys(name);
		emailidtextfield.sendKeys(emailid);
		passwordtextfield.sendKeys(password);
		confirmpasswordtextfield.sendKeys(confirmpassword);
		createaccountbutton.click();
	}
}
