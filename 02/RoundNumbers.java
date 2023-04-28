import javax.swing.JOptionPane;
public class RoundNumbers {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a double value : ");
        double num = Double.parseDouble(input);
        int roundedNum = (int) Math.floor(num + 0.5);
        JOptionPane.showMessageDialog(null, "Original number: " + num + "\nRounded number: " + roundedNum);
    }
}
