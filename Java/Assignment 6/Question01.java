// 1. Create a string with value “Software Training and Development Centre” and do the
// following:
// a) Display its length.
// b) Check whether the string ends with “Centre” or not.
// c) Extract characters from position 9 to 16. 

class Question01 {
    public static void main(String args[]) {
        String str = "Software Training and Development Centre";

        // a) Display length
        System.out.println(str.length());

        // b) Checks where the string ends with Centre or not
        System.out.println(str.endsWith("Centre"));

        // c) Extract character from position 9 to 16
        String extractString = str.substring(9, 16);
        System.out.println(extractString);
    }
}