package group13.calculator;

import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class Test {
	private static Calcu calc;
	@BeforeClass
	public static void setup() {
		calc = new Calcu();
	}

	@org.junit.Test
	public void testadd() {
		assertEquals(7,calc.add(5, 2));
	}

}
