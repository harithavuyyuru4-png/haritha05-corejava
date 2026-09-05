package Logicalstatements;

import java.util.Scanner;

public class Ifelse {

    // Method to return grade
    static String gradeInfo(double marksp) {

        if (marksp > 100 || marksp < 0) {
            return "Invalid marks percentage";
        } else if (marksp >= 90) {
            return "Excellent - A";
        } else if (marksp >= 80) {
            return "Good - B";
        } else if (marksp >= 70) {
            return "Average - C";
        } else if (marksp >= 60) {
            return "OK - D";
        } else if (marksp >= 35) {
            return "Passed";
        } else {
            return "Failed - F";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks percentage: ");
        double marksp = sc.nextDouble();

        String grade = gradeInfo(marksp);

        System.out.println("Student grade based on marks percentage: " + grade);

        sc.close();
    }
}