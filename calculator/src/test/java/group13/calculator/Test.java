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
	@org.junit.Test
	public void testadd4() {
		assertEquals(20,calc.add(10, 10));
	}
	@org.junit.Test
	public void testsub1() {
		assertEquals(30,calc.sub(50, 20));
	}
	@org.junit.Test
	public void testmul1() {
		assertEquals(24,calc.mul(6, 4));
	}
	@org.junit.Test
	public void testdiv1() {
		assertEquals(4,calc.div(20, 5));
	}
	@org.junit.Test
	public void testdiv2() {
		assertEquals(5,calc.div(20, 4));
	}
}
