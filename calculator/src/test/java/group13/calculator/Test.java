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
		assertEquals(8,calc.add(5, 3));
	}
	@org.junit.Test
	public void testadd2() {
		assertEquals(3,calc.add(2, 1));
	}
	@org.junit.Test
	public void testadd3() {
		assertEquals(9,calc.add(5, 4));
	}
}
