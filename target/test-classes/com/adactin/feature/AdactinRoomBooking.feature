Feature: Hotel Booking Using Adactin Application

Scenario: LogIn Functinality
Given User Launch the application
When  User enter the username
And user enter the paasword
Then  User clicks the login button and  Navigate to search hotel page

Scenario: To Check The Search hotel Page
When  user select the location from the dropdown
And  user select the hotel from the dropdown
And  user select the room type from the dropdown
And  user select the number of rooms the dropdown
And  user enter the checkin date
And  user enter the checkout date 
And  user select the Adults per room from the dropdown
And  user select the children per room from the dropdown
Then  user click the search button and navigate to select hotel page


Scenario: To Check Select Hotel Page Functionality
When  user select the second radio button from the list of select hotel page 
Then  user click the continue button and navigate to the book a hotel page


Scenario: To Check Book A Hotel Page Functionality
When  user enter the first name 
And   user enter the Last name
And   user enter billing address
And   user enter 16 digit credit card number
And   user select the credit card type from the dropdown
And   user select the expiry month of  credit card from dropdown
And   user select the expiry year of credit card from dropdown
And   user enter the CVV number
And  user  should take screenshot here
Then  user click the book button and navigate to the Bookin conformation page 


Scenario: To Check Booking Conformation page Functionality
When  user should take screenshot of their booking conformation
Then  user click the my Itinerary and navigate to booked itinerary page


Scenario: To Check Booked Itinerary Page Functionality
Then  user clicks the logout button and navigate to log out page 
