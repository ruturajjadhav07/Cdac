// 6. Write a Java program to create two child threads using Runnable interface, one to find
// the sum of natural numbers from 1 to n and the other to display the factorial of the
// numbers upto n.

import java.util.Scanner;

class Child1 implements Runnable {

    int n;

    Child1(int n) {
        this.n = n;
    }

    public void run() {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}

class Child2 implements Runnable {

    int n;

    Child2(int n) {
        this.n = n;
    }

    public void run() {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;

            System.out.println("Factorial of " + i + " is: " + fact);
        }
    }
}

class Question06 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        Child1 c1 = new Child1(n);
        Child2 c2 = new Child2(n);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}
