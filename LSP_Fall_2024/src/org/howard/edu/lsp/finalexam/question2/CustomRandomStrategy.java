package org.howard.edu.lsp.finalexam.question2;

/**
 * Custom implementation of RandomNumberStrategy.
 * The algorithm follows the linear congruential generator (LCG) method.
 * 
 * This implementation is inspired by solutions and discussions found on:
 * - Stack Overflow: https://stackoverflow.com/questions/648976/random-number-generator
 * - GeeksforGeeks: https://www.geeksforgeeks.org/java-program-to-implement-the-linear-congruential-generator-for-pseudo-random-number-generation/
 * - Stack Overflow: https://stackoverflow.com/questions/12458383/java-random-numbers-using-a-seed
 * 
 */
public class CustomRandomStrategy implements RandomNumberStrategy{
	private long seed = System.currentTimeMillis();

    @Override
    public int generateRandomNumber() {
        seed = (seed * 25214903917L + 11) & ((1L << 48) - 1); // LCG algorithm
        return (int) ((seed >>> 16) & Integer.MAX_VALUE); // Ensure it's positive
    }
}
