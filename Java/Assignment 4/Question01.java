// 1. Write an interface called Result with an abstract method checkStatus(int mark) that
// returns a boolean value. Write a class called Exam which implements both Result
// and Classify. The checkStatus() method should return true if the mark is greater than
// or equal to 50 else false. Write another interface called Classify with an abstract
// method checkGrade(int average) which returns a string. The checkGrade() method
// must return “First class” when the parameter average is 60 or more, “ Second class”
// when average is 50 or more but below 60, “Third class” when average is less than 50.
// Now create an object for Exam class and call their respective methods.

interface Result {
    boolean checkStatus(int marks);
}

interface Classify {
    String checkGrade(int average);
}

class Exam implements Result, Classify {

    @Override
    public boolean checkStatus(int marks) {
        return marks >= 50;
    }

    @Override
    public String checkGrade(int average) {
        if (average >= 60) {
            return "First class";
        } else if (average >= 50) {
            return "Second class";
        } else {
            return "Third class";
        }
    }
}

class Question01 {
    public static void main(String args[]) {
        Exam s1 = new Exam();

        System.out.println(s1.checkStatus(55));
        System.out.println(s1.checkGrade(60));
        System.out.println(s1.checkGrade(55));
        System.out.println(s1.checkGrade(40));
    }
}