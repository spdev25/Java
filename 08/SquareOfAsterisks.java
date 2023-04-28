import javax.swing.JOptionPane;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        int side = Integer.parseInt(JOptionPane.showInputDialog("Enter the side length of the square:"));
        squareOfAsterisks(side);
    }
    
    public static void squareOfAsterisks(int side) {
        String output = "";
        for (int row = 1; row <= side; row++) {
            for (int col = 1; col <= side; col++) {
                output += "*";
            }
            output += "\n";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
