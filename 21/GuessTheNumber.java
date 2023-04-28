import java.util.Random;
import javax.swing.JOptionPane;

public class GuessTheNumber {
    public static void main(String[] args) {
        int secretNumber, guess, numGuesses = 0, playAgain;
        Random random = new Random();
        do {
            secretNumber = 1 + random.nextInt(1000);
            numGuesses = 0;
            guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess a number between 1 and 1000:"));
            numGuesses++;
            while (guess != secretNumber) {
                if (guess < secretNumber) {
                    guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Too low. Try again:"));
                } else {
                    guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Too high. Try again:"));
                }
                numGuesses++;
                if (numGuesses > 10) {
                    break;
                }
            }
            if (numGuesses <= 10) {
                JOptionPane.showMessageDialog(null, "Congratulations. You guessed the number!");
            } else {
                JOptionPane.showMessageDialog(null, "You should be able to do better! Why should it take no more than 10 guesses?");
            }
            playAgain = JOptionPane.showConfirmDialog(null, "Play again?");
        } while (playAgain == JOptionPane.YES_OPTION);
    }
}