import javax.swing.JOptionPane;

public class RoundNumbers {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a number: ");
        double number = Double.parseDouble(input);
        String output = "Original number: " + number + "\n";
        output += "Rounded to the nearest integer: " + roundToInteger(number) + "\n";
        output += "Rounded to the nearest tenth: " + roundToTenths(number) + "\n";
        output += "Rounded to the nearest hundredth: " + roundToHundredths(number) + "\n";
        output += "Rounded to the nearest thousandth: " + roundToThousandths(number) + "\n";
        JOptionPane.showMessageDialog(null, output);
    }
    
    public static double roundToInteger(double number) {
        return Math.floor(number + 0.5);
    }
    
    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }
    
    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }
    
    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }
}
