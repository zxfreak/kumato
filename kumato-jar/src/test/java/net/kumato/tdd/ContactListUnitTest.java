package net.kumato.tdd;

import static org.junit.Assert.assertEquals;
import net.kumato.Contact;
import net.kumato.ContactList;

import org.junit.Before;
import org.junit.Test;

public class ContactListUnitTest {

	ContactList contactList;
	
	@Before
	public void before() {
		contactList = new ContactList();
	}
	
	@Test
	// add a contact and get it as a string
	public void getListAsStringWithOneContact() throws Exception {
		String name = "Manuela";
		Contact c = new Contact(name);
		contactList.addLast(c);
		String cStr = contactList.toString();
		assertEquals("ContactList{Contact{\"Manuela\"}}",cStr);
	}

	@Test
	// add a contact and get it as a string
	public void getListAsStringWithOtherContact() throws Exception {
		String name = "Anabela";
		Contact c = new Contact(name);
		contactList.addLast(c);
		String cStr = contactList.toString();
		assertEquals("ContactList{Contact{\"Anabela\"}}",cStr);
	}

	@Test
	// add 2 contacts and get them as a string
	public void getListAsStringWithTwoContacts() throws Exception {
		contactList.addLast(new Contact("Sandra"));
		contactList.addLast(new Contact("Soraia"));
		String cStr = contactList.toString();
		assertEquals("ContactList{Contact{\"Sandra\"},Contact{\"Soraia\"}}",cStr);
	}
	
	@Test
	// add 3 contacts and get them as a string
	public void getListAsStringWithThreeContacts() throws Exception {
		contactList.addLast(new Contact("Alfa"));
		contactList.addLast(new Contact("Beta"));
		contactList.addLast(new Contact("Gama"));
		String cStr = contactList.toString();
		assertEquals("ContactList{Contact{\"Alfa\"},Contact{\"Beta\"},Contact{\"Gama\"}}",cStr);
	}
	
}
