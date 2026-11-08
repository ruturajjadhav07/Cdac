// Write a Java program to remove all duplicate characters from a string while
// keeping the original order.
// Input: "programming"
// Output: "progamin"

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

class RemoveDuplicates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();

        Set<Character> set = new LinkedHashSet<>();

        for (char c : ch) {
            set.add(c);
        }

        StringBuilder sb = new StringBuilder();

        for (char c : set) {
            sb.append(c);
        }

        System.out.println("After removing duplicates: " + sb);
        sc.close();
    }
}