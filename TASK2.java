
// student grade calculator

import java.util.*;
public class TASK2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int number_of_subjects = sc.nextInt();

        int marks[] = new int [number_of_subjects];
        int total_marks = 0;


        for (int i = 0; i < number_of_subjects; i++) {
            System.out.println("Enter the marks of subject " + (i + 1) +":");
            marks[i] = sc.nextInt();
            total_marks += marks[i];
        }
        double average_marks = ( double )total_marks / number_of_subjects;

        String grade;
        if (average_marks >= 90) {
            grade = "A+";
        }
        else if (average_marks >= 80) {
            grade = "A";
        }
        else if (average_marks >= 70) {
            grade = "B+";
        }
        else if (average_marks >= 60) {
            grade = "B";
        }
        else if (average_marks >= 50) {
            grade = "C+";
        }
        else {
            grade = "F";
        }
        System.out.println("\nResult");
        System.out.println("total_marks: " + total_marks);
        System.out.println(" corresponding grade: " + grade);
        System.out.println("average_marks: " + average_marks);

    }
}
