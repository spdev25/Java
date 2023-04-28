import javax.swing.JOptionPane;

public class PerfectNumbers {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)) {
                output.append(i).append(": ");
                for (int factor : getFactors(i)) {
                    output.append(factor).append(" ");
                }
                output.append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, output.toString(), "Perfect Numbers", JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int factor : getFactors(number)) {
            sum += factor;
        }
        return sum == number;
    }

    public static int[] getFactors(int number) {
        int[] factors = new int[number];
        int count = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                factors[count] = i;
                count++;
            }
        }
        int[] result = new int[count];
        System.arraycopy(factors, 0, result, 0, count);
        return result;
    }
}
