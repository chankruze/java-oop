package list5;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

import br.edu.fatecfranca.list5.*;

public class ParrotTest {
	private Parrot parrot;

	@Before public void setUp() {
		parrot = new Parrot();
	}

	@Test public void testCreationName() {
		assertEquals("Whale", parrot.getName());
	}

	@Test public void testSpeak() {
		assertEquals("I love cookies", parrot.speak());
	}

	@Test public void testSetVocabulary() {
		assertEquals("I love cookies", parrot.speak());
		parrot.setVocabulary("I love meat");
		assertEquals("I love meat", parrot.speak());
	}
}

