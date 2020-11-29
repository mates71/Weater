//added this feature to release branch 12-10-2020
@chase
Feature: Login page functunalities
Scenario: COL login flow
	Given I am COL lofin page
	And I enter userName in userId field
	When  I enter password in password field
	And I click on login button
	Then I verify myAccond page is displayed
	
	
