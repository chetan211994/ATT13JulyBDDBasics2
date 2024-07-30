Feature: Sending email campaign
@sanity
Scenario: Create campaign
Given user should be at campaign page
When user clicks on create campaign
And user enters the information
Then campaign should get created

@regression
Scenario: update campaign
Given user should be at campaign page
When user click on edit campaign button
And user update the details
Then campaign should get updated

@functional @sanity
Scenario: delete campaign
Given user should be at campaign page
When user click on delete button
Then campaign should get deleted