package com.WebUni.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "C:\\Users\\Kurt2\\IdeaProjects\\WebDriverUni_Cucumber\\src\\test\\resources\\feature",
        glue = "com/WebUni/stepDefinitions",
        tags = "@clickButtons",
        dryRun = false

        // C:\Users\Kurt2\IdeaProjects\DenemeTest\src\test\resources\feature

)

public class CukesRunner {

}
