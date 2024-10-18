package org.howard.edu.lsp.midterm.question3;

/**
 * A driver class to test the functionality of the VotingMachine class.
 */
public class VotingMachineDriver {
    public static void main(String[] args) {
        // Creating an instance of VotingMachine
        VotingMachine vm = new VotingMachine();

        // Adding candidates
        vm.addCandidate("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.addCandidate("Hogan");

        // Outputting the current state of the voting machine
        System.out.println(vm.toString()); // Prints out candidates and their votes
    }
}
