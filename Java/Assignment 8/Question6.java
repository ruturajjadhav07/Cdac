// 6. Create a list of strings and use streams to:
//  Convert all strings to uppercase.
//  Remove duplicate strings.
//  Sort the strings alphabetically.
//  Display the resulting stream.

import java.util.ArrayList;

class Question6 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("tanaya");
        list.add("aniruddha");
        list.add("shamit");
        list.add("tanvi");
        list.add("elizabeth");
        list.add("komal");
        list.add("parth");
        list.add("parth");

        list.stream()
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}