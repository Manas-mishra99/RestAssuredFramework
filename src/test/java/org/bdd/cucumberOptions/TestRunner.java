package org.bdd.cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/org/bdd/features",
                 glue={"stepdefinations"}
    )
public class TestRunner {
}
