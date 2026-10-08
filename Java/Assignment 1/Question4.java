// 4. Write a program that averages the rain fall for three months, April, May, and June. Declare
// and initialize a variable to the rain fall for each month with values given below. Compute
// the average, and write out the results, in the following format:
// Rainfall for April : 12
// Rainfall for May : 14
// Rainfall for June : 8
// Average rainfall : 11.333333

class Question4 {
    public static void main(String args[]) {

        int april = 12;
        int may = 14;
        int june = 8;

        double average = (april + may + june) / 3.0;

        System.out.println("Rainfall for April : " + april);
        System.out.println("Rainfall for May : " + may);
        System.out.println("Rainfall for June : " + june);
        System.out.println("Average rainfall : " + average);
    }
}