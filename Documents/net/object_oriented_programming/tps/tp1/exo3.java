package tp1;

import java.util.Random;
import java.util.Scanner;

public class exo3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(10) + 1;
        int score = 100;
        int attempts = 5;
        boolean hasGuessedCorrectly = false;
       System.out.println("the random is  " + numberToGuess);
        System.out.println("guess the number (between 1 and 10). You have 5 attempts.");
        for (int i = 0; i < attempts; i++) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == numberToGuess) {
                System.out.println("congratulations! You guessed the number.");
                hasGuessedCorrectly = true;
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("your guess is too low.");
            } else {
                System.out.println("your guess is too high.");
            }
           score = score -20;
            System.out.println("Attempts left: " + (attempts - i - 1));
            //System.out.println("Your current score is: " + score);
              
        }
        if (!hasGuessedCorrectly) {
            System.out.println("Sorry, you have used all your attempts. The number was: " + numberToGuess);
        }
        System.out.println("Your final score is: " + score);
        scanner.close();

    }
}
