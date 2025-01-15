package runner;

import io.cucumber.testng.*;
import org.testng.annotations.DataProvider;

// See https://www.toolsqa.com/cucumber/cucumber-options/ for more options
// https://www.extentreports.com/docs/versions/4/java/index.html
// https://stackoverflow.com/questions/73051196/why-run-cucumber-tests-with-tags-gives-error-message

@CucumberOptions(
        features = {"classpath:features"},
        plugin = {
                "pretty",
                "json:target/cucumber/cucumber.json",
                "html:target/cucumber/cucumber-html-rep.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        //tags = "@background",
        //tags = "@concurrentWindows",
        //tags = "@inlineVars",
        //tags = "@scenarioOutline",
        //tags = "@horizontalTable",
        //tags = "@verticalTable",
        //tags = "@verticalTableLong",
        glue = {"steps"},
        //dryRun = true,
        dryRun = false,
        monochrome = false
)

public class TestNGRunner extends AbstractTestNGCucumberTests {

    // run parallel
    @Override
    @DataProvider (parallel = false)
    public Object[][] scenarios(){
        return super.scenarios();
    }
}
