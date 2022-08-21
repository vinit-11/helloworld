package cucumber.options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(features="E:\\eclipse\\Maven\\src\\test\\java\\features\\orangeHome.feature",
				glue= {"stepDefinitaion"},   //path of the step definition file
            	dryRun=false,				// to check the mapping is proper between feature file and step defination file
            	monochrome=true	,			// display the console output in proper readable format
            	plugin= {"pretty","html:test-output"}
            	//strict=true,            //it will check if any step is not defined in step definition file
            	//tags= {"~@SmokeTest","~@RegressionTest"}
)
public class orangeRunner {
	
	

}
