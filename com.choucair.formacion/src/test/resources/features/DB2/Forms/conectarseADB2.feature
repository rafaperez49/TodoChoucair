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

  @casoFeliz
  Scenario Outline: consultar tabla TMPCNOMBRE
    Given Consultar TMPCNOMBRE
    |   <Documento>    |<Tipo Docto>|  <Nombre>       |<Control Terceros>|
   
   Examples:
   |   Documento      |Tipo Docto|  Nombre        |Control Terceros  |
   ##@externaldata@D:/PAB/DataDrivenDb2.xlsx@Hoja1
   |8000000000   |1   |ELIANA  VILLA   |K|
   
   @casoFelix
   Scenario Outline: consultar tabla TMPCNOMBRE
    Given Consultar TMPCNOMBRE
    |   <Documento>    |<Tipo Docto>|  <Nombre>       |<Control Terceros>|
   
   Examples:
   |   Documento      |Tipo Docto|  Nombre        |Control Terceros  |
   ##@externaldata@D:/PAB/DataDrivenDb2.xlsx@Hoja1
   |8000000000   |1   |ELIANA  VILLA   |K|
   |1321321   |2   |Rafa Pérez   |RP|
   |100025   |3   |James Rodriguez   |J007|

   
   
