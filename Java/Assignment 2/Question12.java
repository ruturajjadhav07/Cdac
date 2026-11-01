// 12. Write a Java program to overload an add function that can add integer, float or double values and display the sum

class Sum {

    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("Addition of integers is: " + sum);
    }

    public void add(float a, float b) {
        float sum = a + b;
        System.out.println("Addition of floats is: " + sum);
    }

    public void add(double a, double b) {
        double sum = a + b;
        System.out.println("Addition of doubles is: " + sum);
    }
}

class Question12 {
    public static void main(String args[]) {

        Sum obj = new Sum();

        obj.add(10, 20);
        obj.add(10.5f, 20.5f);
        obj.add(10.5, 20.5);
    }
}