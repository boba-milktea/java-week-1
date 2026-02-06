import java.util.Scanner;

/**
 * Loops Exercises
 * -------------------------------------------------------------
 * 1- For Loop
 * 2- While Loop
 * 3- Do-While Loop
 * 4- For-Each Loop
 * 5- Nested Loops
 * 6- Break and Continue Statements
 *
 * Each exercise is designed to help students practice loops.
 */

public class LoopsExercise
{
    public static void main(String[] args)
    {
        // -------------------- 1. For Loop --------------------
        // Exercise 1:
        // - Create a for loop to print numbers from 10 to 1 (reverse order).
        System.out.println("========== Exercise 1 ===================");
        for (int num = 10; num > 0; num--) {
            System.out.print(num + " ");
        }

        // Exercise 2:
        // - Use a for loop to print the multiplication table of 7 (1 to 10).
//        System.out.println("\n========== Exercise 2 ===================");
//        for (int n = 1; n <= 10; n++) {
//            System.out.println(n + " * 7" + " = " + n * 7);
//        }

        // -------------------- 2. While Loop --------------------
        // Exercise 3:
        // - Create a while loop to sum numbers from 1 to 100 and print the total.
//        System.out.println("\n========== Exercise 3 ===================");
//        int i = 1;
//        int total = 0;
//        while (i <= 100) {
//            total += i;
//            i ++;
//        }
//        System.out.println("Total is: " + total);

        // Exercise 4:
        // - Use a while loop to print all odd numbers between 1 and 20.
//        System.out.println("\n========== Exercise 4 ===================");
//        int j = 1;
//        while ( j <= 20 ) {
//            if ( j % 2 != 0 ) {
//                System.out.print(j + " ");
//            }
//            j ++;
//        }


        // -------------------- 3. Do-While Loop --------------------
        // Exercise 5:
        // - Create a do-while loop that asks the user to enter a number (simulate with a variable)
        //   and repeats until the number is negative.
        System.out.println("\n========== Exercise 5 ===================");


        Scanner scanner = new Scanner(System.in);

//        int number = 0;
//        while (true) {
//            System.out.print("Please enter a positive number ");
//            if (scanner.hasNextInt()) {
//                number = scanner.nextInt();
//
//                if ( number > 0 ) {
//                  break;
//                } else {
//                    System.out.println("The number must be positive.");
//                }
//
//            } else {
//                System.out.println("It's not a valid number.");
//                scanner.next();
//            }
//        }
//        System.out.println("You entered: " + number);



        // -------------------- 4. For-Each Loop --------------------
        // Exercise 6:
        // - Create an array of colors: {"Red", "Green", "Blue", "Yellow"}.
        //   Use a for-each loop to print each color in uppercase.
        System.out.println("\n========== Exercise 6 ===================");


        String[] colors = { "Red", "Green", "Blue", "Yello" } ;
        for (String color : colors) {
            System.out.println(color.toUpperCase());
        }

        // Exercise 7:
        // - Create an int array {2, 4, 6, 8, 10} and use for-each to calculate the sum.
        System.out.println("\n========== Exercise 7 ===================");
        int[] arr = {2, 4, 6, 8, 10};
        int totalInt = 0;
        for (int num : arr ) {
            System.out.println("Total of the int array is: " + (totalInt += num) );
        }

        // -------------------- 5. Nested Loops --------------------
        // Exercise 8:
        // - Use nested loops to print a 3x3 multiplication table (1*1 to 3*3).
        System.out.println("\n========== Exercise 8 ===================");
        int firstNum = 0;
        int secondNum = 0;

        System.out.print("Please Enter the first number: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid first number: ");
            scanner.next();
        }
        firstNum = scanner.nextInt();

        System.out.print("Please Enter the second number: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid second number: ");
            scanner.next();
        }
        secondNum = scanner.nextInt();


        for (int m = 1; m <= firstNum; m++) {
            for (int n = 1; n <= secondNum ; n++) {
                System.out.println(m + "*" + n);
            }
        }
        // Exercise 9:
        // - Use nested loops to print the following pattern:
        //   *
        //   **
        //   ***
        //   ****
        System.out.println("\n========== Exercise 9 ===================");

        System.out.print("Please choose from the signs - *, $, £: ");
        char sign = scanner.next().charAt(0);

        while (sign != '*' && sign != '$' && sign != '£') {
            System.out.print("Please use a special sign: ");
            scanner.next().charAt(0);
        }

        for (int a = 1; a <= 4 ; a++) {
            for (int b = 1; b <= a ; b++) {
                System.out.print(sign);
            }
            System.out.println();
        }

        // -------------------- 6. Break and Continue --------------------
        // Exercise 10:
        // - Create a for loop from 1 to 20.
        //   - Skip multiples of 3 using continue.
        //   - Stop the loop if the number is greater than 15 using break.
        System.out.println("\n========== Exercise 10 ===================");


        for (int num = 1; num <= 20 ; num++) {
            if (num % 3 == 0) {
                System.out.println("Skip at: " + num);
                continue;
            }
            if (num > 15) {
                System.out.println("Stop at: " + num);
                break;
            }
            System.out.println("Current number: " + num);
        }

        // Exercise 11:
        // - Use a while loop to print numbers 1 to 10, but stop when a number divisible by 7 is reached.
        System.out.println("\n========== Exercise 11 ===================");
        int anotherNum = 1;

        while (anotherNum < 10) {
            System.out.println(anotherNum);
            if (anotherNum % 7 == 0) break;
            anotherNum++;
        }
    }
}
