package runnerTest;
import org.testng.annotations.BeforeClass;

import com.report.CucumberExtentOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/resources",
		glue={"stepDefination"},
		tags= {"@Test"},
		monochrome=true,
		plugin= {"com.report.CucumberExtent:target/cucumber-extent-reports/report.html"}
		)
public class TestNGRunner extends AbstractTestNGCucumberTests{
	@BeforeClass
	public void beforeMethod() {
		CucumberExtentOptions.getInstance().setDocumentTitle("testFaeture");
		CucumberExtentOptions.getInstance().setReportLevel("Feature");
		CucumberExtentOptions.getInstance().setReportName("testFaeture");
	}
	

}