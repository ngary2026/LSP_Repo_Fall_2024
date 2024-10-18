package org.howard.edu.lsp.midterm.question2;

public class Calculator {
	/**
     * Sums two integers.
     *
     * @param a The first integer
     * @param b The second integer
     * @return The sum of the two integers
     */
    public static int sum(int a, int b) {
        return a + b;
    }
    
    /**
     * Sums two double values.
     *
     * @param a The first double value
     * @param b The second double value
     * @return The sum of the two double values
     */
    public static double sum(double a, double b) {
        return a + b;
    }
    
    /**
     * Sums all elements in an array of integers.
     *
     * @param numbers An array of integers
     * @return The sum of all integers in the array
     */
    public static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}