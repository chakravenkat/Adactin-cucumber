package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItenararyPage {
public static WebDriver driver;
	@FindBy(xpath = "//input[@name=\"logout\"]")
	private WebElement LogOutBtn;

	public BookedItenararyPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getLogOuutBtn() {
		return LogOutBtn;
	}
}