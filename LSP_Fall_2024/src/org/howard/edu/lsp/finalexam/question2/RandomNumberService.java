package org.howard.edu.lsp.finalexam.question2;

/**
 * Singleton service for random number generation.
 */
public class RandomNumberService {
	private static RandomNumberService instance; 
    private RandomNumberStrategy strategy;

    private RandomNumberService() {} 

    /**
     * Returns the singleton instance of the service.
     * @return RandomNumberService instance
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the strategy for random number generation.
     * @param strategy the random number strategy
     */
    public void setStrategy(RandomNumberStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Generates a random number using the selected strategy.
     * @return a random positive integer
     * @throws IllegalStateException if no strategy is set
     */
    public int generateRandomNumber() {
        if (strategy == null) {
            throw new IllegalStateException("No strategy set for random number generation.");
        }
        return strategy.generateRandomNumber();
    }
}
