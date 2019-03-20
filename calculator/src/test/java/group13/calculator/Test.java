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
	public void testadd1() {
		assertEquals(7,calc.add(5, 2));
	}
	public void testadd2() {
		assertEquals(3,calc.add(3, 7));
	}
	public void testadd3() {
		assertEquals(3,calc.add(3, 7));
	}
}
