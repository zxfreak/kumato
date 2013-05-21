package net.kumato.atdd;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import static org.junit.Assert.*;

import net.kumato.Contact;
import net.kumato.Database;

public class KumatoAcceptanceSteps {

	private Database db;

	@Given("^an empty database$")
	public void an_empty_database() throws Throwable {
		db = new Database();
	}

	@When("^I add the contact \"([^\"]*)\"$")
	public void I_add_the_contact(String name) throws Throwable {
		Contact c = new Contact(name);
	    db.put(c);
	}

	@Then("^the database has (\\d+) contacts$")
	public void the_database_has_contacts(int size) throws Throwable {
		assertEquals(size, db.size());
	}

	@Then("^the database contains the contact \"([^\"]*)\"$")
	public void the_database_contains_the_contact(String name) throws Throwable {
		assertTrue(db.containsKey(name));
	}

}

