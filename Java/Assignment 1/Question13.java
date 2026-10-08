// 13. Write a program to find the average of n numbers

import java.util.Scanner;

class Question13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num to find average: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        double average = (double) sum / num;
        System.out.println("The average sum of " + num + " numbers is " + average);
    }
}