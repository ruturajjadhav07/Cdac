// 4. Write a class with a static method that returns the maximum value of three given
// integers. Write another class with main method and call the static method to print the
// maximum value for a set of integer values

class Maximum {

    public static int max(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
    }
}

class Question04 {
    public static void main(String args[]) {
        int result = Maximum.max(10, 25, 15);
        System.out.println("Maximum value = " + result);
    }
}
