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
            switch (randomNumber()) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Very good!",
                            "Multiplication CAI", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Excellent!",
                            "Multiplication CAI", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Nice work!",
                            "Multiplication CAI", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Keep up the good work!",
                            "Multiplication CAI", JOptionPane.PLAIN_MESSAGE);
                    break;
            }
            num1 = generateNumber(new Random()); // Generate new numbers for the next question
            num2 = generateNumber(new Random());
            askQuestion(num1, num2); // Ask another question
        } else {
            switch (randomNumber()) {
                case 1:
                    JOptionPane.showMessageDialog(null, "No. Please try again.",
                            "Multiplication CAI", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Wrong. Try once more.",
                            "Multiplication CAI", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Don't give up!",
                            "Multiplication CAI", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "No. Keep trying.",
                            "Multiplication CAI", JOptionPane.PLAIN_MESSAGE);
                    break;
            }
            askQuestion(num1, num2); // Ask the same question again
        }
    }

    public static int randomNumber() {
        return new Random().nextInt(4) + 1;
    }
}