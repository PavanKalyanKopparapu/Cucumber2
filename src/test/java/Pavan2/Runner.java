package Pavan2;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/Myfeature.feature",glue={"Pavan1"})
public class Runner {
}

