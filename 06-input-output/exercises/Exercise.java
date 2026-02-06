import java.util.Scanner;


public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter something: ");

        String text;
        while (true) {
            if (scanner.hasNextInt()) {
                System.out.println("is Int: " + scanner.nextInt());
                scanner.nextLine();
            } else if (scanner.hasNextDouble()) {
                System.out.println("is Double: " + scanner.nextDouble());
                scanner.nextLine();
            } else {
                text = scanner.next();
                System.out.println(text.contains(" ") ? scanner.next() : scanner.nextLine());
            }

        scanner.close();
    }}};
