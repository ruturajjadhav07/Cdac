// 8. Create a class Calculator with methods add(int, int) and multiply(int, int). Using
// Reflection API, locate and invoke these methods by passing appropriate arguments.
// Display the results.
// 8. Create a class Calculator with methods add(int, int) and multiply(int, int). Using
// Reflection API, locate and invoke these methods by passing appropriate arguments.
// Display the results.

import java.lang.reflect.*;

class Calculator {
    int a, b;

    int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }
}

class Question8 {
    public static void main(String[] args) throws Exception {
        Calculator c = new Calculator();

        Class<? extends Calculator> c1 = c.getClass();
        Method m1 = c1.getDeclaredMethod("add", int.class, int.class);
        Method m2 = c1.getDeclaredMethod("multiply", int.class, int.class);

        int result1 = (int) m1.invoke(c, 20, 20);
        int result2 = (int) m2.invoke(c, 90, 90);

        System.out.println("Addition: " + result1);
        System.out.println("Multiplication: " + result2);
    }
}