/* Asks user about upgrading with Yes/No options GUI
* Author: VaryAble
* Date: 6/25/2018
*/
import javax.swing.JOptionPane;
public class AirlineDialog 
{
    public static void main(String[] args)
    {
        int selection;
        boolean isYes;
        selection = JOptionPane.showConfirmDialog(null,
                "Do you want to upgrade to first class?");
        isYes = (selection == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null,
                "You responded " + isYes);
    }
// Thanks for looking
}
