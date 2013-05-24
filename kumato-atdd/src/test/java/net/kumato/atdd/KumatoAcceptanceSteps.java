package net.kumato.atdd;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import net.kumato.Contact;
import net.kumato.Database;
import static org.junit.Assert.assertEquals;

public class KumatoAcceptanceSteps {

	Database db = null;
	
	@Given("^an empty database$")
	public void an_empty_database() throws Throwable {
	    db = new Database();
	}

	@When("^I add the contact \"([^\"]*)\"$")
	public void I_add_the_contact(String name) throws Throwable {
		Contact c = new Contact(name);
		db.putContact(c);
	}

	@Then("^the database contains the contact \"([^\"]*)\"$")
	public void the_database_contains_the_contact(String name) throws Throwable {
	    Contact c = db.getContactByName(name);
	    assertEquals(name,c.getName());
	}

	@Then("^I can not add the contact \"([^\"]*)\"$")
	public void I_can_not_add_the_contact(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

}
