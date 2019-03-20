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
	@org.junit.Test
	public void testadd2() {
		assertEquals(11,calc.add(3, 7));
	}
	@org.junit.Test
	public void testadd3() {
		assertEquals(6,calc.add(4, 2));
	}
}
