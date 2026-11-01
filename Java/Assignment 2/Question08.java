// 8. Define a class Student with data members rollno, name, mark1, mark2, mark3, total, avg.
// Use appropriate methods for entering the details and displaying the details. Also define a
// method for calculating the total mark and average. Create an object for the class and
// invoke all the methods.

import java.util.Scanner;

class Student {
    int rollno;
    String name;
    int mark1, mark2, mark3;
    int total;
    double average;

    Scanner sc = new Scanner(System.in);

    void getDetails() {
        System.out.print("Enter Roll Number: ");
        rollno = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Mark 1: ");
        mark1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        mark2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        mark3 = sc.nextInt();
    }

    void calculate() {
        total = mark1 + mark2 + mark3;
        average = total / 3.0;
    }

    void display() {
        System.out.println("\nStudent Details");
        System.out.println("Roll Number: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

class Question08 {
    public static void main(String args[]) {
        Student s = new Student();

        s.getDetails();
        s.calculate();
        s.display();
    }
}