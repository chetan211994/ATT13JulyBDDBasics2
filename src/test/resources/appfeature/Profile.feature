Feature: Manage profile functionality

Background:
Given I have logged into the application
And I am at home page

Scenario: Addition of profile
When I click on add button
And I enter the data
Then profile should get added

Scenario: Updation of profile
When I click on edit button
And I update the details
Then profile should get updated

Scenario: Deletion of profile
When I click on delete button
Then profile should get deleted
