package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:/Users/HP/eclipse-workspace/Final_Bdd_Project/Feature/ECommerceSearch.feature"},
		glue= {"step_Definitions"},
		dryRun=false,
		monochrome=true,
		publish=true,
        plugin={"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	    tags=""
		)
public class TestRun_ECommerce {

}
