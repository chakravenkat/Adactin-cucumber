package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyItenararyPage {
	public static WebDriver driver;
	
	
	@FindBy(xpath = "//input[@name=\"my_itinerary\"]")
private WebElement myitnerarybtn;

	public MyItenararyPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMyitnerarybtn() {
		return myitnerarybtn;
	}
}
