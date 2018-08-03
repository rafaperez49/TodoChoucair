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
@Regresion
Feature: Formulario Pop Validation
El usuario debe poder ingresar los datos requeridos.
Cada campo del formulario valida datos de obligatoriedad, longitud y formato, el sistema
debe brindar las validaciones respesctivas de cada campo en un globo informativo. 


  @CasoExitoso
  Scenario: Diligenciamiento exitoso del formulario popup validation
    Given Autentico colorlib con usuario "admin" y password "admin"
    And Ingreso a la funcionalidad Forms Validation
    When Diligencio formulario Popup Validation
    
    | Required | Select | MultipleS1 | MultipleS2 | Url                  | E-mail                     | Password | Password2 | Minsize | Maxsize   | Number | IP           | Date       | DateEarlier |
    | Valor 1  | Golf   |   Tennis   |  Golf      |http://www.google.com | rperez@choucairtesting.com | 123456   | 123456    | 123456  | 123456    | -99.99 | 200.200.54.9 | 2012-12-01 |  2012-9-12  | 
	  | Valor 2  | Tennis |   Tennis   |  Golf      |http://www.google.com | rperez@choucairtesting.com | 123456   | 123456    | 123456  | 123456    | -99.99 | 200.200.54.9 | 2012-12-01 |  2012-9-12  | 
    
    Then Verifico ingreso exitoso

  @CasoAlterno
   Scenario: Diligenciamiento con errores del formulario popup validation
  	Given Autentico colorlib con usuario "demo" y password "demo"
  	And Ingreso a la funcionalidad Forms Validation
 		When Diligencio formulario Popup Validation
    
	  | Required | Select | MultipleS1 | MultipleS2 | Url                  | E-mail                     | Password | Password2 | Minsize | Maxsize   | Number | IP           | Date       | DateEarlier |
	  |          |  Golf  |   Tennis   |  Golf      |http://www.google.com | rperez@choucairtesting.com | 123456   | 123456    | 123456  | 123456    | -99.99 | 200.200.54.9 | 2012-12-01 |  2012-9-12  | 
	  |          | Tennis |   Tennis   |  Golf      |http://www.google.com | rperez@choucairtesting.com | 123456   | 123456    | 123456  | 123456    | -99.99 | 200.200.54.9 | 2012-12-01 |  2012-9-12  | 
	   
    Then Verificar que se presente un globo informativo
    
  @CasoTabla
  Scenario: Recorrer una tabla y sacar la informacion deseada. 
  	Given Autentico colorlib con usuario "demo" y password "demo"
  	And ingreso a la funcionalidad Tables 
  	When Recorro la tabla 
  	
  @CasoListaDeArticulos
  Scenario: Escoger una opcion en una lista de articulos 
  	Given Autentico colorlib con usuario "demo" y password "demo"
  	When ingreso a la opcion llamada "Layouts" 
  	
  @CasoRecorrerColeccion
  Scenario: Escoger toda lista de articulos y hacer click 
  	Given Autentico colorlib con usuario "demo" y password "demo"
  	When presionar los clicks   
    
