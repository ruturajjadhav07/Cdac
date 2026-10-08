// 16. Write a program to find the power of m raised to n.

import java.util.Scanner;

class Question16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m value: ");
        int m = sc.nextInt();
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int pow = 1;
        for (int i = 1; i <= n; i++) {
            pow *= m;
        }

        System.out.println(pow);
    }
}