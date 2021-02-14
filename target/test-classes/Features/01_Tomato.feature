#Author : Nandhini
Feature: To Check the Automation Practise 

   @Regression @Automation
  Scenario Outline: Login
    Given launch the website
    Given Navigate to create an account
    Given enter "<Email>" and "<Password>"
    Then user logout

    Examples: 
      | Email                         | Password |
      | testautomation@mailinator.com | test@123 |
      
       
    @Automation
    Scenario Outline: Login
    Given launch the website
    Given Select the category "<Category>"
    
    Examples: 
      | Category | TEst |
      | Dresses  | test@123 |
      
	
