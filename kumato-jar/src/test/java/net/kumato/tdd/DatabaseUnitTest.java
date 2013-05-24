package net.kumato.tdd;

import static org.junit.Assert.assertEquals;
import net.kumato.Contact;
import net.kumato.ContactList;
import net.kumato.Database;
import org.junit.Before;
import org.junit.Test;

public class DatabaseUnitTest {

	Database db = null;
	
	@Before
	public void before() throws Exception {
		db = Database.getInstance();
	}

	@Test
	// create non existing user
	public void addUser() throws Exception {
		String name = "Asdrubal";
		Contact c = new Contact(name);
		db.putContact(c);
		ContactList cList = db.getContactListByName(name);
		String cListStr = cList.toString();
		assertEquals("ContactList{Contact{\"Asdrubal\"}}", cListStr);
	}

	@Test
	// create different non existing user
	public void addDiferrentUser() throws Exception {
		String name = "Amadeu";
		Contact c = new Contact(name);
		db.putContact(c);
		ContactList cList = db.getContactListByName(name);
		String cListStr = cList.toString();
		assertEquals("ContactList{Contact{\"Amadeu\"}}", cListStr);
	}
	
	// create existing user returns exception
	
	// retriving non existing user gets exception
}