// 17. Write a program to reverse a number

import java.util.Scanner;

class Question17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;

        while (num != 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        System.out.println("The reverse of " + original + " is " + reverse);
    }
}