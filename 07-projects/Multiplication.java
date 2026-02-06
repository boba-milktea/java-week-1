/*
4. 🧮 Multiplication Table Generator
Concepts used: Loops, input/output.

Ask the user for a number.
Print its multiplication table (1–10) using a for loop.
* */

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNum;
        System.out.print("Please enter a number: ");

        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }
        userNum = scanner.nextInt();

       for (int i = 1 ; i <= userNum; i++) {
           for (int j = 1; j <= 10; j++) {
               System.out.println(i + "*" + j + "= " + i*j);
           }
       }

        scanner.close();
    }
}
