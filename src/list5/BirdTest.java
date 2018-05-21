package list5;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

import br.edu.fatecfranca.list5.*;

public class BirdTest {
	private Bird bird;

	@Before public void setUp() {
		bird = new Bird();
	}

	@Test public void testCreationName() {
		assertEquals("Whale", bird.getName());
	}

	@Test public void testCustomSpeak() {
		assertEquals("piu-piu", bird.speak());
	}
}

