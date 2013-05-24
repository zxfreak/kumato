package net.kumato.tdd;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import net.kumato.Contact;

public class ContactUnitTest {

	@Test
	// create a contact
	public void createContact() throws Exception {
		String name = "Emengarda";
		Contact c = new Contact(name);
		assertEquals(name,c.getName());
	}

	@Test
	// create a contact with different name
	public void createContactWithDifferentName() throws Exception {
		String name = "Gestrudes";
		Contact c = new Contact(name);
		assertEquals(name,c.getName());
	}

}
