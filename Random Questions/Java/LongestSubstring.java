// Write a program to find the longest substring without repeating characters.
// Input: "abcabcbb"
// Output: 3A

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class LongestSubstring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a substring: ");
        String str = sc.next();

        Set<Character> set = new HashSet<>();

        int j = 0;
        int maxLength = 0;

        for (int i = 0; i < str.length(); i++) {

            while (set.contains(str.charAt(i))) {
                set.remove(str.charAt(j));
                j++;
            }

            set.add(str.charAt(i));

            maxLength = Math.max(maxLength, i - j + 1);
        }

        System.out.println(maxLength);
    }
}