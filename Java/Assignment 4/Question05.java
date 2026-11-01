// 5. Write a program to create two child threads using Thread class, one to compute the
// first 25 prime numbers and the other to compute the first 50 fibonacci numbers. After
// calculating 25 fibonacci numbers, make that thread to sleep and take up prime number
// computation

class Child1 extends Thread {

    public void run() {
        int count = 0;
        int num = 2;

        System.out.println("First 25 Prime Numbers:");

        while (count < 25) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " ");
                count++;
            }

            num++;
        }

        System.out.println();
    }
}

class Child2 extends Thread {

    public void run() {
        int a = 0, b = 1;

        System.out.println("First 50 Fibonacci Numbers:");

        for (int i = 1; i <= 50; i++) {

            System.out.println(a + " ");

            int c = a + b;
            a = b;
            b = c;

            if (i == 25) {
                try {
                    System.out.println("\nFibonacci thread sleeping...");
                    Thread.sleep(2000);
                    System.out.println("Fibonacci thread resumed...");
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }

        System.out.println();
    }
}

class Question05 {
    public static void main(String args[]) {

        Child1 t1 = new Child1();
        Child2 t2 = new Child2();

        t1.start();
        t2.start();
    }
}

// Not by me