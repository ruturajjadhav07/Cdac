// 11. Write a program to read 4 values a, b, c and d from the terminal and evaluates the ratio of
// (a+b) to (c- d) and prints the result if (c-d) is not equal to zero

import java.util.Scanner;

class Question11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = sc.nextInt();

        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        System.out.print("Enter value for c: ");
        int c = sc.nextInt();

        System.out.print("Enter value for d: ");
        int d = sc.nextInt();

        int denominator = c - d;

        if (denominator != 0) {
            double ratio = (double) (a + b) / denominator;
            System.out.println("Ratio = " + ratio);
        } else {
            System.out.println("Cannot calculate ratio because (c - d) is zero.");
        }
        sc.close();
    }
}