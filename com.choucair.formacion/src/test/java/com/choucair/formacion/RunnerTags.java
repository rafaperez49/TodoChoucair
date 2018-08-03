package com.choucair.formacion;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import utilities.BeforeSuite;
import utilities.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@CucumberOptions (features = "src/test/resources/features/DB2/Forms/conectarseADB2.feature",tags= {"@casoFeliz"}, snippets= SnippetType.CAMELCASE)
@RunWith(RunnerPersonalizado.class)
public class RunnerTags {
	@BeforeSuite
	public static void test() throws InvalidFormatException, IOException {
			DataToFeature.overrideFeatureFiles("src/test/resources/features/DB2/Forms/conectarseADB2.feature");
	}
}

