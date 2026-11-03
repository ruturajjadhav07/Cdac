// 6. Write a program that reads a user’s username & password as input. Check the username &
// password valid as per the following conditions.
// a) Username should be minimum 8 characters long. It should not start with a number.
// White spaces are not allowed.
// b) Password should have at least one small case letter, one capital case letter & one
// number. It should be minimum 8 characters long

import java.util.Scanner;

class Question06 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            System.out.println("Username is " + (checkUsername(username) ? "valid" : "invalid"));
            System.out.println("Password is " + (checkPassword(password) ? "valid" : "invalid"));
        }
    }

    private static boolean checkUsername(String username) {
        if (username.length() < 8 || Character.isDigit(username.charAt(0))) {
            return false;
        }
        return username.chars().noneMatch(Character::isWhitespace);
    }

    private static boolean checkPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasNumber = false;
        for (char character : password.toCharArray()) {
            hasLowercase |= Character.isLowerCase(character);
            hasUppercase |= Character.isUpperCase(character);
            hasNumber |= Character.isDigit(character);
        }
        return hasLowercase && hasUppercase && hasNumber;
    }
}

// It is improved version of my code