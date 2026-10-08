// 2. Write a program to update a specific element in an ArrayList by a given element and
// remove the last element from the ArrayList and print it.

import java.util.ArrayList;

class Question2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Elements in list are =" + list);
        list.add(2, "F");
        System.out.println("After updating list it is =" + list);
        list.removeLast();
        System.out.println("Final list =" + list);
    }
}