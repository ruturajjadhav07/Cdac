// 7. Create a child thread to print Right Triangle star pattern using Lambda expression

import java.util.Scanner;

class Question07 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        Runnable r = () -> {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        };

        Thread t = new Thread(r);
        t.start();
    }
}
