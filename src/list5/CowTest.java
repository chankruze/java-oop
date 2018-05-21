package list5;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

import br.edu.fatecfranca.list5.*;

public class CowTest {
	private Cow cow;

	@Before public void setUp() {
		cow = new Cow();
	}

	@Test public void testCreationName() {
		assertEquals("Whale", cow.getName());
	}

	@Test public void testSpeak() {
		assertEquals("muuuuu", cow.speak());
	}
}

