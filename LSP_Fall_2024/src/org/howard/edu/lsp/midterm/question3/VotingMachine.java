package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

/**
 * A simplified voting machine that manages candidates and their votes.
 */
public class VotingMachine {
    private Map<String, Integer> candidates; // Stores candidates and their vote counts

    /**
     * Constructs a VotingMachine with an empty candidate list.
     */
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    /**
     * Add a candidate with the name to the list.
     *
     * @param name The name of the candidate to add
     */
    public void addCandidate(String name) {
        candidates.putIfAbsent(name, 0);
    }

    /**
     * Casts a vote for the candidate with the name.
     *
     * @param name The name of the candidate to vote for
     */
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1); //Increment vote count by 1
        } else {
            System.out.println("Candidate " + name + " does not exist.");
        }
    }

    /**
     * Returns a string representation of the candidates and their vote counts.
     *
     * @return A string displaying each candidate and the number of votes received
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Candidates and their votes:\n");
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n");
        }
        return result.toString();
    }
}
