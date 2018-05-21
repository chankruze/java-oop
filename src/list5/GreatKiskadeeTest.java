package list5;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

import br.edu.fatecfranca.list5.*;

public class GreatKiskadeeTest {
	private GreatKiskadee great;

	@Before public void setUp() {
		great = new GreatKiskadee();
	}

	@Test public void testCustomSpeak() {
		assertEquals("bem-te-vi", great.speak());
	}
}

