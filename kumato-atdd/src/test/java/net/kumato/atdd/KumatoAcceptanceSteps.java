package net.kumato.atdd;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import static org.junit.Assert.assertEquals;

import net.kumato.Kumato;

public class KumatoAcceptanceSteps {

	private Kumato k;

	@Given("^an application$")
	public void an_application() {
	    k = new Kumato();
	}

	@Then("^the hello message is \"([^\"]*)\"$")
	public void the_hello_message_is(String message) {
		assertEquals(k.hello(),message);
	}

}
