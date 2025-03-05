Feature: Homepage functionality
@sanity
Scenario: validation of title of page
Given I am at the landing page
Then page title should have "Shopping"

@sanity
Scenario: verify cart icon
Given I am at the landing page
Then cart icon should get display

@regression
Scenario: checkout the deals section
Given I am at the landing page
When I click on sports section
Then cricket tab should get display