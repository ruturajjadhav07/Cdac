
// 6. Write a program to read and print the elements of a 2 dimensional array
import java.util.Scanner;

class Question06 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size for a: ");
        int a = sc.nextInt();
        System.out.print("Enter size for b: ");
        int b = sc.nextInt();

        int[][] array = new int[a][b];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("2 dimensional array");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}