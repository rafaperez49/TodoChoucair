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
Feature: Title of your feature
  I want to use this template for my feature file

  @CasoExitoso
  Scenario: Buscar Dirección mas cercana
    Given Ingresar a la pagina "https://www.grupobancolombia.com/wps/portal/personas/buscador-sucursales"
    And Ingresar direccion "Carrera 57 #69-27, Bello,Antioquia,Colombia"
    When Presiono click en buscar
    Then Muestra la direccion mas cercana
    

