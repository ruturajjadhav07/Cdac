// 3. Create a functional interface named Verify with one abstract method boolean
// check(int a). Create a class which invokes the method using lambda expression
// where the method returns true if the number is prime and false otherwise

@FunctionalInterface
interface Verify {
    boolean check(int a);
}

class Question03 {
    public static void main(String[] args) {

        Verify v = (a) -> {

            if (a < 2) {
                return false;
            }

            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    return false;
                }
            }

            return true;
        };

        System.out.println(v.check(2));
        System.out.println(v.check(10));
        System.out.println(v.check(1));
    }
}