package org.howard.edu.lsp.finalexam.question2;
import java.util.Scanner;

/**
 * Client program for testing the RandomNumberService.
 */
public class RandomNumberClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        runProgram(scanner); // Start the program
        scanner.close(); // Close the scanner after the program ends
    }

    /**
     * Runs the random number generation program.
     * @param scanner Scanner instance for user input
     */
    private static void runProgram(Scanner scanner) {
        // Get the singleton instance of RandomNumberService
        RandomNumberService service = RandomNumberService.getInstance();

        // Prompt the user to select a random number generator strategy
        System.out.println("Select a random number generator strategy:");
        System.out.println("1. Built-In Random Strategy");
        System.out.println("2. Custom Random Strategy");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        // Set the strategy based on user input
        switch (choice) {
            case 1:
                service.setStrategy(new BuiltInRandomStrategy());
                System.out.println("Random number using Built-In Strategy: " + service.generateRandomNumber());
                break;
            case 2:
                service.setStrategy(new CustomRandomStrategy());
                System.out.println("Random number using Custom Strategy: " + service.generateRandomNumber());
                break;
            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
                runProgram(scanner); // Recursively call for valid input
                return;
        }

        // Ask if the user wants to run the program again
        askToRunAgain(scanner);
    }

    /**
     * Asks the user if they want to run the program again and handles their response.
     * @param scanner Scanner instance for user input
     */
    private static void askToRunAgain(Scanner scanner) {
        System.out.print("Would you like to run it again? (y/n): ");
        scanner.nextLine(); // Consume the leftover newline character
        String response = scanner.nextLine().trim().toLowerCase();

        // Handle user response
        switch (response) {
            case "y":
                runProgram(scanner); // Restart the program
                break;
            case "n":
                System.out.println("Exiting program.");
                break;
            default:
                System.out.println("Invalid response. Please type 'y' or 'n'.");
                askToRunAgain(scanner);
                break;
        }
    }
}
