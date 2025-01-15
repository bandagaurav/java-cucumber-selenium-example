# Java Cucumber Selenium Framework

## Purpose

Illustrate how to implement classic BDD features:

- Variables in steps - [link](https://github.com/andreasneuber/java-cucumber-selenium-framework/blob/master/src/test/resources/features/ConvertCelsius.feature)
- Horizontal data tables - [link](https://github.com/andreasneuber/java-cucumber-selenium-framework/blob/master/src/test/resources/features/Login.feature)
- Vertical data tables - [link](https://github.com/andreasneuber/java-cucumber-selenium-framework/blob/master/src/test/resources/features/ProvideYourDetails.feature)
- Scenarios with Examples - [link](https://github.com/andreasneuber/java-cucumber-selenium-framework/blob/master/src/test/resources/features/Creditcard.feature)
- Backgrounds - [link](https://github.com/andreasneuber/java-cucumber-selenium-framework/blob/master/src/test/resources/features/AdminPrivileges.feature)
- Setup hook
- Teardown hook
- Tags
- Reports
- Screenshots
- Parallel execution
- Page objects

## IDE used here in this docu

IntelliJ IDEA Community Edition

## Application under test

The tests here were written to
fit [https://github.com/andreasneuber/automatic-test-sample-site](https://github.com/andreasneuber/automatic-test-sample-site)

README in that project explains how to start the sample site.

## Setup Java
- Add Java SDK as outlined here: https://www.jetbrains.com/help/idea/sdk.html#supported-sdks
- Add system variable `JAVA_HOME` with path to SDK
- Reboot machine

## Setup Maven

Setup Maven, otherwise `mvn` commands below cannot be executed.
See [https://maven.apache.org/install.html](https://maven.apache.org/install.html)

Steps for Windows well explained here: https://phoenixnap.com/kb/install-maven-windows (don't forget to reboot).
Verify with `mvn --version`

## How to execute the tests

**Way 1:**
Run this command in your terminal (Mac/Linux/UNIX) or CMD (Windows):

```
mvn test
```

or

```
mvn clean verify
```

or with providing options (which also override what is set in the TestRunner file)

```
mvn test -D"cucumber.filter.tags=@Login"
```

After this you will see 2 new folders - target and test-output.
Directory test-output contains Spark test report.

**Way 2:**
Through IntelliJ UI. Right-click on project name, then choose "Run > (NG) All Tests"


## Update Maven packages

`mvn clean install -U`

## Principles for accomplishing good design

1) No driver invocation in step definitions
2) No instantiation of page objects and generic utils in step definitions (so no code like `xyz = new Class()` )
3) Follow official Java naming conventions - https://www.thoughtco.com/using-java-naming-conventions-2034199

## FAQ

### `mvn test` fails `java.lang.IllegalStateException: Unable to load cache item` - how to debug?
[Linux]

Update Maven to version 3.9.4
- https://phoenixnap.com/kb/install-maven-on-ubuntu , do "Step 2: Download and Install Maven" (only this step, and use version 3.9.4 instead)
- Add below to .bashrc or .zshrc file
```
export MAVEN_HOME="/opt/maven"
export PATH=$MAVEN_HOME/bin:$PATH
```

### `I'd like to implement Selenium Grid running in Docker container - where to start?`

Good starting point is to look at file `src\test\java\utils\TestBase.java` and 
this [GitHub repo](https://github.com/atulchavan10000/selenium-grid-docker-compose).
