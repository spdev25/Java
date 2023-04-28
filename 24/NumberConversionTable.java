import javax.swing.*;

public class NumberConversionTable {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null,
                "Enter a number in the range 1 through 256:",
                "Number Conversion Table", JOptionPane.PLAIN_MESSAGE);
        int num = Integer.parseInt(input);
        String[] columnNames = {"Decimal", "Binary", "Octal", "Hexadecimal"};
        Object[][] data = new Object[num][4];
        for (int i = 0; i < num; i++) {
            int decimal = i + 1;
            String binary = Integer.toBinaryString(decimal);
            String octal = Integer.toOctalString(decimal);
            String hexadecimal = Integer.toHexString(decimal);
            data[i][0] = decimal;
            data[i][1] = binary;
            data[i][2] = octal;
            data[i][3] = hexadecimal;
        }
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        JOptionPane.showMessageDialog(null, scrollPane,
                "Number Conversion Table", JOptionPane.PLAIN_MESSAGE);
    }
}