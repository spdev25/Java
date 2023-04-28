import javax.swing.JOptionPane;

public class HypotenuseCalculations {
    public static void main(String[] args) {
        double side1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of side 1:"));
        double side2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of side 2:"));
        double hypotenuse = hypotenuse(side1, side2);
        JOptionPane.showMessageDialog(null, "The length of the hypotenuse is " + hypotenuse);
    }
    
    public static double hypotenuse(double side1, double side2) {
        double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        return hypotenuse;
    }
}
