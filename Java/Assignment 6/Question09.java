// 9. Create an enum Size with four values: SMALL, MEDIUM, LARGE, and EXTRALARGE.
// Accept the pizza size from the user and display the selected size along with its ordinal
// value. Also, display all the available pizza sizes using the values() method.

import java.util.Scanner;

enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Question09 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pizza size (SMALL, MEDIUM, LARGE, EXTRALARGE): ");
        String input = scanner.nextLine().trim().toUpperCase();
        Size selectedSize = Size.valueOf(input);

        System.out.println("Selected size: " + selectedSize);
        System.out.println("Ordinal value: " + selectedSize.ordinal());

        System.out.println("Available pizza sizes:");
        for (Size size : Size.values()) {
            System.out.println(size);
        }

        scanner.close();
    }
}

// Not done by me