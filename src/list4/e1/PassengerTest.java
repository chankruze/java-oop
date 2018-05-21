package list4.e1;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

import br.edu.fatecfranca.list4.e1.*;

public class PassengerTest {
	private Passenger passenger;
	private Reserve reserve;

	@Before public void setUp() {
		passenger = new Passenger();
		reserve = new Reserve(2, new Flight());
	}

	@Test public void testCreationName() {
		assertEquals("Daniel", passenger.getName());
	}

	@Test public void testSetReserve() {
		passenger.setReserve(reserve);

		assertEquals(2, passenger.getReserve().getId());
	}

	@Test public void testGetReserve() {
		passenger.setReserve(reserve);

		assertEquals(reserve, passenger.getReserve());
	}

	@Test public void testShow() {
		assertEquals("Passenger Name: Daniel Reserve Id: 1", passenger.show());
	}
}

