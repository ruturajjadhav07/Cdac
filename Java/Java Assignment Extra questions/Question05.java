// 5. A class of n students take an annual examination in m subjects. Write a program to
// read the marks obtained by each student in various subjects and to compute and print
// the total marks obtained by each of them.

import java.util.Scanner;

class Question05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = input.nextInt();

        System.out.print("Enter the number of subjects: ");
        int subjects = input.nextInt();

        for (int student = 1; student <= students; student++) {
            long total = 0;

            System.out.println("Enter marks for student " + student + ":");

            for (int subject = 1; subject <= subjects; subject++) {
                total = total + input.nextInt();
            }

            System.out.println("Total marks of student " + student + " = " + total);
        }

        input.close();
    }
}

// This is not done by me