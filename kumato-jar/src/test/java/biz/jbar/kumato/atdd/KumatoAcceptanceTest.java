package biz.jbar.kumato.atdd;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
// @Cucumber.Options(features={"src/test/java/"})
@Cucumber.Options(format = { "pretty", "html:target/cucumber" })
public class KumatoAcceptanceTest {
}
