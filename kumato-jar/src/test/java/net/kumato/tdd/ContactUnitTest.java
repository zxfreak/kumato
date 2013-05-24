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

	@Test
	// create a contact and get it as a string
	public void getContactAsString() throws Exception {
		String name = "Filipa";
		Contact c = new Contact(name);
		String cStr = c.toString();
		assertEquals("Contact{\"Filipa\"}",cStr);
	}

	@Test
	// create a contact with different name and get it as a string
	public void getContactWithDifferentNameAsString() throws Exception {
		String name = "Miquelina";
		Contact c = new Contact(name);
		String cStr = c.toString();
		assertEquals("Contact{\"Miquelina\"}",cStr);
	}

}
