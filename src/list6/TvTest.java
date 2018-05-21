package list6;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;

import br.edu.fatecfranca.list6.*;

public class TvTest {
	private Tv tv;

	@Before public void setUp() {
		tv = new Tv();
	}

	@Test public void testCreationSerial() {
		assertEquals(1, tv.getSerial());
	}

	@Test public void testWatch() {
		assertEquals("5", tv.watch());
	}

	@Test public void testChangeChannel() {
		assertEquals("5", tv.watch());
		tv.changeChannel("9");
		assertEquals("9", tv.watch());
	}

	@Test public void testToString() {
		assertEquals("Product Serial: 1 Volume: 5 Test: Not Ok Channel: 5", tv.toString());
	}
}

