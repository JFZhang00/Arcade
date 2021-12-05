package peopleTests;

import static org.junit.jupiter.api.Assertions.*;

import people.Guest;

import org.junit.jupiter.api.Test;

class GuestTest {

	@Test
	void testGuest() {
		Guest g1 = new Guest();
		assertEquals(g1.getIsGuest(), true);
	}

}
