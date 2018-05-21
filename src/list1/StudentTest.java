package list1;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

import br.edu.fatecfranca.list1.Student;

public class StudentTest {
	private Student student;

	@Before public void setUp() {
		student = new Student();
	}

	@Test public void testCreation() {
		assertEquals(1, student.number);
	}

	@Test public void testFinalScore() {
		Student student1 = new Student(2, "One", 20, 7, 6);
		Student student2 = new Student(2, "One", 20, 7, 9);

		assertTrue(6.5 == student1.finalScore());
		assertTrue(8.0 == student2.finalScore());
	}

	@Test public void testShow() {
		assertEquals("1 - Name - 20", student.show());
	}

	@Test public void testApproved() {
		Student student2 = new Student(2, "One", 20, 4, 5);
		assertTrue(student.isApproved());
		assertFalse(student2.isApproved());
	}
}

