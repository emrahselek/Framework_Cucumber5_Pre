package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                  "html:target/default-html-reports.html"},
        features = "src/test/resources/features",
        glue = "step_definitions",
        tags = "@amazon",
        dryRun = false  // false, test running with browser
                        // true, test running without browser. Just our code executed.
                        // testi çalıştırma sadece herhangi bir step eksik mi ona bak
)

public class Runner {

}