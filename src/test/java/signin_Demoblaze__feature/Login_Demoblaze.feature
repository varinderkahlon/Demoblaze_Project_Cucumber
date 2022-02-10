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
Feature: Login Form
 

  @tag1
  Scenario Outline: Checking Functionality of Login Form
    Given User must be on homepage by clicling url "https://www.demoblaze.com/"
    And   User clicks on Login Link
    And   Login Dialog Box should display
   
    When User Enter <Login_username> and <Login_password> in Login form
    And  User clicks on Login button
   
    Then User should be able to Login to Homepage
   
Examples:
|Login_username				|Login_password
|Varinder_Admin_Test	|Login_password
 