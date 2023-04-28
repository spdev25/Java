import javax.swing.JOptionPane;

public class MultipleChecker {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number 1 :"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number 2 :"));
        if (isMultiple(num1, num2)) {
            JOptionPane.showMessageDialog(null, num2 + " is a multiple of " + num1);
        } else {
            JOptionPane.showMessageDialog(null, num2 + " is not a multiple of " + num1);
        }
    }

    public static boolean isMultiple(int num1, int num2) {
        if (num2 % num1 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
