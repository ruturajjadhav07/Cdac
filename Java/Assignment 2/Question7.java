// 7. Create a class Employee with members empid, empname, designation, salary. Also define
// two methods to enter the details and display the details. Create an object and invoke the
// methods.\

class Employee {
    int empid;
    String empname;
    String designation;
    double salary;

    public void display() {
        System.out.println("Id: " + empid);
        System.out.println("Name: " + empname);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

class Question7 {
    public static void main(String args[]) {
        Employee emp = new Employee();
        emp.empid = 1;
        emp.empname = "Ruturaj";
        emp.designation = "Software Developer";
        emp.salary = 30000;

        emp.display();
    }
}