// 1. Write a program to read and print n elements to a one dimensional array

import java.util.Scanner;

class Question1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        sc.close();
    }
}