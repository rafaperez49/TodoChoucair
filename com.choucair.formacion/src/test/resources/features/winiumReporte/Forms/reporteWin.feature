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
@RW
Feature: Generar reporte de Winium
  

  @ingresoFallido
  Scenario: Ingreso Fallido
  Given abrir la aplicacion "C:\Program Files (x86)\HP\Unified Functional Testing\samples\Flights Application\FlightsGUI.exe" usando Winium "C:\Users\rperezr\Downloads\com.choucair.base\src\test\resources\driver\Winium.Desktop.Driver.exe"
  When ingresar usuario y clave
  Then generar reporte "D:/exito/evidencia.png"
    
 
