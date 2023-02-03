package com.Leaf.Cucumber.runner;

import com.Leaf.Cucumber.steps.BaseClass;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/features",
                 glue = "com.Leaf.Cucumber.steps",
                 monochrome = true,
                 publish = true,
               //  tags = "@regression" //only regression testcases
               //  tags = "@smoke or @functional" //scenarios having either @smoke or @functional are eligible
              //   tags = "@smoke and @functional" //scenarios having both @smoke & @functional
              //   tags = "not @smoke" //to execute all the testcases except @smoke
                 tags = "@login"
		)
public class RunnerClass extends BaseClass{
	
}

