package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContactCreation() {

	    Contact contact = new Contact(
	            "12345",
	            "Cindi",
	            "Rodriguez",
	            "8015551234",
	            "123 Main St");

	    assertEquals("12345", contact.getContactId());
	    assertEquals("Cindi", contact.getFirstName());
	    assertEquals("Rodriguez", contact.getLastName());
	    assertEquals("8015551234", contact.getPhone());
	    assertEquals("123 Main St", contact.getAddress());
	}
	@Test
	void testInvalidContactIdNull() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	                null,
	                "Cindi",
	                "Rodriguez",
	                "8015551234",
	                "123 Main St");
	    });

	}
	@Test
	void testInvalidContactIdTooLong() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	                "12345678901",
	                "Cindi",
	                "Rodriguez",
	                "8015551234",
	                "123 Main St");
	    });

	}
	
	@Test
	void testInvalidFirstNameNull() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	                "12345",
	                null,
	                "Rodriguez",
	                "8015551234",
	                "123 Main St");
	    });
	}

	@Test
	void testInvalidFirstNameTooLong() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	                "12345",
	                "Christopher",
	                "Rodriguez",
	                "8015551234",
	                "123 Main St");
	    });
	}
	
	@Test
	void testInvalidLastNameNull() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	                "12345",
	                "Cindi",
	                null,
	                "8015551234",
	                "123 Main St");
	    });
	}

	@Test
	void testInvalidLastNameTooLong() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	                "12345",
	                "Cindi",
	                "Rodriguezzz",
	                "8015551234",
	                "123 Main St");
	    });
	}
	@Test
	void testInvalidPhoneNull() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	                "12345",
	                "Cindi",
	                "Rodriguez",
	                null,
	                "123 Main St");
	    });
	}

	@Test
	void testInvalidPhoneLength() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	                "12345",
	                "Cindi",
	                "Rodriguez",
	                "801555123",
	                "123 Main St");
	    });
	}
	
	@Test
	void testInvalidAddressNull() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	                "12345",
	                "Cindi",
	                "Rodriguez",
	                "8015551234",
	                null);
	    });
	}

	@Test
	void testInvalidAddressTooLong() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	                "12345",
	                "Cindi",
	                "Rodriguez",
	                "8015551234",
	                "1234567890123456789012345678901");
	    });
	}
	
	@Test
	void testSetFirstName() {

	    Contact contact = new Contact(
	            "12345",
	            "Cindi",
	            "Rodriguez",
	            "8015551234",
	            "123 Main St");

	    contact.setFirstName("Danny");

	    assertEquals("Danny", contact.getFirstName());
	}
	
	@Test
	void testSetFirstNameInvalid() {

	    Contact contact = new Contact(
	            "12345",
	            "Cindi",
	            "Rodriguez",
	            "8015551234",
	            "123 Main St");

	    assertThrows(IllegalArgumentException.class, () -> {
	        contact.setFirstName(null);
	    });
	}
}
