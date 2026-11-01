// 1. Create a class Student with rollno, name, age and totalmark as instance variables
// and methods get(), disp(), findgrade(). If total mark is greater than 900 grade A,
// greater than 700 grade B, greater than 500 grade C else failed. Create a subclass
// ProjectStudent from the Student class with the data members projid, projtitle,
// company, projgrade with methods getPDetails(), dispPDetails(). Create instance of
// Project Student and invoke all the methods in main.
// (Do the program without using constructors)

class Student {
    int rollNo, age;
    String name;
    double totalmarks;

    void get(int roll, String n, int a, double totalM) {
        rollNo = roll;
        name = n;
        age = a;
        totalmarks = totalM;
    }

    void disp() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Total Marks: " + totalmarks);
    }

    void findgrade() {
        if (totalmarks > 900) {
            System.out.println("Grade: A");
        } else if (totalmarks > 700) {
            System.out.println("Grade: B");
        } else if (totalmarks > 500) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Failed");
        }
    }
}

class ProjectStudent extends Student {
    int projid;
    String projtitle;
    String company;
    char projgrade;

    void getPDetails(int pId, String pTitle, String comp, char pGrade) {
        projid = pId;
        projtitle = pTitle;
        company = comp;
        projgrade = pGrade;
    }

    void dispPDetails() {
        System.out.println("Project ID: " + projid);
        System.out.println("Project Title: " + projtitle);
        System.out.println("Company: " + company);
        System.out.println("Project Grade: " + projgrade);
    }
}

class Question01 {
    public static void main(String args[]) {
        ProjectStudent student = new ProjectStudent();

        student.get(101, "Rutu", 21, 925.5);
        student.disp();
        student.findgrade();

        System.out.println();   

        student.getPDetails(5001, "AI Automation", "Tech", 'A');
        student.dispPDetails();
    }
}