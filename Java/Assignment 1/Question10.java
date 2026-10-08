// 10. Write a program using switch case to enter an operator(+,-,*,/) as a character and 2
// numbers.Do the operation and print the result

import java.util.Scanner;

class Question10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter operator like + - * / for calculations ");
        String ops = sc.next();
        char ch = ops.charAt(0);

        switch (ch) {
            case '+':
                System.out.println(num1 + num2);
                break;

            case '-':
                System.out.println(num1 - num2);
                break;

            case '*':
                System.out.println(num1 * num2);
                break;

            case '/':
                System.out.println(num1 / num2);
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}