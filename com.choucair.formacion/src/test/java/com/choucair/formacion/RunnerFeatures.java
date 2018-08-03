package com.choucair.formacion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features ="src/test/resources/features/")
@CucumberOptions(features ="src/test/resources/features/DB2/Forms/conectarseADB2.feature", tags="@casoFeliz")
//@CucumberOptions(features ="src/test/resources/features/ColorLib/nombre.feature")
public class RunnerFeatures {

}
