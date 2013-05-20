package net.kumato.atdd;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import static org.junit.Assert.assertEquals;

import net.kumato.Kumato;

public class KumatoAcceptanceSteps {

	private Kumato k;

	@Given("^an empty database$")
	public void an_empty_database() throws Throwable {
		k = new Kumato();
	}

	@Then("^the database has (\\d+) contacts$")
	public void the_database_has_contacts(int size) throws Throwable {
		assertEquals(size, k.size());
	}

}
