// 4. Write a class called Square with instance variable a and a method double area() that
// finds the area(a2) of the square. Create a class Cube which is a subclass of Square and
// write an overriding method double area() that finds the surface area (6a2) of the cube
// using super keyword. In the main function, invoke the function using the two class
// instances.

class Square {
    int a;

    double area() {
        return a * a;
    }
}

class Cube extends Square {
    double area() {
        return 6 * super.area();
    }
}

class Question04 {
    public static void main(String args[]) {
        Square mySquare = new Square();
        mySquare.a = 5;
        System.out.println("Area of the Square " + mySquare.area());

        Cube myCube = new Cube();
        myCube.a = 5;
        System.out.println("Surface Area of the Cube " + myCube.area());
    }
}
