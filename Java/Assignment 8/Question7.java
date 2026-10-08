// 7. Create a class Student with private fields name and mark. Using Reflection API, access
// the private name field, assign a value to it, and display the value.

import java.lang.reflect.*;

class Student {
    private String name;
    int marks;

    Student(String n, int m) {
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("Name = " + name);
        System.out.println("Marks = " + marks);
    }
}

public class Question7 {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Sanchit", 89);
        Class c1 = s1.getClass();
        Field f = c1.getDeclaredField("name");
        f.setAccessible(true);
        f.set(s1, "Ruturaj");
        s1.display();
    }
}
