package list5;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

import br.edu.fatecfranca.list5.*;

public class DogTest {
	private Dog dog;

	@Before public void setUp() {
		dog = new Dog();
	}

	@Test public void testCreationName() {
		assertEquals("Whale", dog.getName());
	}

	@Test public void testSpeak() {
		assertEquals("au au", dog.speak());
	}

	@Test public void testSetVocabulary() {
		assertEquals("au au", dog.speak());
		dog.setVocabulary("I love meat");
		assertEquals("I love meat", dog.speak());
	}

	@Test public void testBarkHigh() {
		assertEquals("au au", dog.speak());
		dog.setBarkHigh();
		assertEquals("AU AU", dog.speak());
	}

	@Test public void testBarkLow() {
		dog.setBarkHigh();
		assertEquals("AU AU", dog.speak());
		dog.setBarkLow();
		assertEquals("au au", dog.speak());
	}

	@Test public void testGetSteps() {
		assertEquals(0, dog.getSteps());
	}

	@Test public void testWalk() {
		assertEquals(0, dog.getSteps());
		dog.walk();
		assertEquals(1, dog.getSteps());
	}

	@Test public void testInfo() {
		assertEquals("Dog: Whale, steps: 0", dog.info());
	}
}

