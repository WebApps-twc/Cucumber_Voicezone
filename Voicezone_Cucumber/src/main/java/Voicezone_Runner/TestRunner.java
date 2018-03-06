package Voicezone_Runner;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features= "Voicezone_features//Sign_In.feature",
                 glue="Voicezone_StepDefinition",
                 plugin= { "html:target/cucumber-html-report",
                		 "json:target/cucumber.json",
                		 "pretty:target/cucumber-pretty.txt",
                		 "usage:target/cucumber-usage.json",
                		 "junit:target/cucumber-results.xml",
                		 "com.cucumber.listener.ExtentCucumberFormatter:output/report.html"
                        		 })
                
public class TestRunner  {
	public static Logger logger=Logger.getLogger("commonfiles");
	@BeforeClass
	public static void setup() {
		PropertyConfigurator.configure("Log4j.properties");
	    ExtentProperties extentProperties = ExtentProperties.INSTANCE;
	    extentProperties.setReportPath("output/myreport.html");
	}
	@AfterClass
    public static void teardown() {
        Reporter.loadXMLConfig(new File("Voicezone_features/extend-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
	
}