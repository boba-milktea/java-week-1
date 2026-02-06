/**
 * Exercises:
 * ----------------------------------------------------------------
 * 1. Create a short variable with any value and assign it to an int (implicit).
 * 2. Create an int variable with a large value and assign it to a long (implicit).
 * 3. Create a long variable and assign it to a float (implicit).
 *
 * 4. Create a double variable and cast it to a float (explicit).
 * 5. Create an int variable and cast it to a short (explicit).
 * 6. Create a long variable and cast it to a byte (explicit).
 *
 * Bonus:
 * 7. Try converting a large int (e.g., 1000) to a byte and observe what happens (overflow).
 * 8. Convert a char (e.g., 'Z') into an int and print its ASCII value.
 * 9. Convert an int into a char and print the resulting character.
 * 10. Create a double with decimals, convert it to int, and explain what happens.
 * ----------------------------------------------------------------
 */

public class ConversionE
{
    public static void main(String[] args)
    {
        // --- Implicit Conversions (Widening) ---
        int intValue = 100;
        double widenedDouble = intValue; // int to double
        char letter = 'A';
        int widenedInt = letter;         // char to int (ASCII/Unicode value)

        System.out.println("=== Implicit (Widening) Conversions ===");
        System.out.println("int (" + intValue + ") → double: " + widenedDouble);
        System.out.println("char ('" + letter + "') → int: " + widenedInt);

        // --- Explicit Conversions (Narrowing) ---
        double doubleValue = 9.78;
        int narrowedInt = (int) doubleValue; // double to int (fraction lost)
        float floatValue = 130.75f;
        byte narrowedByte = (byte) floatValue; // float to byte (overflow possible)

        System.out.println("\n=== Explicit (Narrowing) Conversions ===");
        System.out.println("double (" + doubleValue + ") → int: " + narrowedInt);
        System.out.println("float (" + floatValue + ") → byte: " + narrowedByte);

        // -------------------- Student Exercises --------------------
        // 1. Create a short variable with any value and assign it to an int (implicit)
        short shortValue = 34;
        int intedShort = shortValue;

        // 2. Create an int variable with a large value and assign it to a long (implicit)
        int intValue2 = 3;
        long longedInt = intValue2;

        // 3. Create a long variable and assign it to a float (implicit)
        long longValue = 23883389L;
        float floatedValue = longValue;

        // 4. Create a double variable and cast it to a float (explicit)
        double doubleValue2 = 34.938405;
        float floatedDouble = (float) doubleValue2;

        // 5. Create an int variable and cast it to a short (explicit)
        int intValue3 = 344;
        short shortedInt = (short) intValue3;

        // 6. Create a long variable and cast it to a byte (explicit)
        long longValue2 = 32843040;
        byte bytedLong = (byte) longValue2;

        System.out.println("\n=== Student ====");
        // 7. Try converting a large int (e.g., 1000) to a byte and print the result
        int largeInt = 9300;
        byte bytedLargedInt = (byte) largeInt;
        System.out.println("int (" + largeInt + ") is converted to byte: " + bytedLargedInt);

        // 8. Convert a char (e.g., 'Z') into an int and print its ASCII value
        char char2 = 'I';
        int intChar2 = char2;
        System.out.println("char (" + char2 + ") - is converted to int: " + intChar2 );

        // 9. Convert an int into a char and print the resulting character
        int intValue4 = 198;
        char charedIntValue = (char)intValue4;
        System.out.println("int (" + intValue4 + ") - is converted to char: " + charedIntValue );


        // 10. Create a double with decimals, convert it to int, and print the result
        double doubleValue3 = 23.44;
        int intedDoubleValue3 = (int) doubleValue3;
        System.out.println("double (" + doubleValue3 + ") - is converted to int: " + intedDoubleValue3 );
    }
}
