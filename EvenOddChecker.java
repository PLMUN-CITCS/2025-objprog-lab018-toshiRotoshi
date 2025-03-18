import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {
        int number = getIntegerInput();

        String result = checkEvenOrOdd(number);

        System.out.println(result);
    }

    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter an integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                isValid = true; // Valid input, exit the loop
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        scanner.close(); // Close the scanner to avoid resource leak
        return number;
    }

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
}
