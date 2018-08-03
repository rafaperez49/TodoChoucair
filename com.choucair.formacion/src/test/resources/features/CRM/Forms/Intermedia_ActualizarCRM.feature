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
Feature: Formulario Intermedia
	El usuario debe poder ingresar al formulario los datos requeridos.
	El formulario realiza validaciones de obligatoriedad, longitud y formato.
	
  @CasoExitoso
  Scenario: Actualizacion sin errores CRM Intermedia,
  					se presenta mensaje de validación.
    Given Autentico en Intermedia con usuario "meguevar" y clave "3030"
    And Busco_Edito cliente por usuario "37951323"
    When Modifico informacion general   
    
  | Nivel Acd | Profesion |
  | POSGRADO  | CONDUCTOR |
  
  	Then verifico actualizacion exitosa
   
  #@CasoAlterno
  #Scenario: Diligenciamiento con errores del formulario Popup Validation,
  #		  		Se presenta Globo informativo indicando error en el diligenciamiento de alguno de los campos
  # Given Autentico en colorlib con usuario "demo" y clave "demo"
  #And Ingreso a la funcionalidad Forms Validation
  #When Diligencio formulario Popup Validation    
  #| Required | Select | MultipleS1 | MultipleS2 | Url                   | Email            | Password1 | Password2 | MinSize | MaxSize | Number | Ip          | Date       | DateEarlier |
  #|          | Golf   | Tennis     | Golf       |http://www.valor1.com  | valor1@gmail.com | valor1    | valor1    | 123456  | 123456  | -99.99 | 200.200.5.4 | 2018-01-22 | 2012/09/12  |
  #|  valor1  | Choose a sport   | Tennis     | Golf       |http://www.valor1.com  | valor1@gmail.com | valor1    | valor1    | 123456  | 123456  | -99.99 | 200.200.5.4 | 2018-01-22 | 2012/09/12  |
  #	Then Verificar que se presente Globo Informativo de validación
  
 

