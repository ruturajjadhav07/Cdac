// Write a program to find the character with the maximum frequency in a string.
// Input: "programming"
// Output: g

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

class MaximumFreq {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter word: ");
            String str = sc.next();

            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            char maxChar = str.charAt(0);
            int maxFrequency = 0;
            for (Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxFrequency) {
                    maxChar = entry.getKey();
                    maxFrequency = entry.getValue();
                }
            }
            System.out.println("Character with maximum frequency: " + maxChar + " with count of " + maxFrequency);
        }
    }
}