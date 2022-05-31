package tsetRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions
        (
        		features=".//Features/Job.feature",
                glue="stepDefinitions",
                dryRun=false,
                monochrome=true
		) 
public class runner {

}

