package runnerFile;

import io.cucumber.testng.CucumberOptions;
import stepDef.ProjectSpecificMethods;

@CucumberOptions(features = "src/test/java/features", glue = "stepDef", monochrome = true, publish = true)
public class RunnerFile extends ProjectSpecificMethods {

}
