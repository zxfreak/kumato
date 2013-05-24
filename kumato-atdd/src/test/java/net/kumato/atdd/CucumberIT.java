package net.kumato.atdd;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
// @Cucumber.Options(features={"src/test/java/"})
// @Cucumber.Options(format = { "json", "json:target/cucumber.json" }, features = { "." }, strict = true)
@Cucumber.Options(format = { "pretty", "html:target/cucumber" })
public class CucumberIT {
}
