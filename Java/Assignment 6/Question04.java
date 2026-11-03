// 4. Accept the given text as input. Replace all occurrences of “you” by “they” and display the
// resultant string.
// “You are not happy because you are well. You are well because you are happy. You are
// not depressed because trouble has come, but trouble has come because you are depressed."

class Question04 {
    public static void main(String args[]) {
        String str = "You are not happy because you are well. You are well because you are happy. You are not depressed because trouble has come, but trouble has come because you are depressed.";

        str = str.replace("You", "They").replace("you", "they");
        System.out.println(str);
    }
}
