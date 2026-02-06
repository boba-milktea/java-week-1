/**
 * 5. 🎓 Student Grade Calculator
 * Concepts used: Arrays, loops, input/output, conditionals.
 *
 * Ask the user for the number of subjects.
 * Read marks for each subject into an array.
 * Calculate the total and average.
 * Use if-else to assign a grade:
 * A for average ≥ 80
 * B for 60–79
 * C for 40–59
 * F for below 40
 */

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of the subjects: ");

        int subjectNum = 0;

        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }
        subjectNum = scanner.nextInt();

        int[] grades = new int[subjectNum];
        int totalMarks = 0;

        for (int i = 0 ; i < subjectNum ; i++ ) {
            System.out.print("Enter the mark of the subject " + (i+1) + " " );

            while(!scanner.hasNextInt()) {
                System.out.print("Please enter a valid mark: ");
                scanner.next();
            }
            grades[i] = scanner.nextInt();
            totalMarks += grades[i];
        }

        int average = totalMarks / subjectNum;

        System.out.println(average);
        char result;

       if (average >= 80) {
           result = 'A';
       } else if (average > 60) {
           result = 'B';
       } else if (average > 40) {
           result = 'C';
       } else {
           result = 'F';
       }

        System.out.println("The result is: " + result);
       scanner.close();
    }
}
