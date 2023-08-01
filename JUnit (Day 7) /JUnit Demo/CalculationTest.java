package Bootcamp.Day7.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Bootcamp.Day7.Calculation;

public class CalculationTest {

	Calculation calculation = null;
	@Test
	public void testAddition() {
		
		//Calculation calculation = new Calculation();
		assertEquals(4,calculation.addition(2,2));
		System.out.println("---- 1. test addition -----");
		
	}
	
	@Test
	public void testSubtraction() {
		
		//Calculation calculation = new Calculation();
		assertEquals(4,calculation.subtraction(4,2));
		System.out.println("---- 2. test subtraction -----");
		
	}
	
	@Test
	public void testEligibilityTrue() {
		
		//Calculation calculation = new Calculation();
		assertTrue(calculation.checkEligibility(25));
		System.out.println("---- 3. test eligibility true condition -----");
		
	}
	
	@Test
	public void testEligibilityFalse() {
		
		//Calculation calculation = new Calculation();
		assertFalse(calculation.checkEligibility(12));
		System.out.println("---- 4. test eligibility false condition -----");
		
	}
	
	@Before
	public void test1() {
		System.out.println("---- Before ----");
		calculation = new Calculation();
	}
	
	@After
	public void test2() {
		System.out.println("---- After ----");
		calculation = null;
	}
	
	@BeforeClass
	public static void test3() {
		System.out.println("---- Before All ----");
	}
	
	@AfterClass
	public static void test4() {
		System.out.println("---- After All ----");
	}
}
