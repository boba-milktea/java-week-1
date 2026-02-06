/*
3. 📅 Day of the Week Finder
Concepts used: Switch statement, input/output.

Ask the user to enter a number (1–7).
Use a switch to print the day of the week (1 = Monday, … 7 = Sunday).
Handle invalid input gracefully.
* */

import java.util.Scanner;

public class weekFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNum;
        System.out.print("Please enter a number: ");

        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }
        userNum = scanner.nextInt();

        String dayName = switch (userNum) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default ->  "Holi";
        };

        System.out.println("Have a good " + dayName + " day");

        scanner.close();
    }
}
