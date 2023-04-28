import java.util.Random;
import javax.swing.JOptionPane;

public class MultiplicationCAI {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = generateNumber(random);
        int num2 = generateNumber(random);
        askQuestion(num1, num2);
    }

    public static int generateNumber(Random random) {
        return random.nextInt(9) + 1; // Generates a random integer between 1 and 9
    }

    public static void askQuestion(int num1, int num2) {
        int answer = Integer.parseInt(JOptionPane.showInputDialog(null,
                "How much is " + num1 + " times " + num2 + "?",
                "Multiplication CAI", JOptionPane.PLAIN_MESSAGE));
        int product = num1 * num2;
        if (answer == product) {
            JOptionPane.showMessageDialog(null, "Very good!",
                    "Multiplication CAI", JOptionPane.PLAIN_MESSAGE);
            num1 = generateNumber(new Random()); // Generate new numbers for the next question
            num2 = generateNumber(new Random());
            askQuestion(num1, num2); // Ask another question
        } else {
            JOptionPane.showMessageDialog(null, "No. Please try again.",
                    "Multiplication CAI", JOptionPane.PLAIN_MESSAGE);
            askQuestion(num1, num2); // Ask the same question again
        }
    }
}