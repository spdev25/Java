import javax.swing.JOptionPane;

public class Exponentiation {
    public static void main(String[] args) {
        int base = Integer.parseInt(JOptionPane.showInputDialog("Enter the base:"));
        int exponent = Integer.parseInt(JOptionPane.showInputDialog("Enter the exponent:"));
        int result = integerPower(base, exponent);
        JOptionPane.showMessageDialog(null, base + " raised to the power of " + exponent + " is " + result);
    }
    
    public static int integerPower(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}
