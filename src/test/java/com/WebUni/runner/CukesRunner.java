package com.WebUni.runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/feature",
        glue = "com/WebUni/stepDefinitions",
        tags = "@clickButtons",
        dryRun = false

        // C:\Users\Kurt2\IdeaProjects\DenemeTest\src\test\resources\feature

)

public class CukesRunner {












 /*    @AfterClass
    public static void afterClass(){
        Reporter.loadXMLConfig("src/test/java/com/WebUni/XML/ExtendReport.xml");

        Reporter.setSystemInfo("QA Tester : ", "Mustafa Elmas");//kendi bilgilerinizi ekleyin.
        Reporter.setSystemInfo("Application name : ", "WebDriverUni");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("Test execution Cucumber Report");
    }

  */

}
