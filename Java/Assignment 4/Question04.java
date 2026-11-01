// 4. Create a functional interface named Concatenation with one abstract method String
// join(String a, String b). Write a program to implement lambda expression to
// concatenate two strings

@FunctionalInterface
interface Concatenation {
    String join(String a, String b);
}

class Question04 {
    public static void main(String args[]) {
        Concatenation con = (a, b) -> {
            return a + b;
        };

        System.out.println(con.join("Ruturaj ", "Jadhav"));
    }
}