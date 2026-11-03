// 7. Write a program to find if a given string is a palindrome or not using StringBuilder

import java.util.Scanner;

class Question07 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = sc.next();
        StringBuilder sb = new StringBuilder(word);

        String reverse = sb.reverse().toString();

        if (word.equals(reverse)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }
    }
}