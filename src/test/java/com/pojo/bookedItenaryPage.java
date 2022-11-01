package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookedItenaryPage {
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@name='logout']")
    private WebElement logoutbtn;

	public bookedItenaryPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
}
