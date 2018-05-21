package list4.e2;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

import br.edu.fatecfranca.list4.e2.*;

public class BusTest {
	private Bus bus;

	@Before public void setUp() {
		bus = new Bus();
	}

	@Test public void testCreationPassengerQuantity() {
		assertEquals(0, bus.getPassengerQuantity());
	}

	@Test public void testCreationNumber() {
		assertEquals("1020-10", bus.getNumber());
	}

	@Test public void testCreatePassenger() {
		bus.createPassenger(2, "Luis");
		ArrayList<Passenger> passengers = bus.getPassengers();
		Passenger passenger = passengers.get(0);

		assertEquals("Luis", passenger.getName());
		assertEquals(2, passenger.getPlace());
		assertEquals(1, bus.getPassengerQuantity());
	}

	@Test public void testAddPassengerQuantity() {
		assertEquals(0, bus.getPassengerQuantity());
		bus.addPassenger(new Passenger());

		assertEquals(1, bus.getPassengerQuantity());
		assertEquals(1, bus.getPassengers().size());
	}

	@Test public void testBusList() {
		Bus bus2 = Bus.getBuses().get(0);
		assertEquals(bus.getNumber(), bus2.getNumber());
		assertEquals(bus.getPassengerQuantity(), bus2.getPassengerQuantity());
	}

	@Test public void testGetBus() {
		Bus bus2 = Bus.getBus("1020-10");
		assertEquals(bus.getNumber(), bus2.getNumber());
		assertEquals(bus.getPassengerQuantity(), bus2.getPassengerQuantity());
	}

	@Test public void testEmitPassenger() {
		bus.createPassenger(2, "Daniel");
		bus.createPassenger(3, "George");

		String list = bus.getPassengers().get(0).show() + "\n" + bus.getPassengers().get(1).show() + "\n";
		assertEquals(list, bus.emitPassengers());
	}

	@Test public void testShow() {
		assertEquals("Bus Number: 1020-10; Quantity of Passengers: 0", bus.show());
	}

	@Test public void testGetPassenger() {
		bus.createPassenger(2, "Daniel");
		Passenger passenger = bus.getPassenger("Daniel");

		assertEquals("Daniel", passenger.getName());
		assertEquals(2, passenger.getPlace());
	}
}

