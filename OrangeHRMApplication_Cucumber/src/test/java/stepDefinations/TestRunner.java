package stepDefinations;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="OrangeHRMApplication",
glue="stepDefinations",// glue connects the feature file with the stepDefination
					   // Package - which executes the respective methods	
				 monochrome=true,
				// dryRun=true
				// tags="@Smoke"
				 //tags="@Sanity"
				 //tags="@LogInTestWithTestData"
				// tags= {"@Sanity,@LogInTestWithTestData"}
			 
				plugin = { "pretty",
					 "html:target/OrangeHRMApplicationReports",
					 "json:target/OrangeHRMApplicationJsonReport.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/OrangeHRMApplicationExtentReports.htm"
						}
				)
public class TestRunner {

}
