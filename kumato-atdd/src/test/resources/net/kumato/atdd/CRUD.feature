Feature: CRUD
	As an User
	I want to Create, Read, Update and Delete contacts
	So I can build and maintain my contact book
	
Scenario: Empty Database

Scenario: Add a non-existing Contact
	Given an empty database
	When I add the contact "Natacha"
	Then the database contains the contact "Natacha"

Scenario: Add an already existing Contact

Scenario: Read a non-existing Contact

Scenario: Read an already existing Contact
