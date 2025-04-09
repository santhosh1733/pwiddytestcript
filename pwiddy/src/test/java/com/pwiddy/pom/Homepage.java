package com.pwiddy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement searchtextfield;
	@FindBy(xpath = "//button[text()='Search']")
	private WebElement searchbutton;
	@FindBy(xpath = "//h2[text()='West, Mayer and Wintheiser']")
	private WebElement restaurantname;
	@FindBy(xpath = "//h3[text()='Rustic Metal Pizza']/..//button[text()='Add to Cart']")
	private WebElement addcart;
	@FindBy(tagName = "a")
	private WebElement cartbutton;
	@FindBy(xpath = "//button[text()='Proceed to Checkout']")
	private WebElement  checkoutbutton;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(id = "city")
	private WebElement cityname;
	@FindBy(id = "zipCode")
	private WebElement zipcode;
	@FindBy(id = "phone")
	private WebElement phonenum;
	@FindBy(xpath = "//button[text()='Place Order']")
	private WebElement button;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
  public void searchbar(String name,String street,String city,String zip,String phone) {
	  searchtextfield.sendKeys(name);
	  searchbutton.click();
	  restaurantname.click();
	  addcart.click();
	  cartbutton.click();
	  checkoutbutton.click();
	  address.sendKeys(street);
	  cityname.sendKeys(city);
	  zipcode.sendKeys(zip);
	  phonenum.sendKeys(phone);
	  button.click();
  }

}
