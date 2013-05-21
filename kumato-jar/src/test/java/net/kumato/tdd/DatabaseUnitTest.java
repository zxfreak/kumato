package net.kumato.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import net.kumato.Contact;
import net.kumato.Database;

public class DatabaseUnitTest {

	@Test
	// an empty database has 0 contacts
	public void emptyDatabase() throws Exception {
		Database d = new Database();
		assertEquals(0,d.size());
	}

	@Test
	// add non existing contact
	public void addNonExistingContact() throws Exception {
		Database d = new Database();
		Contact cAdd = new Contact("Felismina");
		d.put(cAdd);
		Contact cRead = d.get(cAdd.getKey());
		assertEquals(cAdd.getName(),cRead.getName());
	}

	@Test(expected=Exception.class)
	// add an existing contact throws exception
	public void addExistingContactThrowsException() throws Exception {
		Database d = new Database();
		Contact c = new Contact("Mariana");
		d.put(c);
		d.put(c);
		fail("Exception expected but not thrown");
	}

}