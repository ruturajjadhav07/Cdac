
// 1. Write a program to extract a portion of an ArrayList.
import java.util.ArrayList;

class Question1 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Elements in list are =" + list);

        ArrayList<String> list2 = new ArrayList<>(list.subList(1, 3));
        System.out.println(list2);

    }
}