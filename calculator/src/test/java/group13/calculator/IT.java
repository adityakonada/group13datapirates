package group13.calculator;

import static org.junit.Assert.*;
import org.junit.BeforeClass;


import org.junit.Test;

public class IT {
	public static Calcu calciint;
	@BeforeClass
	public static void setup() {
	calciint= new Calcu();
	}
	@Test
	public void test() {
		assertEquals(24,calciint.add(calciint.add(8,8),calciint.add(4,4)));
	}		
	@Test
	public void test1() {
		assertEquals(14,calciint.add(calciint.add(5,5),calciint.add(2,2)));
	}		
	}

