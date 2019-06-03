Feature: Add to cart

Scenario: User Adds product to cart

Given User launches Testmeapp and enter into login page
When User enters into username
When user enters password
When User clicks login
When User searches for product
When User clicks finddetails
When user clicks proceed without clicking addtocart

Scenario: User Without adding cart to product
Given User launches Testmeapp and enter into login page
When User enters into username
When user enters password
When User clicks login
When User searches for product
When User clicks finddetails
When user clicks addtocart
When user clicks on cart
When user clicks on checkout
When user clicks proceed to pay
When user clicks bank option
When User clicks on continue
When User enters Username
When User enters Password
When User clicks login