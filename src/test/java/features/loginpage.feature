

Feature: Login page and Reset Password
  

  @ValidScenario
Scenario: Home page login with admin credentials
    Given User is an landing page
    When User login into application with "Roopa" and Passord "rahulshettyacademy"
    Then HomePage is Successfully login
    And logout the page
 
 @INvalidScenario   
Scenario: Home page login with bad credentials
    Given User is an landing page
    When User login into application with "Roopa" and Passord "rahulshetty"
    Then HomePage is not Successfully login
    
  @ValidScenario  
Scenario: User initiates password reset
    Given User is an landing page
    When  user clicks on the "Forgot Password" link
    Then  reset the password
    
   Example
   |username|Password|
   |Pranathi|mgr@gmail|
   






