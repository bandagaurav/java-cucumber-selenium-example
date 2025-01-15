package utils;

import pages.PageObjectManager;

import java.io.IOException;

public class TestContextSetup {

    public PageObjectManager pageObjectManager;
    public TestBase testBase;
    public GenericUtils genericUtils;


    public TestContextSetup() throws IOException {
        testBase          = new TestBase();
        pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
        genericUtils      = new GenericUtils(testBase.WebDriverManager());
    }
}
