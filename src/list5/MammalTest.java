package list5;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

import br.edu.fatecfranca.list5.*;

public class MammalTest {
	private Mammal mammal;

	@Before public void setUp() {
		mammal = new Mammal();
	}

	@Test public void testCreationName() {
		assertEquals("Whale", mammal.getName());
	}
}

