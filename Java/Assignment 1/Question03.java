// 3. Write a program to calculate the Simple interest where principal, interest and time period
// are given as command line arguments.
// (Simple Interest=P × r × n where P=Principal, r=Interest rate, n=Term of loan in years)

import java.util.Scanner;

class Question03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principle amount: ");
        double principle = sc.nextDouble();

        System.out.print("Enter interest: ");
        double interest = sc.nextDouble();

        System.out.print("Enter time: ");
        int time = sc.nextInt();

        double Simple_interest = 0;
        Simple_interest = (principle * interest * time) / 100;

        System.out.println("Simple interest = " + Simple_interest);
    }
}
