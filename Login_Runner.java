package com.Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\new batch 280 workspace\\Cucumber_BDD\\src\\main\\resources\\Login.feature",
		glue="com.Step_Defination",
		dryRun = false,
		monochrome=true,
		plugin = {"html:target/cucumber-report.html"}		
		)




public class Login_Runner {

}
