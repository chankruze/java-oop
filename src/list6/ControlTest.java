package list6;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;

import br.edu.fatecfranca.list6.*;

public class ControlTest {
	@Test public void testPerfomTv() throws Exception {
		Tv tv      = new Tv();
		Control control = new Control(tv);

		control.perform();
	}

	@Test public void testPerfomRadio() throws Exception {
		Radio radio     = new Radio();
		Control control = new Control(radio);

		control.perform();
	}
}

