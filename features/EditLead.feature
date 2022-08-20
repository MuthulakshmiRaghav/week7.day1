Feature: Edit Leads in LeafTaps application 

Background: Positive Login 
	Given Enter the Username as 'DemoSalesManager' 
	And Enter the Password as 'crmsfa' 
	When Click the Login Button 
	Then Verify the Home Page is displayed 
	
Scenario Outline: Change the Company Name in Leads Record 
	Given Click Crmsfa link 
	And Click Leads button link 
	And Click Find leads 
	When Enter first name as <firstName> 
	And Click Find leads button 
	And Click on first resulting lead 
	And Click Edit 
	And Change the companyName as <companyName> 
	And Click Update 
	Then Verify the changed name appears 
	
	Examples: 
		|firstName|companyName|
		|Muthu|Infosys|
