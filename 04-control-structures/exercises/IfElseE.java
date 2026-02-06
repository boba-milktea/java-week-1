/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create an int variable x and check if it is even or odd using if-else.
 *
 * 2. Create an int variable age.
 *    - If age >= 18, print "Adult".
 *    - Else, print "Minor".
 *
 * 3. Create an int variable score (0-100).
 *    - Use if-else to assign grades:
 *      >=90 -> "A"
 *      >=75 -> "B"
 *      >=50 -> "C"
 *      <50  -> "F"
 *
 * 4. Create a double variable temperature.
 *    - If temperature > 30, print "Hot".
 *    - Else if temperature >= 20, print "Warm".
 *    - Else, print "Cold".
 *
 * Bonus:
 * 5. Combine two conditions using logical operators:
 *    - Check if a number n is positive **and** even.
 * -------------------------------------------------------------
 */

public class IfElseE
{
    public static void main(String[] args)
    {
        int number = 10;

        if (number > 0)
        {
            System.out.println("The number is positive.");
        }
        else if (number < 0)
        {
            System.out.println("The number is negative.");
        }
        else
        {
            System.out.println("The number is zero.");
        }

        // -------------------- Student Exercises --------------------
        // 1. Check if x is even or odd.
        int x = 4;
        if ( x % 2 == 0 ) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        // 2. Check age and print "Adult" or "Minor".
        int age = 78;

        if ( age >= 18 ) {
            System.out.println("The person is an Adult.");
        } else {
            System.out.println("The person is a Minor.");
        }

        // 3. Assign grades based on score using if-else if-else.
        int score = 77;

        if ( score >= 90 ) {
            System.out.println("A");
        } else if ( score >= 75 ) {
            System.out.println("B");
        } else if ( score >= 50 ) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }

        // 4. Check temperature and print "Hot", "Warm", or "Cold".
        double temperature = -20;

        if ( temperature > 30 ) {
            System.out.println("Hot");
        } else if ( temperature >= 20 ) {
            System.out.println("Warm");
        } else {
            System.out.println("Cold");
        }

        // 5. Check if n is positive AND even using logical operators.
        int n = -71;

        if ( n > 0 ) {
            if ( n % 2 == 0 ) {
                System.out.println("It's positive and even number.");
            }
            if ( n % 2 != 0 ) {
                System.out.println("It's a positive and odd number.");
            }
        }
        else if ( n < 0 ) {
            if ( n % 2 == 0 ) {
                System.out.println("It's a negative and even number.");
            } else if ( n % 2 != 0 ) {
                System.out.println("It's a negative and odd number.");
            }
        } else {
            System.out.println("It's a zero and it's even.");
        }

    }
}
