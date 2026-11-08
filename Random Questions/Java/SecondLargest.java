// Write a program to find the second largest element in an array without sorting it.
// Input: [12, 35, 1, 10, 34, 1]
// Output: 34

import java.util.Scanner;

class SecondLargest {

    public static int secondMax(int[] array) {

        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                secondLargest = max;
                max = array[i];
            } else if (array[i] > secondLargest && array[i] < max) {
                secondLargest = array[i];
            }
        }

        return secondLargest;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.print("Enter elements in array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("The second max element in array is: " + secondMax(array));

        sc.close();
    }
}
