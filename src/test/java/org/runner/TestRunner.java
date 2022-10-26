package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\cart.feature", glue="org.steps", dryRun=false,plugin = "html:Reports\\HTMLReport\\cucumber1.html", tags="@Request5")
public class TestRunner {
	


}
//monochrome=true