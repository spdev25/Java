import java.util.Random;
import javax.swing.JOptionPane;

public class CrapsGame {
    private static final Random randomNumbers = new Random();
    private enum Status { CONTINUE, WON, LOST };

    public static void main(String[] args) {
        int bankBalance = 1000;
        int wager = 0;

        while (bankBalance > 0) {
            do {
                String input = JOptionPane.showInputDialog(null, "Bank balance: $" + bankBalance + "\nEnter wager:");
                try {
                    wager = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    wager = 0;
                }
            } while (wager <= 0 || wager > bankBalance);

            int sumOfDice = rollDice();
            int myPoint = 0;
            Status gameStatus;

            switch (sumOfDice) {
                case 7:
                case 11:
                    gameStatus = Status.WON;
                    break;
                case 2:
                case 3:
                case 12:
                    gameStatus = Status.LOST;
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice;
                    break;
            }

            while (gameStatus == Status.CONTINUE) {
                sumOfDice = rollDice();

                if (sumOfDice == myPoint) {
                    gameStatus = Status.WON;
                } else if (sumOfDice == 7) {
                    gameStatus = Status.LOST;
                }
            }

            if (gameStatus == Status.WON) {
                bankBalance += wager;
                displayMessage("You won! Bank balance: $" + bankBalance);
            } else {
                bankBalance -= wager;
                displayMessage("You lost. Bank balance: $" + bankBalance);
                if (bankBalance == 0) {
                    displayMessage("Sorry. You busted!");
                }
            }

            displayChatter();
        }
    }

    private static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;

        displayMessage(String.format("Player rolled %d + %d = %d", die1, die2, sum));

        return sum;
    }

    private static void displayMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    private static void displayChatter() {
        String[] messages = {
            "Oh, you're going for broke, huh?",
            "Aw c'mon, take a chance!",
            "You're up big. Now's the time to cash in your chips!",
            "You're down big. Maybe you should quit while you're ahead.",
            "Quit while you're ahead, I always say.",
            "The house always wins in the end.",
            "You know the odds are against you, right?",
            "Good luck, you'll need it!",
            "Let's see if you can beat the odds.",
            "Feeling lucky, punk?",
        };

        int index = randomNumbers.nextInt(messages.length);
        displayMessage(messages[index]);
    }
}
