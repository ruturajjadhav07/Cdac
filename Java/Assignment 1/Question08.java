// 8. A cloth shop offers a discount of 10% for purchases made up to Rs.1000, 12% for
// purchases between 1000 and 1500 and 15% for purchases more than 1500. Write a
// program to implement the above scheme for a given sales amount and print out the sales
// amount, discount and net amount payable by the customer.

import java.util.Scanner;

class Question08 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();
        double discount;

        if (amount <= 1000) {
            discount = amount * 10 / 100.0;
        } else if (amount <= 1500) {
            discount = amount * 12 / 100.0;
        } else {
            discount = amount * 15 / 100.0;
        }

        double netAmount = amount - discount;

        System.out.println("Sales Amount = Rs. " + amount);
        System.out.println("Discount = Rs. " + discount);
        System.out.println("Net Amount Payable = Rs. " + netAmount);
    }
}