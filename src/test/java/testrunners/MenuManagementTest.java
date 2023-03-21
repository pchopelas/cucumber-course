package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/java/linkedinlearning/cucumbercourse/features"},
		glue={"stepdefinitions"},
		plugin= {"pretty",
				"html:target/SystemTestReports/html",
				"json:target/SystemTestReports/json/report.json",
				"junit:target/SystemTestReports/junit/report.xml"},
		dryRun=false,
		monochrome=true)
public class MenuManagementTest {

}
