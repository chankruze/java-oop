package list5;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

import br.edu.fatecfranca.list5.*;

public class AnimalTest {
	private Animal animal;

	@Before public void setUp() {
		animal = new Animal();
	}

	@Test public void testCreationName() {
		assertEquals("Whale", animal.getName());
	}

	@Test public void testSpeak() {
		assertEquals("I don't speak", animal.speak());
	}

}

