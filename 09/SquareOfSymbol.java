import javax.swing.JOptionPane;

public class SquareOfSymbol {
    public static void main(String[] args) {
        int side = Integer.parseInt(JOptionPane.showInputDialog("Enter the side length of the square:"));
        char fillCharacter = JOptionPane.showInputDialog("Enter the side length of the square:").charAt(0);
        squareOfFillCharacter(side, fillCharacter);
    }
    
    public static void squareOfFillCharacter(int side, char fillCharacter) {
        String output = "";
        for (int row = 1; row <= side; row++) {
            for (int col = 1; col <= side; col++) {
                output += fillCharacter;
            }
            output += "\n";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
