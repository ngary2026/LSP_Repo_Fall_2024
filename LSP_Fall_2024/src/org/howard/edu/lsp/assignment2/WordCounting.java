package org.howard.edu.lsp.assignment2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class WordCounting {
	public static void main(String[] args) {
		String wordFile = "../LSP_Fall_2024/src/org/howard/edu/lsp/assignment2/words.txt";
		Map<String, Integer> wordCount = new HashMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(wordFile)))  {
			String line;
			while ((line = br.readLine()) != null) {
				line = line.toLowerCase().replaceAll("[^a-z\\s]", "");
				String[] words = line.split("\\s+");
				
				for(String word : words) {
					if (word.length() > 3) {
						wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
					}	
				}
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}
}
