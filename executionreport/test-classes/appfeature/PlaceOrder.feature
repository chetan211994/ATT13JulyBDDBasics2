Feature: Placing order feature
Scenario: Order confirmation
Given I should be at product page
When I click on add to cart button
Then Product should get added
When I click on place order
Then Order should get placed

Scenario: title confirmation
Given I should be at product page
Then page title should contains "productpage"