


   Feature: Search for a product on a shopping website

   Scenario: Search for a product
    Given I am on the shopping website
    When I search for "shoes" in the search bar
    Then I should see a list of search results for "shoes"
    And the search results should contain at least 5 products
    And I click on the search button
    Then close Browser


   Scenario: Search for best sellers
    Given I am on the shopping website
    When I hower the mouse on All searchDropdownBox it shows the ToolTip search in
    When I should click on Best sellers it shows the results
    Then close Browser
    
    Scenario: Select the address
    Given I am on the shopping website
    When  I click on Hello select your address
    When I give "410209" pincode in textbox
    Then I click on apply
    Then close Browser
    