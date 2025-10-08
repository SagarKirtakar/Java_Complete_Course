package in.sagarcoding.challenge74;

import java.util.Scanner;

class GuessingGame {

    int random;

    GuessingGame() {
        random = (int) Math.ceil(Math.random() * 100);
    }

    /**
     *
     * @param guessNumber the number that player guessed
     * @return
     *  - Negative if the guess number is smaller
     *  - 0 if the guess number is correct
     *  - positive if the guess number is higher
     */

    int guessNumber(int guessNumber) {
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        System.out.println("Welcome to guessing game, Please guess the number between 1-100");
        int guess;
        int result;
        do {
            System.out.print("Guess the number: ");
            guess = input.nextInt();
            result = game.guessNumber(guess);
            if(result == 0 ) {
                System.out.println("Congrats your guess is correct");
            } else if(result < 0) {
                System.out.println("Please Guess Higher");
            } else {
                System.out.println("Please Guess Lower");
            }
        } while(result != 0);
    }
}
