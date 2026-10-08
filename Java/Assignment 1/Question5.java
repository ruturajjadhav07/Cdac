// 5. Write a program to calculate the perimeter of a rectangle (P = 2(l + w))

import java.util.Scanner;

class Question5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter width: ");
        int width = sc.nextInt();

        int perimeter = 2 * (length + width);
        System.out.println("The perimeter of triangle is " + perimeter);
    }
}