package list6;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;

import br.edu.fatecfranca.list6.*;

public class ProductTest {
	private Product product;
	private Throwable exception;

	@Before public void setUp() {
		product = new Product();
		exception = null;
	}

	@Test public void testCreationSerial() {
		assertEquals(1, product.getSerial());
	}

	@Test public void testCreationVolume() {
		assertEquals(5, product.getVolume());
	}

	@Test public void testCreationState() {
		assertEquals("Not Tested", product.getState());
	}

	@Test public void testTestUnitTrue() throws Exception {
		assertEquals("Not Tested", product.getState());
		product.setChance(100);
		assertTrue(product.testUnit());
		assertEquals("Approved", product.getState());
	}

	@Test public void testTestUnitFalse() throws Exception {
		assertEquals("Not Tested", product.getState());
		product.setChance(0);
		assertFalse(product.testUnit());
		assertEquals("Not Approved", product.getState());
	}

	@Test public void testTestUnitAlready() throws Exception {
		product.testUnit();

		try {
			product.testUnit();
		} catch (Throwable ex) {
			exception = ex;
		}
		assertEquals("Already Tested", exception.getMessage());
		assertTrue(exception instanceof Exception);
	}

	@Test public void testToStringTrue() throws Exception {
		product.setChance(100);
		product.testUnit();
		assertEquals("Product Serial: 1 Volume: 5 Test: Ok", product.toString());
	}

	@Test public void testToStringFalse() throws Exception {
		product.setChance(0);
		product.testUnit();
		assertEquals("Product Serial: 1 Volume: 5 Test: Not Ok", product.toString());
	}

}

