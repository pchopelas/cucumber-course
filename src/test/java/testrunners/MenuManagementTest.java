package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/linkedinlearning/cucumbercourse/features",
		glue="stepdefinitions",
		plugin= {"pretty"})
public class MenuManagementTest {

}
