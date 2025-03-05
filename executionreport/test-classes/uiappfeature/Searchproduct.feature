Feature: Search product
@functional
Scenario: verify search product functionality
Given I am at the landing page
When I search product as "mobile"
Then I should see the results