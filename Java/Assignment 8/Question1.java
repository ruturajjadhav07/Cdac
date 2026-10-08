// 1. Write a program to display the dates 10 days before and after today.

import java.time.LocalDate;

class Question1 {
    public static void main(String args[]) {
        LocalDate date = LocalDate.now();
        System.out.println("Current date: " + date);
        System.out.println("Date before 10 days" + date.minusDays(10));
        System.out.println("Date after 10 days" + date.plusDays(10));
    }
}