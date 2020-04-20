package com.sparta.crss;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(features="C:\\Users\\Colette Shaw\\AutomationPracticeFormTester\\src\\test\\java\\com\\sparta\\crss\\HomePage.java", glue={"C:\\Users\\Colette Shaw\\AutomationPracticeFormTester\\src\\test\\java\\MyStepdefs.java"})
//@CucumberOptions(features="C:\\Users\\Colette Shaw\\AutomationPracticeFormTester\\src\\test\\resources",
//        glue={"C:\\Users\\Colette Shaw\\AutomationPracticeFormTester\\src\\test\\java\\MyStepdefs.java"})
//@CucumberOptions(glue="C:\\Users\\Colette Shaw\\AutomationPracticeFormTester\\src\\test\\java\\MyStepdefs.java")
//@CucumberOptions(glue="src/test/java/MyStepdefs.java")
@CucumberOptions(glue="MyStepdefs.java")
public class TestRunner {

}