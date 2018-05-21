package list4.e1;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

import br.edu.fatecfranca.list4.e1.*;

public class FlightTest {
	private Flight flight;

	@Before public void setUp() {
		flight = new Flight();
	}

	@Test public void testCreationId() {
		assertEquals(1, flight.getId());
	}

	@Test public void testCreationDestination() {
		assertEquals("France/Paris", flight.getDestination());
	}

	@Test public void testShow() {
		assertEquals("Flight Id: 1 Destination: France/Paris", flight.show());
	}
}

