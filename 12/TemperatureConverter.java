import javax.swing.JOptionPane;

public class TemperatureConverter {
    
    public static double celsius(double fahrenheit) {
        double celsius = 5.0 / 9.0 * (fahrenheit - 32);
        return celsius;
    }
    
    public static double fahrenheit(double celsius) {
        double fahrenheit = 9.0 / 5.0 * celsius + 32;
        return fahrenheit;
    }
    
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter temperature:");
        double temperature = Double.parseDouble(input);
        
        String message = "";
        if (JOptionPane.showConfirmDialog(null, "Convert to Celsius?") == JOptionPane.YES_OPTION) {
            double celsius = celsius(temperature);
            message = String.format("%.2f\u00b0F = %.2f\u00b0C", temperature, celsius);
        } else {
            double fahrenheit = fahrenheit(temperature);
            message = String.format("%.2f\u00b0C = %.2f\u00b0F", temperature, fahrenheit);
        }
        
        JOptionPane.showMessageDialog(null, message);
    }
}