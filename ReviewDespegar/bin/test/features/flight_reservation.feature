#Author: ysikvillamizarl@gmail.com

@tag
Feature: Make a fligth reservation
  As a web user
  She want to make a flight reservation 
  To do test using the programming Cucumber a Guerkin.

  @tag1
  Scenario: Successfull flight reservation from main Despegar website  
    Given that the Autor looking for a flight reservation
    When the Actor insert the data from flight

    |originCity|destinationCity|departurDate|returnDate|
    | Medellin |   Cartagena   |    29      |    31    | 
    
    And the Actor insert the personal data
    Then the Actor should see the personal data on screen
   

 # @tag2
  #Scenario Outline: Error message whe the actor try to validate the flight with blank destination 
   # Given that the Autor looking for a flight reservation
    #When the Actor insert data from flight <originCity> ,<departureDate> and <returnDate> on screen
    #Then the Actor should see a error message ingresa un destino

    #Examples: 
     # | originCity | departureDate | returnDate  |
      #| Medell�n   |     29        |     31      |
      
