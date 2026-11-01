// Create a class named EmployeeSample having the following data members:
// name
// age
// phoneno
// address
// salary
// It also has a method named printSalary() which prints the salary of the employee.
// Another class Manager inherits the Employee class. The Manager class have data
// member department. Using constructor assign name, age, phone number, address,
// salary and department to a manager by making an object of Manager class and print
// the salary

class Employee {
    String name, phoneNo, address;
    int age;
    double salary;

    Employee(String name, int age, String phoneNo, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.address = address;
        this.salary = salary;
    }

    void printSalary() {
        System.out.println("Salary of the Employee: " + salary);
    }
}

class Manager extends Employee {
    String department;

    // Constructor for Manager
    Manager(String name, int age, String phoneNo, String address, double salary, String department) {
        super(name, age, phoneNo, address, salary);
        this.department = department;
    }

    void displayManagerDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phoneNo);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
    }
}

class Question02 {
    public static void main(String args[]) {
        Manager manager = new Manager("Thomas", 22, "1234567890", "Kottayam", 45000, "Engineering");
        manager.displayManagerDetails();
        manager.printSalary();
    }
}