// 10. Build a class Emp which contain the following details about the employee and make an
// object in the main method and call the methods to set values and print values of the
// object.
// a. Data Members
// i. int empCode
// ii. String name
// iii. int basicPay
// iv. float DA
// v. float HRA
// vi. float grossPay
// b. Methods
// i. to accept and set values for empCode, name, and basicPay
// ii. to calculate grossPay
// iii. to print all the values of the employee object
// If basicPay < 3500 then DA is 45% of basicPay and HRA is 20% of basicPay.
// If basicPay >=3500, then DA = 50% of basicPay and HRA is Rs 1000.
// Find and print the grossPay = basicPay +DA+HRA

class Emp {
    int empCode;
    String name;
    int basicPay;
    float DA;
    float HRA;
    float grossPay;

    void setValues(int code, String n, int pay) {
        empCode = code;
        name = n;
        basicPay = pay;
    }

    void calculateGrossPay() {
        if (basicPay < 3500) {
            DA = basicPay * 45 / 100.0f;
            HRA = basicPay * 20 / 100.0f;
        } else {
            DA = basicPay * 50 / 100.0f;
            HRA = 1000;
        }

        grossPay = basicPay + DA + HRA;
    }

    void printValues() {
        System.out.println("Employee Code: " + empCode);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("Gross Pay: " + grossPay);
    }
}

class Question10 {
    public static void main(String args[]) {
        Emp obj = new Emp();

        obj.setValues(101, "Rahul", 3000);
        obj.calculateGrossPay();
        obj.printValues();
    }
}