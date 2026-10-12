// 3. Write a program to find the maximum element in an array

import java.util.Scanner;

class Question03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter elements in array");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("The largest element in array is " + max);

        sc.close();
    }
}