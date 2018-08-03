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
@HU
Feature: Envio de pago de nomina por el canal SVE verificando pago exitoso en la tabla ARHIS de ISeries


  @PagoSVE
  Scenario: Enviar pago de Nomina por SVE
    Given Cargo URL
    And Autentico en SVE con nit "7012400", usuario "sup0001"
    And Selecciono la opcion para pago de nomina
    When Ingreso la informacion basica del pago
    | Tipo                         | Modelo      |   Nombre           | Cuenta                             |  Aplicacion  | Fecha      |
    | FORMATO 2003 PAGO DE NOMINA  | Ninguno     |   PRUEBA_AUTO      | 406-724000-80 - Ahorros - Ahorros1 |  Inmediato   | 30/04/2018 |
    And  Realizo la carga del lote 
    Then Verifico el proceso del pago por SVE


  #@PagoIseries
  #Scenario Outline: COnsulta en tabla ARHIS para verificar el pago ingresado por SVE
  #Given Consulto en ARHIS
  #|  <NIT>   | <FECTRANS>| <SECUENC> | <CODRES> |  <ESTADO> |
 # Examples: 
  #|  NIT              | FECTRANS  | SECUENC  | CODRES |  ESTADO | 
 # |  000000007012444  | 20180409  |    A     |   OK   |   E     | 
  
  
  #  When I check for the <value> in step
  #  Then I verify the <status> in step

  #  Examples: 
  #    | name  | value | status  |
  #    | name1 |     5 | success |
  #    | name2 |     7 | Fail    |
