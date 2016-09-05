/*
 * Created by Zola on 5/09/2016.
 */
import javax.swing.*;
public class DistanceFromAverage
{
    public static void main(String[] args)
    {
        final int QUIT = 99999;
        double[] numbers = new double[20];
        double num;
        double total = 0;
        double average = 0;
        int x = 0, y;
        String numberString;
        numberString = JOptionPane.showInputDialog(null, "Enter any double values up to 20 and enter " +
            QUIT + " to stop.");
        num = Double.parseDouble(numberString);
        while(num != QUIT && x < numbers.length)
        {
            numbers[x] = num;
            total += numbers[x];
            ++x;
            if (x < numbers.length) {
                numberString = JOptionPane.showInputDialog(null, "Enter another value or " +
                        QUIT + " to stop.");
                num = Double.parseDouble(numberString);
            }
        }
        if(x==0)
            JOptionPane.showMessageDialog(null, "Cannot compute average because no numbers were entered");
        else
        {
            average = total / x;
            JOptionPane.showMessageDialog(null, "You entered " + x + " numbers and the average is " + average);
            for(y = 0; y < x; ++y)
                JOptionPane.showMessageDialog(null, numbers[y] + " is " + (numbers[y] - average) + " away from the average");
        }
    }
}
