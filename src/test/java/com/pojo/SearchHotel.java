package com.pojo;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public static WebDriver driver;
	@FindBy(xpath = "//select[@name='location']")
	private WebElement Location;
	
	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement selectHotel;
	
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement Roomtype;
	
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement NumberOfrooms;
	
	@FindBy(xpath = "(//input[@type=\"text\"])[2]")
	private WebElement checkindate;
	
	@FindBy(xpath = "(//input[@type=\"text\"])[3]")
	private WebElement checkoutdate;
	
	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement Adultperroom;
	
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement childrenperroom;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

	public SearchHotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return Location;
	}

	

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getRoomtype() {
		return Roomtype;
	}

	public WebElement getNumberOfrooms() {
		return NumberOfrooms;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdultperroom() {
		return Adultperroom;
	}

	public WebElement getChildrenperroom() {
		return childrenperroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

}

