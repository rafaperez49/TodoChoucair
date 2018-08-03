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
Feature: Consulta Calificacion Central Interna - Individual 
El usuario debe de ingresar a la opcion de Menu Calificacion central Interna Individual,
cada campo debe presentar su respectivo mensaje de verificacion en caso de faltar un valor requerido o 
en caso contrario el resultado de la calificacion 


 @casoAprobado
    Scenario: Diligenciamiento exitoso del formulario  de Central Interna, no se presenta ningun 
    Mensaje de verificacion y se logra visualizar el estado de la calificacion del cliente
 

    Given Se inicia sección en el formulario web CUN con usuario "mespinal" y clave "8ankok2017*"
    And ingreso a la funcionalidad Consulta Central Interna 
    When Cuando diligencio el formulario
    
|Tipo_Documento|Nro_Documento|
|CEDULA DE CIUDADANÍA	 |2            |
|CEDULA DE CIUDADANÍA	 |000000071188710     |


    
    
   
  
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
