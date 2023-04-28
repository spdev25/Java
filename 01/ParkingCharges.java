import javax.swing.JOptionPane;

public class ParkingCharges {
    public static void main(String[] args) {
        double yesterdayReceipts = 0; 
        int numOfCustomers = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of customers: "));   
        for (int i = 1; i <= numOfCustomers; i++) {
            int hoursParked = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the hours parked for customer " + i + ": "));
            double charge = calculateCharges(hoursParked);
            yesterdayReceipts += charge;
            JOptionPane.showMessageDialog(null, "The charge for customer " + i + " is: $" + String.format("%.2f", charge));
        }
        JOptionPane.showMessageDialog(null, "The total receipts from yesterday are: $" + String.format("%.2f", yesterdayReceipts));
    }
    
    public static double calculateCharges(int hours) {
        double charge;
        if (hours <= 3) {
            charge = 2.0;
        } else {
            charge = 2.0 + 0.5 * Math.ceil(hours - 3);
            if (charge > 10.0) {
                charge = 10.0;
            }
        }
        return charge;
    }
}
