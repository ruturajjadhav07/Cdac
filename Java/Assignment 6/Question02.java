// 2. Write a program that would accept a line of text. Count the occurrence of each vowel in the
// text and display the count.

import java.util.Scanner;

class Question02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string which can have vowels in it: ");
        String str = sc.nextLine();
        int vowelCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vowelCount += 1;
            }
        }

        System.out.println("The vowel count in given sting is " + vowelCount);
    }
}