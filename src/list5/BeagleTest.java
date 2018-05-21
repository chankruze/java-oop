package list5;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

import br.edu.fatecfranca.list5.*;

public class BeagleTest {
	private Beagle beagle;

	@Before public void setUp() {
		beagle = new Beagle();
	}

	@Test public void testWalk() {
		assertEquals(0, beagle.getSteps());
		beagle.walk();
		assertEquals(4, beagle.getSteps());
	}

	@Test public void testInfo() {
		assertEquals("Beagle: Whale, steps: 0", beagle.info());
	}
}
