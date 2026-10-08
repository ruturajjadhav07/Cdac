// 2. Write a program to calculate your age in terms of years.

import java.util.Scanner;
import java.time.Year;

class Question2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int year = sc.nextInt();

        int currentYear = Year.now().getValue();

        if (year > currentYear) {
            System.out.println("Invalid birth year");
        } else {
            int age = currentYear - year;
            System.out.println("Your age is " + age + " years.");
        }
    }
}