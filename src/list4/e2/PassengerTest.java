package list4.e2;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

import br.edu.fatecfranca.list4.e2.*;

public class PassengerTest {
	private Passenger passenger;

	@Before public void setUp() {
		passenger = new Passenger();
	}

	@Test public void testCreationPlace() {
		assertEquals(10, passenger.getPlace());
	}

	@Test public void testCreationName() {
		assertEquals("Daniel", passenger.getName());
	}

	@Test public void testShow() {
		assertEquals("Place: 10; Name: Daniel", passenger.show());
	}
}

