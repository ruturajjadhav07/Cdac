
// 4. Write a program to search for an element in an array
import java.util.Scanner;

class Question04 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];

        boolean isFound = false;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int ele = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ele) {
                isFound = true;
            }
        }

        if (isFound) {
            System.out.println("Element is present in array");
        } else {
            System.out.println("Element is not present in array");
        }

    }
}
