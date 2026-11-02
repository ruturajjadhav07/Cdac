// 2. Write a program to find the transpose of a given matrix.

import java.util.Scanner;

class Question02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = sc.nextInt();

        System.out.print("Enter col: ");
        int col = sc.nextInt();

        int[][] array = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter value for " + i + " " + j + " ");
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix:");

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
