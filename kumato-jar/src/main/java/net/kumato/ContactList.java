package net.kumato;

import java.util.Iterator;
import java.util.LinkedList;

public class ContactList extends LinkedList<Contact>{

	private static final long serialVersionUID = 3228116828967401910L;

	public String toString() {
		String result = this.getClass().getSimpleName();
		Iterator<Contact> iterator = this.iterator();
		boolean hasMultipleRecords = this.size() > 1;
		boolean isFirst = true;
		result += "{";
		while(iterator.hasNext()) {
			if((!isFirst)&&hasMultipleRecords) {
				result += ",";
			} else {
				isFirst = false;
			}
			result += iterator.next().toString();
		}
		result += "}";
		return result;
	}
}
