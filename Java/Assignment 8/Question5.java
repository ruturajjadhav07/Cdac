// 5. Write a program to count the number of strings in a list that start with a specific letter
// using streams.

import java.util.Arrays;
import java.util.List;

class Question5 {
    public static void main(String args[]) {
        List<String> strings = Arrays.asList("apple", "banana", "pineapple", "cherry", "tomato");
        char letter = 'a';

        long count = strings.stream()
                .filter(l -> l.startsWith(String.valueOf(letter)))
                .count();

        System.out.println("Number of strings starting with " + letter + ": " + count);
    }
}