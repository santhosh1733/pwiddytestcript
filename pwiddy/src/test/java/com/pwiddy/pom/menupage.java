package com.pwiddy.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class menupage {
	@FindBy(tagName = "h3")
	private List<WebElement> foodname;
	@FindBy(xpath = "//h3[text()='Generic Metal Salad']/../../..//button")
	private WebElement addfoodtocart;
	@FindBy(tagName = "a")
	private WebElement cartbutton;
	@FindBy(xpath = "//button[text()='Desserts']")
	private WebElement dessertbutton;
	@FindBy(xpath = "//button[text()='Drinks']")
	private WebElement drinksbutton;
	@FindBy(xpath = "//button[text()='Sides']")
	private WebElement sidesbutton;
	@FindBy(xpath = "//button[text()='Main Course']")
	private WebElement mainCoursebutton;
	@FindBy(xpath = "//button[text()='Appetizers']")
	private WebElement appetizersbutton;
	@FindBy(xpath = "//button[text()='Specials']")
	private WebElement specialsbutton;
	@FindBy(xpath = "//span[contains(text(),'Closed ')]")
	private WebElement status;
	
	
	
	public menupage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void menuselectbutton(String menuname) {
		
	switch(menuname) {
	case "Desserts":dessertbutton.click();
	break;
	case "Drinks":drinksbutton.click();
	break;
	case"Sides":sidesbutton.click();
	break;
	case"Main Course":mainCoursebutton.click();
	break;
	case"appetizers":appetizersbutton.click();
	break;
	case"Specials":specialsbutton.click();
	break;
		
	
	}
	}
 
 
 public void setaddfood(String nameoffood) {
		 addfoodtocart.click();
		 cartbutton.click();
 }
 }
	
	 
 


