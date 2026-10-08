// 6. Write a program to find if a given year is leap year or not.

import java.util.Scanner;

class Question6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if (year % 4 == 0 || year % 400 == 0 || year % 100 != 0) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}