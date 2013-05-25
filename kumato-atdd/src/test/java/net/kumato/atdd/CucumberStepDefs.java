package net.kumato.atdd;

import static org.junit.Assert.assertEquals;
import net.kumato.Contact;
import net.kumato.ContactList;
import net.kumato.Database;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;

public class CucumberStepDefs {

	@Given("^an empty database$")
	public void an_empty_database() throws Throwable {
		Database.getInstance().createTables();
	}

	@When("^I add the contact \"([^\"]*)\"$")
	public void I_add_the_contact(String name) throws Throwable {
		Database.getInstance().putContact(new Contact(name));
	}

	@Then("^the database contains the contact \"([^\"]*)\"$")
	public void the_database_contains_the_contact(String name) throws Throwable {
		ContactList list = Database.getInstance().getContactListByName(name);
		assertEquals(name,list.getFirst().getName());
	}
}
