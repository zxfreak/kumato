package net.kumato;

import java.util.HashMap;

public class Database extends HashMap<String, Contact> {

	private static final long serialVersionUID = 222162063622566238L;

	/**
	 * Add a Contact to the database
	 * @throws DatabaseException 
	 */
	public void put(Contact c) throws Exception {
		String key = c.getKey();
		if (this.containsKey(key)) {
			throw new Exception("Contact \"" + c.toString() + "\" with key \"" + key + "\" already exists in database");
		}
		this.put(key, c);
	}

	/**
	 * Retrieves a Contact from the database
	 */
/*	public Contact get(String key) {
		return this.get(key);
	}
*/
}
