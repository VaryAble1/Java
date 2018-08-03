import javax.swing.*;

/** Fibonacci calculator to the nth degree
 * Created by VaryAble on 8/3/18.
 */
public class fib
{
    public static void main(String[] args)
    {
        long a = 0, b = 1;
        int input; // From user
        boolean exit; // End the loop

        do { // For exceptional flow control

            String i = JOptionPane.showInputDialog(null, "How many # times?");
            try {
                input = Integer.parseInt(i);

                fibonacci(a, b, input); // Calculator 9000

                exit = true; // Permission granted
            } catch (Exception ex) { // Something's not right...
                JOptionPane.showMessageDialog(null, "Please enter a number...");
                exit = false; // Do it again
            }
        }
        while(!exit);
    }

    // Calculator 9000
    private static void fibonacci(long a, long b, long limit)
    {
        int count = 1;

        for(int x = 0; x < limit; x++) {

            long c;

            c = a + b;

            System.out.println("#" + count + ": " + c);

            a = b;
            b = c;
            count++;
        }
    }
// Thanks for looking
}
