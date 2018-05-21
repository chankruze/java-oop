package list5;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

import br.edu.fatecfranca.list5.*;

public class BoxerTest {
	private Boxer boxer;

	@Before public void setUp() {
		boxer = new Boxer();
	}

	@Test public void testWalk() {
		assertEquals(0, boxer.getSteps());
		boxer.walk();
		assertEquals(2, boxer.getSteps());
	}

	@Test public void testInfo() {
		assertEquals("Boxer: Whale, steps: 0", boxer.info());
	}
}
