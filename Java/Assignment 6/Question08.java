// 8. Accept a line of text. Find the reverse of each word and display the string

import java.util.Scanner;

class Question08 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = sc.nextLine();

        String words[] = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            words[i] = sb.reverse().toString();
        }

        String result = String.join(" ", words);

        System.out.println("Reversed text: " + result);
    }
}

// Not my solution