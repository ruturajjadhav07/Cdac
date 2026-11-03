// 3. Write a program to display the number of words in a given sentence.

import java.util.Scanner;

class Question03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        str = str.trim();

        int count = 0;

        if (!str.isEmpty()) {
            String[] splitStr = str.split("\\s+");

            for (int i = 0; i < splitStr.length; i++) {
                count++;
            }
        }

        System.out.println("Total number of words in string are: " + count);

        sc.close();
    }
}