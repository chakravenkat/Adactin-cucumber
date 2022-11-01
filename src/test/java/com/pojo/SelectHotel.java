package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
public static WebDriver driver;
	@FindBy(xpath = "//input[@type=\"radio\"]")
	private WebElement RadioBtn;
	@FindBy(xpath = "//input[@type=\"submit\"]")
	private WebElement continueBtn;

	public SelectHotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}

	public WebElement getRadioBtn() {
		return RadioBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

}
