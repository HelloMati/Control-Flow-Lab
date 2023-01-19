import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Simple number guessing game that allows user's to input a guess and checks to see if it matches a secret
        // number.
        // Prompts user to input their guess

        int secretNumber = 18;

        // Collects user input
        Scanner reader = new Scanner(System.in);
        System.out.println("Can you guess the secret number?");
        int guessNumber = reader.nextInt();

            // Decision tree determines if the user's guess is correct, too high or too low.
            if (guessNumber == secretNumber) {
                System.out.println("Congratulations, you guessed correctly! You win.");
            }

            else if (guessNumber < secretNumber) {
                System.out.println("Too low! You guessed incorrectly.");
            }

            else {
                System.out.println("Too high! You guessed incorrectly.");
            }
    }
}