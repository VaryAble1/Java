/* Ask user for name and print in GUI
* Author: VaryAble
* Date: 6/25/2018
*/
import javax.swing.JOptionPane;
public class HelloNameDialog
{
    public static void main(String[] args)
    {
        String result;
        result = JOptionPane.showInputDialog(null, "What is your name?");
        JOptionPane.showMessageDialog(null, "Hello, " + result + "!");
    }
// Thanks for looking
}
