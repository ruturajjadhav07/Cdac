// 6. Input a long sentence. Find out the frequency of each word in the block and display the list
// of words and its frequency using HashMap.

import java.util.HashMap;
import java.util.Scanner;

class Question6 {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] strsplit = str.split(" ");

        for (String word : strsplit) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (String word : map.keySet()) {
            System.out.println(word + ": " + map.get(word));
        }
    }
}