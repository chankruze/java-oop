package list4.e2;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

import br.edu.fatecfranca.list4.e2.*;

public class StationTest {
	private Station station;

	@Before public void setUp() {
		station = new Station();
	}

	@Test public void testCreationName() {
		assertEquals("Principal Station", station.getName());
	}

	@Test public void testCreationCity() {
		assertEquals("Washington/DC", station.getCity());
	}

	@Test public void testCreateBus() {
		station.createBus(0, "1020-10");
		ArrayList<Bus> buses = station.getBuses();
		Bus bus = buses.get(0);

		assertEquals("1020-10", bus.getNumber());
		assertEquals(0, bus.getPassengerQuantity());
	}

	@Test public void testAddBusQuantity() {
		assertEquals(0, station.getBusQuantity());
		station.addBus(new Bus());
		assertEquals(1, station.getBusQuantity());
	}

	@Test public void testGetBusByNumber() {
		station.createBus(2, "30409-6");
		station.createBus(0, "30409");
		station.createBus(2, "90489-4");

		Bus bus = station.getBuses().get(1);
		Bus bus2 = station.getBus("30409");

		assertEquals(bus.getNumber(), bus2.getNumber());
		assertEquals(bus.getPassengerQuantity(), bus2.getPassengerQuantity());
	}

	@Test public void testEmitBus() {
		station.createBus(0, "30409");
		station.createBus(2, "90489-4");

		Bus bus = station.getBuses().get(0);
		bus.addPassenger(new Passenger());
		bus.addPassenger(new Passenger());
		Bus bus2 = station.getBuses().get(1);
		bus2.addPassenger(new Passenger());
		bus2.addPassenger(new Passenger());

		String list = bus.show() + "\n" + bus.emitPassengers() +
			bus2.show() + "\n" + bus2.emitPassengers();
		assertEquals(list, station.emitBuses());
	}

	@Test public void testGetStation() {
		Station station2 = Station.getStation("Principal Station");

		assertEquals(station.getName(), station2.getName());
		assertEquals(station.getCity(), station2.getCity());
	}

	@Test public void testCreatePassengerOfBus() {
		station.createBus(0, "1010-50");
		Bus bus = station.getBus("1010-50");
		Passenger passenger = station.createPassengerBus(bus, 2, "Luis");

		assertEquals("Luis", bus.getPassengers().get(0).getName());
		assertEquals(2, bus.getPassengers().get(0).getPlace());
	}

	@Test public void testCreationBusQuantity() {
		assertEquals(0, station.getBusQuantity());
	}
}

