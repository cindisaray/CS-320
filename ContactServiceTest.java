package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testAddContact() {

	    ContactService service = new ContactService();

	    Contact contact = new Contact(
	            "12345",
	            "Cindi",
	            "Rodriguez",
	            "8015551234",
	            "123 Main St");

	    service.addContact(contact);

	    service.deleteContact("12345");
	}
	
	@Test
	void testDuplicateContactId() {

	    ContactService service = new ContactService();

	    Contact contact1 = new Contact(
	            "12345",
	            "Cindi",
	            "Rodriguez",
	            "8015551234",
	            "123 Main St");

	    Contact contact2 = new Contact(
	            "12345",
	            "Danny",
	            "Flores",
	            "8015555678",
	            "456 Main St");

	    service.addContact(contact1);

	    assertThrows(IllegalArgumentException.class, () -> {
	        service.addContact(contact2);
	    });
	}
	
	@Test
	void testDeleteContactNotFound() {

	    ContactService service = new ContactService();

	    assertThrows(IllegalArgumentException.class, () -> {
	        service.deleteContact("99999");
	    });
	}
	
	@Test
	void testUpdateFirstName() {

	    ContactService service = new ContactService();

	    Contact contact = new Contact(
	            "12345",
	            "Cindi",
	            "Rodriguez",
	            "8015551234",
	            "123 Main St");

	    service.addContact(contact);

	    service.updateFirstName("12345", "Danny");

	    assertEquals("Danny", contact.getFirstName());
	}
	
	@Test
	void testUpdateLastName() {

	    ContactService service = new ContactService();

	    Contact contact = new Contact(
	            "12345",
	            "Cindi",
	            "Rodriguez",
	            "8015551234",
	            "123 Main St");

	    service.addContact(contact);

	    service.updateLastName("12345", "Flores");

	    assertEquals("Flores", contact.getLastName());
	}
	
	@Test
	void testUpdatePhone() {

	    ContactService service = new ContactService();

	    Contact contact = new Contact(
	            "12345",
	            "Cindi",
	            "Rodriguez",
	            "8015551234",
	            "123 Main St");

	    service.addContact(contact);

	    service.updatePhone("12345", "3855559876");

	    assertEquals("3855559876", contact.getPhone());
	}
	
	@Test
	void testUpdateAddress() {

	    ContactService service = new ContactService();

	    Contact contact = new Contact(
	            "12345",
	            "Cindi",
	            "Rodriguez",
	            "8015551234",
	            "123 Main St");

	    service.addContact(contact);

	    service.updateAddress("12345", "456 Oak St");

	    assertEquals("456 Oak St", contact.getAddress());
	}
	
	@Test
	void testUpdateInvalidContact() {

	    ContactService service = new ContactService();

	    assertThrows(IllegalArgumentException.class, () -> {
	        service.updateFirstName("99999", "Danny");
	    });
	}
}
