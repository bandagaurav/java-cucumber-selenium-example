package steps;

import io.cucumber.java.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import utils.TestContextSetup;

import java.io.*;


public class Hooks {

    TestContextSetup testContextSetup;

    public Hooks(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

    @Before
    public void InitializeTest() {
        // Previously we initialized driver here, but now it's happening in TestContextSetup...
        //        FileInputStream fis  = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\global.properties");
        //        Properties      prop = new Properties();
        //        prop.load(fis);
        //
        //        base.driver = base.WebDriverManager(prop.getProperty("browser")); // which is chrome
    }

    @BeforeStep
    public void BeforeTestExecution(Scenario scenario) {
        System.out.println("The execution scenario step Before: " + scenario.getLine());
    }

    @After
    public void AfterTest() throws IOException {
        testContextSetup.testBase.WebDriverManager().quit();
    }

    @AfterStep
    public void AddScreenshot(Scenario scenario) throws IOException {
        WebDriver driver = testContextSetup.testBase.WebDriverManager();
        if (scenario.isFailed()) {
            //screenshot
            File   sourcePath  = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
            scenario.attach(fileContent, "image/png", "image-failed");
        }
        System.out.println("The execution scenario step After: " + scenario.getLine());
    }
}
