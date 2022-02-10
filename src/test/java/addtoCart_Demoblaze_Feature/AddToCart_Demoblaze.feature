#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Add to Cart
 
  @tag1
  Scenario: Checking Funtionality of Add To Cart
    Given User must be on homepage after Login by clicling url "https://www.demoblaze.com/"
    And User Clicks on Laptop option
    And User selects any Laptop name
    And A new page opens with image of Laptop and ADD TO CART button
   
    When User clicks on ADD TO CART button
    And  User Should be able to Click OK button on Alert window
   
    Then  User navigtes back to Cart Page and veryfy that productis added or not
    

