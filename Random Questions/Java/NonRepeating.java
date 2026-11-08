// Write a program to find the first non-repeating character in a string.
// Input: "swiss"
// Output: w

import java.util.HashMap;
import java.util.Scanner;

class NonRepeating {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        boolean found = false;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (map.get(ch) == 1) {
                System.out.println("First non-repeating character: " + ch);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character found!");
        }

        sc.close();
    }
}
