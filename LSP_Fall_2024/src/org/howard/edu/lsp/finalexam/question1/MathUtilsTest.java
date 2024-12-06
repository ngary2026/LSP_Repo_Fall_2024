package org.howard.edu.lsp.finalexam.question1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
	 private final MathUtils mathUtils = new MathUtils();

	    // Factorial Tests
	    @Test
	    void testFactorial_Zero_ShouldReturnOne() {
	    	assertEquals(1, mathUtils.factorial(0));
	    }

	    @Test
	    void testFactorial_PositiveNumber_ShouldReturnCorrectResult() {
	        assertEquals(120, mathUtils.factorial(5));
	    }

	    @Test
	    void testFactorial_NegativeNumber_ShouldThrowException() {
	        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-3));
	    }

	    // Prime Number Tests
	    @Test
	    void testIsPrime_NegativeNumber_ShouldReturnFalse() {
	        assertFalse(mathUtils.isPrime(-7));
	    }

	    @Test
	    void testIsPrime_NonPrimeNumber_ShouldReturnFalse() {
	        assertFalse(mathUtils.isPrime(4));
	    }

	    @Test
	    void testIsPrime_PrimeNumber_ShouldReturnTrue() {
	        assertTrue(mathUtils.isPrime(7));
	    }

	    // GCD Tests
	    @Test
	    void testGcd_OneNumberZero_ShouldReturnAbsoluteValueOfOtherNumber() {
	        assertEquals(10, mathUtils.gcd(0, 10));
	        assertEquals(10, mathUtils.gcd(10, 0));
	    }

	    @Test
	    void testGcd_TwoPositiveNumbers_ShouldReturnCorrectGCD() {
	        assertEquals(6, mathUtils.gcd(54, 24));
	    }

	    @Test
	    void testGcd_BothNumbersZero_ShouldThrowException() {
	        assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(0, 0));
	    }
}
