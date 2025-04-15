package com.pwiddy.pom;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Homepage {
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement searchtextfield;
	@FindBy(xpath = "//button[text()='Search']")
	private WebElement searchbutton;
	@FindBy(linkText = "Register")
	private WebElement registerlink;
	@FindBy(linkText = "Sign In")
	private WebElement singinlink;
	@FindBy(tagName = "h2")
	private WebElement restaurant;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void setsinginlink() {
		singinlink.click();
	}
	public void setregisterlink(){
		registerlink.click();
		
	}
	public void setsearch(String restaurantname) {
		searchtextfield.sendKeys(restaurantname);
		searchbutton.click();
		restaurant.click();
	}
 
}
