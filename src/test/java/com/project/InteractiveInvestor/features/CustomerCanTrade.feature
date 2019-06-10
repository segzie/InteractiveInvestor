Feature: Search 
	As a customer I want the ability to search for any investment of my choice 
	So that I can trade
	
	Scenario:  Customer can search for clothes
		Given I navigate to interactive investor homepage
		When I click the cookies  
		When I click the search button
		And I enter gbpusd into search field 
		Then I click on the first of the search result