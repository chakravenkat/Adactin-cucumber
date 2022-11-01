package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	public static WebDriver driver;
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstname;
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastname;
	@FindBy(xpath = "//textarea[@rows='4']")
	private WebElement BillingAddress;
	public BookHotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getBillingAddress() {
		return BillingAddress;
	}
	public WebElement getCreditnum() {
		return creditnum;
	}
	public WebElement getCredittype() {
		return credittype;
	}
	public WebElement getExpiryMonth() {
		return ExpiryMonth;
	}
	public WebElement getExpiryyear() {
		return Expiryyear;
	}
	public WebElement getCvvNum() {
		return CvvNum;
	}
	
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement creditnum;
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement credittype;
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement ExpiryMonth;
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement Expiryyear;
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement CvvNum;
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement Booknowbtn;
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getBooknowbtn() {
		return Booknowbtn;
	}
	
	
	
	
	
	
	
	

}
