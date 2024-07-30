Feature: Opening bank account
Scenario: Opening bank account with nominee
Given user is at the accounts page
When user enters the following data
| firstname | lastname | email | phone |
| Erin | Smith | erin.smith@gmail.com | 9988776655 |
| Robert | Jackson | rober.jackson@gmail.com | 9876543210 |
And user clicks on submit button
Then user should get confirmation