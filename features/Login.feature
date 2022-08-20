Feature: Login to the LeafTaps application 

Scenario: Positive Login 
	Given Enter the Username as 'DemoSalesManager' 
	And Enter the Password as 'crmsfa' 
	When Click the Login Button 
	Then Verify the Home Page is displayed 
	
Scenario: Negative Login 
	Given Enter the Username as 'Demouser' 
	And Enter the Password as 'crmsfa1' 
	When Click the Login Button 
	But Error message is displayed 
