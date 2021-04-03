package runner;


import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features"
        ,glue= {"seleniumgluecode"},tags = {
        " @SufiyanTest "}
)

public class testrunner {
}
