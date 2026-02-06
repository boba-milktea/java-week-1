/**
 * 6. 🔁 Palindrome Checker
 * Concepts used: Strings, loops, conditionals.
 *
 * Ask the user to enter a word.
 * Check if it reads the same forward and backward.
 * Print whether it’s a palindrome.
 */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a word: ");

        while (!scanner.hasNext()) {
            System.out.println("Please enter a valid stuff");
            scanner.next();
        }
        String text = scanner.next();

        boolean isPalindrome = true;
        int left = 0;
        int right = text.length()-1 ;

        while ( left < right  ) {
            if (text.charAt(left) != text.charAt(right)) {
                isPalindrome = false;
                break;
            } else {
                left ++;
                right --;
            }
        }
        System.out.println(isPalindrome? "Yes, it's a palindrom.": "No, it's not a palindrom.");






        scanner.close();
    }
}
