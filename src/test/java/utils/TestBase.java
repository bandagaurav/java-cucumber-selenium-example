package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

public class TestBase {

    public WebDriver driver;
    private Properties properties;

    public WebDriver WebDriverManager() throws IOException {
        this.properties = this.collectProperties();

        String browser = properties.getProperty("browser"); // which is chrome

        if (driver == null) {

            switch (browser) {
                case "chrome" -> {
                    ChromeOptions chromeOptions = this.collectBrowserOptions(properties);
                    driver = new ChromeDriver(chromeOptions);
                }
                case "firefox" -> {
                    // See also https://www.browserstack.com/guide/run-selenium-tests-using-firefox-driver
                    System.setProperty("webdriver.gecko.driver", "Path to geckodriver.exe");
                    driver = new FirefoxDriver();
                }
                case "edge" -> {
                    // https://www.browserstack.com/guide/launch-edge-browser-in-selenium
                    System.setProperty("webdriver.edge.driver", "Path to EdgeDriver.exe");
                    driver = new EdgeDriver();
                }
                case "remote" -> {
                    // for Selenium Grid
                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setBrowserName("chrome");

                    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
                }
            }

            System.out.println("Opening the browser: " + browser.toUpperCase());
        }

        return driver;
    }

    private ChromeOptions collectBrowserOptions(Properties properties) {
        ChromeOptions  chromeOptions = new ChromeOptions();
        Enumeration<?> e             = properties.propertyNames();
        System.out.println("Browser will start with options:");

        while (e.hasMoreElements()) {
            String key = (String) e.nextElement();
            if (key.startsWith("browserOption")) {
                System.out.println(properties.getProperty(key));
                chromeOptions.addArguments(properties.getProperty(key));
            }
        }
        return chromeOptions;
    }

    private boolean isCI() {
        boolean ci = false;

        // Gitlab pipelines come with environment variable ->  GITLAB_CI : true
        // Azure pipelines come with environment variable ->  ...
        // so if one of these keys is present then test is executed in a CI pipeline

        Map<String, String> env = System.getenv();
        if (env.containsKey("GITLAB_CI")) {
            ci = true;
        }

        return ci;
    }

    private Properties collectProperties() throws IOException {
        Properties properties = new Properties();

        Path pathToProperties = Paths.get(System.getProperty("user.dir"), "src", "test", "resources");
        properties.load(new FileInputStream(pathToProperties + File.separator + "global.properties"));

        if (isCI()) {
            Properties ciProperties = new Properties();
            ciProperties.load(new FileInputStream(pathToProperties + File.separator + "ci.properties"));
            properties.putAll(ciProperties);
        } else {
            Properties localProperties = new Properties();
            localProperties.load(new FileInputStream(pathToProperties + File.separator + "local_development.properties"));
            properties.putAll(localProperties);
        }
        return properties;
    }

    public WebDriver haveFriend() throws IOException {
        this.properties = this.collectProperties();
        ChromeOptions chromeOptions = this.collectBrowserOptions(this.properties);
        return new ChromeDriver(chromeOptions);
    }
}
