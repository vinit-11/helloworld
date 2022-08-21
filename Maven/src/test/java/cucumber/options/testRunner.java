package cucumber.options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\eclipse\\Maven\\src\\test\\java\\features\\test.feature", glue={"stepDefinitaion"})
public class testRunner {

}
