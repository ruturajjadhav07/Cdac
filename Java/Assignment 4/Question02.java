// 2. Create one interface named Sample which contains a variable named x, one abstract
// method square() to find the square of the number, a default method cube() to find the
// cube of the number and a static method meth1() to print the value of the variable.
// Write the implementing class SampleMain and invoke the static method using
// interface reference and invoke the other two methods using class object

interface Sample {
    int x = 5;

    int square(int x);

    default int cube(int x) {
        return x * x * x;
    }

    static void meth1() {
        System.out.println("The value of x is " + x);
    }
}

class SampleMain implements Sample {

    @Override
    public int square(int x) {
        return x * x;
    }

}

class Question02 {
    public static void main(String args[]) {
        Sample.meth1();
        SampleMain obj = new SampleMain();

        int squareResult = obj.square(4);
        int cubeResult = obj.cube(3);
        
        System.out.println("Square is " + squareResult);
        System.out.println("Cube is " + cubeResult);
    }
}