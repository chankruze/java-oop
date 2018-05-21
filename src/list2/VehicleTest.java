package list2;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

import br.edu.fatecfranca.list2.Vehicle;

public class VehicleTest {
	private Vehicle vehicle;

	@Before public void setUp() {
		vehicle = new Vehicle();
	}

	@Test public void testCreation() {
		assertEquals(2004, vehicle.year);
	}

	@Test public void testCreationWheelsDefaultValues() {
		assertEquals(4, vehicle.wheels);
	}

	@Test public void testCreationYearDefaultValues() {
		assertEquals(2004, vehicle.year);
	}

	@Test public void testCreationColorDefaultValues() {
		assertEquals("blank", vehicle.color);
	}

	@Test public void testCreationTypeDefaultValues() {
		assertEquals("hat", vehicle.type);
	}

	@Test public void testSetType() {
		String newType = "Pickup";
		vehicle.setType(newType);

		assertEquals(newType, vehicle.type);
	}
}

