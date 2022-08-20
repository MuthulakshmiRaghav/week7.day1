Feature: Create Leads in LeafTaps application

Background: Positive Login
Given Enter the Username as 'DemoSalesManager'
And Enter the Password as 'crmsfa'
When Click the Login Button
Then Verify the Home Page is displayed

Scenario Outline: 
Given Click CRMSFA Link
And Click leads button
And Click create lead link
When Enter companyName as <companyName>
And Enter firstName as <firstName>
And Enter lastName as <lastName>
And Enter department as <department>
And Enter email as <email>
And Click create button
Then Verify the View Leads Page

Examples:
|companyName|firstName|lastName|department|email|
|Perficient|Muthu|Lakshmi|QA|sairaghav27@gmail.com|
|Infosys|Sai|Mahi|QA|sai@gmail.com|