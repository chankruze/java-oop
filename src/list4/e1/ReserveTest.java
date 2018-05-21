package list4.e1;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

import br.edu.fatecfranca.list4.e1.*;

public class ReserveTest {
	private Reserve reserve;
	private Flight flight;

	@Before public void setUp() {
		reserve = new Reserve();
		flight = new Flight(2, "Italia/Roma");
	}

	@Test public void testCreationId() {
		assertEquals(1, reserve.getId());
	}

	@Test public void testSetFlight() {
		reserve.setFlight(flight);
		assertEquals(2, reserve.getFlight().getId());
	}

	@Test public void testGetFlight() {
		reserve.setFlight(flight);
		assertEquals(flight, reserve.getFlight());
	}

	@Test public void testShow() {
		assertEquals("Reserve Id: 1 Flight Id: 1", reserve.show());
	}
}

