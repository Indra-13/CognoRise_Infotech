import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final int MAX_ATTEMPTS = 5; // Define maximum number of attempts
        int attempts = 0; // Initialize attempts counter
        boolean guessedCorrectly = false; // Initialize flag for correct guess

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it.");

        // Start the game loop
        while (attempts < MAX_ATTEMPTS && !guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            // Compare the user's guess with the generated number
            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number (" + randomNumber + ") correctly!");
                guessedCorrectly = true;
            }
        }

        // Check if the user didn't guess the number within the maximum attempts
        if (!guessedCorrectly) {
            System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + randomNumber);
        }

        scanner.close(); // Close the scanner
    }
}
