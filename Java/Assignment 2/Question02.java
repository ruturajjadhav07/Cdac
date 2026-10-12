// 2. Write a program to print the sum and average of the elements of an array

import java.util.Scanner;

class Question02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements in array: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = (double) sum / n;
        System.out.println("The sum of elements is " + sum);
        System.out.println("The average of elements is " + average);

        sc.close();
    }
}