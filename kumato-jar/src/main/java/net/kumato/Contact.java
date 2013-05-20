package net.kumato;

/**
 * Contact
 * Stores the following contact data: name
 * it generates a key that is the same as the name
 * @author Usuario
 *
 */
public class Contact {

	String name;
	
	public Contact(String name) {
		this.name = name;
	}

	public Object getName() {
		return name;
	}

	public String getKey() {
		return name;
	}
}
