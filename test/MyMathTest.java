import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

import org.junit.jupiter.api.Test;

class MyMathTest {

	
	@Test
	void testingExponentail() {
		int gotResult =MathCheck.getExponentail(2, 5);
		int expectedResult =32;
		assertEquals(expectedResult, gotResult);
	}
	
	@Test
	void testingboolean() {
		assertTrue("hello".length()>3);
	}
	
	@Test
	void testingSumOfArray() {
		assertEquals(6, MathCheck.sumOfArray(Arrays.asList(1,2,3)));
		}
	
	
	@Test
	void testCheckingTablePrintCorrectly() {
		assertEquals(MathCheck.tableGenerator(6),MathCheck.tableGenerator());
	}
	
	@Test
	void testCheckingTablePrintInCorrectly() {
		assertNotEquals(MathCheck.tableGenerator(6),MathCheck.tableGenerator());
	}
}
