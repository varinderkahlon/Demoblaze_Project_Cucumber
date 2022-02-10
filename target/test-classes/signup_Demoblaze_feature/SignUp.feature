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
Feature: Signup Form
  

  @tag1
  Scenario Outline: Checking Functionality of Signup form
    Given User must be on home page by clicling url "https://www.demoblaze.com/"
    And User clicks on Signup Link
    And Signup Dialog Box should display
   
    When User Enter <SignUp_username> and <SignUp_password>
    And  User clicks on Signup button
    
    Then User clicks on Ok button on Alert window
   
    Examples: 
    |SignUp_username		|SignUp_password|
    |Varinder_Admin_Test|admin123				|
