// Write a Java program to reverse each word in a sentence without changing
// the word order.
// Input: "Java is awesome"
// Output: "avaJ si emosewa"

import java.util.Scanner;

class Reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to reverse: ");
        String str = sc.nextLine();

        StringBuilder reverseString = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            if (Character.isWhitespace(str.charAt(i))) {
                reverseString.append(str.charAt(i));
                i++;
            } else {
                int start = i;
                while (i < str.length() && !Character.isWhitespace(str.charAt(i))) {
                    i++;
                }
                reverseString.append(new StringBuilder(str.substring(start, i)).reverse());
            }
        }

        System.out.println(reverseString);
    }
}