Feature: Homepage Functionality

Scenario: Validate Title
Given the user is at the Homepage
Then page title should contain "Your Store"

Scenario: Verify Shopping cart icon
Given the user is at the Homepage
Then shopping cart icon should be displayed

Scenario: Checkout featured section
Given the user is at the Homepage
When user clicks on iPhone
Then user should able to see brand name "Apple"

Scenario Outline: Login to App
Given the user is at the Homepage
When user clicks on my account dropdown
And user clicks on login option
And user enters "<Emailaddress>" and "<Password>"
And user clicks login button
Then user should be redirected to the "My Account" page

Examples:
|Emailaddress			 			|Password     |
|virajvelocity@gmail.com|Velocity@1234|