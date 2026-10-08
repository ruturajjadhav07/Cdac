// 4. Create a TreeSet and add some Integer objects to it. Create another TreeSet and copy only
// those elements from first TreeSet to the second which are greater than or equal to a
// specified value given as input. Display the second TreeSet values as output using Iterator.

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

class Question4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();

        set1.add(1);
        set1.add(6);
        set1.add(9);
        set1.add(13);
        set1.add(21);
        set1.add(17);
        System.out.println("Elmenets in set1 are " + set1);

        System.out.print("Enter the number so you can get bigger values than it: ");
        int num = sc.nextInt();

        for (int i : set1) {
            if (i >= num) {
                set2.add(i);
            }
        }

        System.out.print("Elements in set2 are ");
        Iterator<Integer> iterator = set2.iterator();
        while (iterator.hasNext()) {
            Integer set = iterator.next();
            System.out.print(set + " ");
        }
    }
}