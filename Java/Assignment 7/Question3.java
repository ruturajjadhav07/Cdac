// 3. Create a class named Student with following members
// a. Data Members
// i. regno
// ii. name
// iii. marks
// b. Constructor to accept all values
// c. Method to print the values of data members
// Create another class named AddStudent which contains main method to create 5 Student
// objects and add it to an ArrayList and display the details of all the students using
// ListIterator.

import java.util.ArrayList;
import java.util.ListIterator;

class Student {
    int regno;
    String name;
    int marks;

    Student(int regno, String name, int marks) {
        this.regno = regno;
        this.name = name;
        this.marks = marks;
    }

    public void printDetails() {
        System.out.println("RegNo: " + regno);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class Question3 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Sanchit", 90));
        students.add(new Student(102, "Thomas", 85));
        students.add(new Student(103, "Ajinkya", 88));
        students.add(new Student(104, "Jeeva", 92));
        students.add(new Student(105, "Athul", 80));

        ListIterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            student.printDetails();
        }
    }
}
