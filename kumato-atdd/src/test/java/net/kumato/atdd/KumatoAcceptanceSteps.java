package net.kumato.atdd;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import static org.junit.Assert.*;

import net.kumato.Contact;
import net.kumato.Kumato;

public class KumatoAcceptanceSteps {

	private Kumato k;

	@Given("^an empty database$")
	public void an_empty_database() throws Throwable {
		k = new Kumato();
	}

	@When("^I add the contact \"([^\"]*)\"$")
	public void I_add_the_contact(String name) throws Throwable {
		Contact c = new Contact(name);
	    k.put(c.getKey(), c);
	}

	@Then("^the database has (\\d+) contacts$")
	public void the_database_has_contacts(int size) throws Throwable {
		assertEquals(size, k.size());
	}

	@Then("^the database contains the contact \"([^\"]*)\"$")
	public void the_database_contains_the_contact(String name) throws Throwable {
		assertTrue(k.containsKey(name));
	}

}
