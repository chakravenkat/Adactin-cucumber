package com.adactin.stepdef;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.runner.Runner_Class;
import com.bassmethods.Bass_Class;
import com.singleDesignPattern.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition_Class extends Bass_Class{
	public static WebDriver driver=Runner_Class.driver;
	PageObjectManager pom=new PageObjectManager(driver);
	
	@Given("User Launch the application")
	public void user_launch_the_application() {
		
		get("https://adactinhotelapp.com/");
		
		wait("implicit");
		
	
	}
	
	
	@When("User enter the username")
	public void user_enter_the_username() throws InterruptedException {
		sleep(2000);
		//driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("chakravarthivenkat");
	InputOnElement(pom.getLogInPage().getUsername(),"chakravarthivenkat");
	}
	
	
	@When("user enter the paasword")
	public void user_enter_the_paasword() {
		InputOnElement(pom.getLogInPage().getPassword(),"9966352061");
	}
	
	
	@Then("User clicks the login button and  Navigate to search hotel page")
	public void user_clicks_the_login_button_and_navigate_to_search_hotel_page() {
		click(pom.getLogInPage().getLoginBtn());
		
		
	}


	@When("user select the location from the dropdown")
	public void user_select_the_location_from_the_dropdown() {
		select(pom.getSearchHotel().getLocation(),"value","Melbourne");
		
	}
	
	
	@When("user select the hotel from the dropdown")
	public void user_select_the_hotel_from_the_dropdown() {
		
		select(pom.getSearchHotel().getSelectHotel(),"text","Hotel Hervey");
	}
	
	
	@When("user select the room type from the dropdown")
	public void user_select_the_room_type_from_the_dropdown() {
		select(pom.getSearchHotel().getRoomtype(),"index","2");
	}
	
	
	@When("user select the number of rooms the dropdown")
	public void user_select_the_number_of_rooms_the_dropdown() {
		select(pom.getSearchHotel().getNumberOfrooms(),"text","2 - Two");
	}
	
	
	@When("user enter the checkin date")
	public void user_enter_the_checkin_date() {
InputOnElement(pom.getSearchHotel().getCheckindate(), "01/10/2022");		
	}
	
	
	@When("user enter the checkout date")
	public void user_enter_the_checkout_date() {
		InputOnElement(pom.getSearchHotel().getCheckoutdate(),"05/10/2022");
	}
	
	
	@When("user select the Adults per room from the dropdown")
	public void user_select_the_adults_per_room_from_the_dropdown() {
		select(pom.getSearchHotel().getAdultperroom(),"value","3");
	}
	
	
	@When("user select the children per room from the dropdown")
	public void user_select_the_children_per_room_from_the_dropdown() {
		select(pom.getSearchHotel().getChildrenperroom(),"index","2");
	}
	
	
	@Then("user click the search button and navigate to select hotel page")
	public void user_click_the_search_button_and_navigate_to_select_hotel_page() throws InterruptedException {
		click(pom.getSearchHotel().getSubmit());
		sleep(2000);
	}
	
	
	
	@When("user select the second radio button from the list of select hotel page")
	public void user_select_the_second_radio_button_from_the_list_of_select_hotel_page() throws Throwable {
		screenshot("selectedhotel");
		click(pom.getSelectHotel().getRadioBtn());
	}
	
	
	@Then("user click the continue button and navigate to the book a hotel page")
	public void user_click_the_continue_button_and_navigate_to_the_book_a_hotel_page() {
		click(pom.getSelectHotel().getContinueBtn());
	}
	
	
	@When("user enter the first name")
	public void user_enter_the_first_name() {
		InputOnElement(pom.getBookHotel().getFirstname(),"Vandu");
		
	}
	
	
	@When("user enter the Last name")
	public void user_enter_the_last_name() {
		InputOnElement(pom.getBookHotel().getLastname(),"Murugan");
	}
	
	
	@When("user enter billing address")
	public void user_enter_billing_address() {
		InputOnElement(pom.getBookHotel().getBillingAddress(),"No.7,Viveganandhar theru,Dubai kuruku sandhu,Dubai");
		
	}
	
	
	@When("user enter {int} digit credit card number")
	public void user_enter_digit_credit_card_number(Integer int1) {
		InputOnElement(pom.getBookHotel().getCreditnum(),"1234567898745632");
	}
	
	
	@When("user select the credit card type from the dropdown")
	public void user_select_the_credit_card_type_from_the_dropdown() {
		select(pom.getBookHotel().getCredittype(),"value","MAST");
	}
	
	@When("user select the expiry month of  credit card from dropdown")
	public void user_select_the_expiry_month_of_credit_card_from_dropdown() {
		select(pom.getBookHotel().getExpiryMonth(),"text","November");
	}
	@When("user select the expiry year of credit card from dropdown")
	public void user_select_the_expiry_year_of_credit_card_from_dropdown() {
		select(pom.getBookHotel().getExpiryyear(),"value","2022");
	}

	@When("user enter the CVV number")
	public void user_enter_the_cvv_number() {
		InputOnElement(pom.getBookHotel().getCvvNum(),"123");
	}
	
	@When("user  should take screenshot here")
	public void user_should_take_screenshot_here() throws IOException, InterruptedException {
		sleep(3000);
		screenshot("userdata2");
	}
	@Then("user click the book button and navigate to the Bookin conformation page")
	public void user_click_the_book_button_and_navigate_to_the_bookin_conformation_page() {
		click(pom.getBookHotel().getBooknowbtn());
	}
	
	
	
	@Then("user click the my Itinerary and navigate to booked itinerary page")
	public void user_click_the_my_itinerary_and_navigate_to_booked_itinerary_page() {
	click(pom.getMyItenararyPage().getMyitnerarybtn());	
	}
	@When("user should take screenshot of their booking conformation")
	public void user_should_take_screenshot_of_their_booking_conformation() throws IOException, InterruptedException {
		sleep(2000);
		
	}
	@Then("user clicks the logout button and navigate to log out page")
	public void user_clicks_the_logout_button_and_navigate_to_log_out_page() throws IOException {
		screenshot("confirmation");
		click(pom.getBookedItenararyPage().getLogOuutBtn());
	}









	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
