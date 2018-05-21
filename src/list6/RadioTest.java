package list6;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;

import br.edu.fatecfranca.list6.*;

public class RadioTest {
	private Radio radio;

	@Before public void setUp() {
		radio = new Radio();
	}

	@Test public void testCreationSerial() {
		assertEquals(1, radio.getSerial());
	}

	@Test public void testListen() {
		assertEquals("94.9 FM", radio.listen());
	}

	@Test public void testChangeStation() {
		assertEquals("94.9 FM", radio.listen());
		radio.changeStation("103.3");
		assertEquals("103.3 FM", radio.listen());
	}

	@Test public void testChangeBand() {
		assertEquals("94.9 FM", radio.listen());
		radio.changeBand("AM");
		assertEquals("94.9 AM", radio.listen());
	}

	@Test public void testToString() {
		assertEquals("Product Serial: 1 Volume: 5 Test: Not Ok Listen: 94.9 FM", radio.toString());
	}
}

