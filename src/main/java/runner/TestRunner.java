package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;		//this import have to add manually

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\sokoeurn chhay\\Selenium_Java_Review\\FreeCRMBDDFramework\\src\\main\\java\\features\\Login.feature", 
		glue={"stepdefinitions"}							//the path of the step definition files
//		format= {"pretty","html:test-outout"}, 				//to generate different types of reporting
//		monochrome = true, 									//display the console output in a proper readable format
//		strict = true, 										//it will check if any step is not defined in step definition file
//		dryRun = false 										//to check the mapping is proper between feature file and step def file
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
		)





public class TestRunner {
	

}
