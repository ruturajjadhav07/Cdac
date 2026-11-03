// 5. Write a program to arrange a given set of names in alphabetical order.
import java.util.Arrays;
import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many names do you want to enter? ");
        int count = Integer.parseInt(scanner.nextLine().trim());
        if (count < 0) {
            System.out.println("The number of names cannot be negative.");
            scanner.close();
            return;
        }

        String[] names = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine().trim();
        }

        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);

        System.out.println("Names in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}

// NOt done by me