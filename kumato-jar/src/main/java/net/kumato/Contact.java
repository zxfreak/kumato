package net.kumato;

/**
 * Contact
 * Stores the following contact data: name
 */
public class Contact {

	String name;
	
	public Contact(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		String className = this.getClass().getSimpleName();
		return className + "{\"" + this.getName() + "\"}";
	}
}
