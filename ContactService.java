package contact;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
	
	private Map<String, Contact> contacts = new HashMap<>();

	public void addContact(Contact contact) {
		
		if (contacts.containsKey(contact.getContactId())) {
		    throw new IllegalArgumentException("Contact ID already exists.");
		}
		
		contacts.put(contact.getContactId(), contact);

		
	}
	public void deleteContact(String contactId) {
		
		if (!contacts.containsKey(contactId)) {
		    throw new IllegalArgumentException("Contact ID not found.");
		}

		contacts.remove(contactId);

	}
	
	public void updateFirstName(String contactId, String firstName) {
		
		if (!contacts.containsKey(contactId)) {
		    throw new IllegalArgumentException("Contact ID not found.");
		}
		
		Contact contact = contacts.get(contactId);
		contact.setFirstName(firstName);

	}
	public void updateLastName(String contactId, String lastName) {

	    if (!contacts.containsKey(contactId)) {
	        throw new IllegalArgumentException("Contact ID not found.");
	    }

	    Contact contact = contacts.get(contactId);
	    contact.setLastName(lastName);
	}
	
	public void updatePhone(String contactId, String phone) {

	    if (!contacts.containsKey(contactId)) {
	        throw new IllegalArgumentException("Contact ID not found.");
	    }

	    Contact contact = contacts.get(contactId);
	    contact.setPhone(phone);
	}
	
	public void updateAddress(String contactId, String address) {

	    if (!contacts.containsKey(contactId)) {
	        throw new IllegalArgumentException("Contact ID not found.");
	    }

	    Contact contact = contacts.get(contactId);
	    contact.setAddress(address);
	}
}
