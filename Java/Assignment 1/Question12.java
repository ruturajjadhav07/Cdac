// 12. Admission to a professional course is subject to the following conditions:
// Marks in Maths > =60
// Marks in Physics > =50

// Marks in Chemistry >=40
// Total in all 3 subjects >=200
// Or
// Total in Mathematics and Physics > =150
// Given the marks in the 3 subjects , write a program to process the applications to list the eligible
// candidates

import java.util.Scanner;

class Question12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for maths: ");
        int math = sc.nextInt();

        System.out.print("Enter marks for physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks for chemistry: ");
        int chemistry = sc.nextInt();

        int totalThreeSubMarks = math + physics + chemistry;
        int totalMathPhysics = math + physics;

        if (math >= 60 && physics >= 50 && chemistry >= 40
                && (totalThreeSubMarks >= 200 || totalMathPhysics >= 150)) {
            System.out.println("Candidate is eligible for admission.");
        } else {
            System.out.println("Candidate is not eligible for admission.");
        }
    }
}