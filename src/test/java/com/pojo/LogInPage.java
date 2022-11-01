package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	public static WebDriver driver;
	@FindBy(name = "username")
	private WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	public LogInPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath = "//input[@name='login']")
	private WebElement loginBtn;

	public WebElement getLoginBtn() {
		return loginBtn;
	}

}
