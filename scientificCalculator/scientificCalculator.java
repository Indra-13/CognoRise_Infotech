import java.util.Scanner;

public class scientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Scientific Calculator!");

        // Main loop to handle user input
        while (true) {
            System.out.println("\nEnter an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Exponentiation");
            System.out.println("7. Trigonometric Functions");
            System.out.println("8. Clear");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performAddition(scanner);
                    break;
                case 2:
                    performSubtraction(scanner);
                    break;
                case 3:
                    performMultiplication(scanner);
                    break;
                case 4:
                    performDivision(scanner);
                    break;
                case 5:
                    performSquareRoot(scanner);
                    break;
                case 6:
                    performExponentiation(scanner);
                    break;
                case 7:
                    performTrigonometricFunctions(scanner);
                    break;
                case 8:
                    clear();
                    break;
                case 9:
                    System.out.println("Exiting the calculator. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 9.");
            }
        }
    }

    // Method to perform addition
    private static void performAddition(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    // Method to perform subtraction
    private static void performSubtraction(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    // Method to perform multiplication
    private static void performMultiplication(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    // Method to perform division
    private static void performDivision(Scanner scanner) {
        System.out.print("Enter the dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter the divisor: ");
        double divisor = scanner.nextDouble();
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            double result = dividend / divisor;
            System.out.println("Result: " + result);
        }
    }

    // Method to perform square root
    private static void performSquareRoot(Scanner scanner) {
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        if (num < 0) {
            System.out.println("Error: Square root of a negative number is not defined.");
        } else {
            double result = Math.sqrt(num);
            System.out.println("Square root: " + result);
        }
    }

    // Method to perform exponentiation
    private static void performExponentiation(Scanner scanner) {
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
    }

    // Method to perform trigonometric functions
    private static void performTrigonometricFunctions(Scanner scanner) {
        System.out.println("Trigonometric Functions:");
        System.out.println("1. Sine");
        System.out.println("2. Cosine");
        System.out.println("3. Tangent");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the angle in degrees: ");
        double angleDegrees = scanner.nextDouble();
        double angleRadians = Math.toRadians(angleDegrees);

        double result;
        switch (choice) {
            case 1:
                result = Math.sin(angleRadians);
                System.out.println("Sine: " + result);
                break;
            case 2:
                result = Math.cos(angleRadians);
                System.out.println("Cosine: " + result);
                break;
            case 3:
                result = Math.tan(angleRadians);
                System.out.println("Tangent: " + result);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Method to clear the display area
    private static void clear() {
        System.out.println("Display area cleared.");
    }
}
