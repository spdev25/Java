import javax.swing.JOptionPane;

public class DigitsSeparator {
    public static int quotient(int a, int b) {
        return a / b;
    }

    public static int remainder(int a, int b) {
        return a % b;
    }
 
    public static void displayDigits(int number) {
        String numString = Integer.toString(number);
        for (int i = 0; i < numString.length(); i++) {
            System.out.print(numString.charAt(i) + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 1 and 99999: "));
        displayDigits(number);
    }
}