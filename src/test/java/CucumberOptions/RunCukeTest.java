package CucumberOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/com/rscomponents/features",
glue = "com.rscomponents.stepDefinations",
plugin = {"pretty","html:target/cucumber",})

public class RunCukeTest extends AbstractTestNGCucumberTests {

	
	
}


