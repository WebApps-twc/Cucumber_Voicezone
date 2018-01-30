package Voicezone_Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "Voicezone_features",
                 glue="Voicezone_StepDefinition"
               )
                
public class TestRunner  {
	
}