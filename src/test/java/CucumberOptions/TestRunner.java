package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Features",
glue="stepDefinationFile",monochrome=true,tags="@SmokeTest or @RegressionTest",
plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json"} )  
public class TestRunner extends AbstractTestNGCucumberTests {

	
	


}
