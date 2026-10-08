// 14. Write a program to accept a string and an integer and print the string as many times as the
// value of the integer.

import java.util.Scanner;

class Question14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.print("Enter num: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(str);
        }
    }
}