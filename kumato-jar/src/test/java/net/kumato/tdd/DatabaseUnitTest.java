package net.kumato.tdd;

import static org.junit.Assert.assertEquals;
import net.kumato.Contact;
import net.kumato.Database;
import org.junit.Before;
import org.junit.Test;

public class DatabaseUnitTest {

	Database db;
	
	@Before
	// create database
	public void createDatabase() throws Exception {
		db = new Database();
	}

	@Test
	// create non existing user
	public void addUser() throws Exception {
		String name = "Asdrubal";
		Contact cPut = new Contact(name);
		db.putContact(cPut);
		Contact cGet = db.getContactByName(name);
		assertEquals(name, cGet.getName());
	}

	// create existing user returns exception
	
	// retriving non existing user gets exception
}