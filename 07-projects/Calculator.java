import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;

        System.out.print("Please enter your first number: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid first number: ");
            scanner.next();
        }
        firstNumber = scanner.nextInt();

        System.out.print("Please enter your second number: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid second number: ");
            scanner.next();
        }
        secondNumber = scanner.nextInt();


        System.out.print("Please choose an operator - +, -, *, /: ");

        char operator = scanner.next().charAt(0);

        while ( operator != '+' && operator != '-' && operator != '/' && operator != '*') {
            System.out.println("Please choose a valid operator from +, -, *, / : ");
            scanner.next().charAt(0);
        }
        System.out.println("You chose an operator: " + operator);

        String result = switch (operator) {
            case '+' -> {
                yield String.valueOf(firstNumber + secondNumber);
            }
            case '-' -> {
                yield String.valueOf(firstNumber + secondNumber);
            }
            case '/' -> {
                yield String.valueOf(firstNumber + secondNumber);
            }
            case '*' -> {
                yield String.valueOf(firstNumber * secondNumber);
            }
            default -> {
                yield "Something wrong";
            }
        };

        System.out.println("The result is: " + result);

        scanner.close();
    }
}
