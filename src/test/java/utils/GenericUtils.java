package utils;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class GenericUtils {

    public WebDriver driver;

    public GenericUtils(WebDriver driver) {
        this.driver = driver;
    }

    public String get_global_property_value(String propertyName) throws IOException {
        FileInputStream fis  = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\global.properties");
        Properties      prop = new Properties();
        prop.load(fis);

        return prop.getProperty(propertyName);
    }

    public void SwitchWindowToChild() {
        Set<String>      s1           = driver.getWindowHandles();
        Iterator<String> i1           = s1.iterator();
        String           parentWindow = i1.next();
        String           childWindow  = i1.next();
        driver.switchTo().window(childWindow);
    }
}
