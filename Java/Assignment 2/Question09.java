import java.util.Scanner;

class Rectangle {
    int length, breadth;

    void enterDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = sc.nextInt();

        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
    }

    void displayDetails() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }

    int area() {
        return length * breadth;
    }

    int perimeter() {
        return 2 * (length + breadth);
    }
}

class Question09 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();

        obj.enterDetails();
        obj.displayDetails();

        System.out.println("Area of rectangle is " + obj.area());
        System.out.println("Perimeter of rectangle is " + obj.perimeter());
    }
}