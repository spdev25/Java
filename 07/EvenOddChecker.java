import javax.swing.JOptionPane;

public class EvenOddChecker {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));
        if (isEven(num)) {
            JOptionPane.showMessageDialog(null, num + " is even.");
        } else {
            JOptionPane.showMessageDialog(null, num + " is odd.");
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
