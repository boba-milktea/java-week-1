/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create two new int variables (x and y) with any values.
 * 2. Perform addition, subtraction, multiplication, division,
 *    and modulus using x and y. Print the results.
 *
 * 3. Try division with values that don’t divide evenly
 *    (e.g., 7 / 2) and observe the result.
 * 4. Use double variables for division and compare the
 *    difference between int division and double division.
 * 5. Create three int variables, add them together,
 *    and print the total.
 *
 * Bonus:
 * 6. Calculate the square of a number using multiplication.
 * 7. Calculate the average of three numbers using division.
 * 8. Explore what happens if you divide a number by 0
 *    (hint: try int vs double).
 * -------------------------------------------------------------
 */

public class ArithmeticE
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 3;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum); // Output: Sum: 13

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference); // Output: Difference: 7

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product); // Output: Product: 30

        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient); // Output: Quotient: 3

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder); // Output: Remainder: 1


        // -------------------- Student Exercises --------------------
        // 1. Create two int variables x and y, then perform all arithmetic operations.
        int x = 2;
        int y = 5;

        // 2. Try division with numbers that don’t divide evenly (e.g., 7 / 2).
        int divisionInt = y / x;
        System.out.println("Division with int numbers " + divisionInt);

        // 3. Use double variables for division and compare with int division.
        double m = x;
        double n = y;
        double divisionDouble =   n/ m;
        System.out.println("Division with int doubles " + divisionDouble);


        // 4. Create three int variables, add them, and print the total.
        int num1 = 3;
        int num2 = 5;
        int num3 = 93;
        int total = num1 + num2 + num3;

        System.out.println("total of num1, num2 & num3 " + total);


        // 5. Calculate the square of a number (e.g., 6 * 6).
        int squareNum = (int) Math.pow(num2, 2);
        System.out.println("The square of Num2 " + squareNum);

        // 6. Calculate the average of three numbers.
        float average = (float) (total) / 3 ;
        System.out.println("The average of the three numbers " + average);

        // 7. Try dividing a number by 0 (both int and double) and observe the behavior.
        int zero = 0;
        int divisionInt2 = x / zero;
        System.out.println("Dividing an int by 0" + divisionInt2);
        double divisionDouble2 = m / zero;
        System.out.println("Dividing an double by 0" + divisionDouble2);
    }
}
