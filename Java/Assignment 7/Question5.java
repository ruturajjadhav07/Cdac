// 5. Create a TreeMap and add some entries to it. Display the map contents using Iterator.
// Check whether a particular key exists in the map or not. If it is present, display its value.

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Question5 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Ruturaj");
        map.put(2, "Thomas");
        map.put(3, "Sanchit");
        map.put(4, "Athul");
        map.put(5, "Ajinkya");

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();

        System.out.println("Map elements: ");
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key to check: ");
        int key = sc.nextInt();
        if (map.containsKey(key)) {
            System.out.println("Value for key " + key + " is " + map.get(key));
        } else {
            System.out.println("Key " + key + " does not exist in the map.");
        }
    }
}