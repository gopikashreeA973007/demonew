package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features\\Feature1.feature",
plugin= {"html:target/htmlreport",
		"junit:target/xmlreport.xml",
		"json:target/jsonreport.json"})


public class Runner {
	

}
