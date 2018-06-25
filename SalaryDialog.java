/* Asks user for hourly wage and dependents, then displays weekly salary plus deductions in GUI
* Author: VaryAble
* Date: 6/25/2018
*/
import javax.swing.JOptionPane;
public class SalaryDialog
{
    public static void main(String[] args)
    {
        String wageString, dependentString;
        double wage, weeklyPay;
        int dependents;
        final double HOURS_IN_WEEK = 37.5;

        wageString = JOptionPane.showInputDialog(null,
                "Enter employee's hourly wage", "Salary dialog 1",
                JOptionPane.INFORMATION_MESSAGE);
        weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;

        dependentString = JOptionPane.showInputDialog(null,
                "How many dependents?", "Salary dialog 2",
                JOptionPane.QUESTION_MESSAGE);
        dependents = Integer.parseInt(dependentString);
        JOptionPane.showMessageDialog(null, "Weekly salary is $" +
        weeklyPay + "\nDeduction will be made for " +
        dependents + " dependents");
    }
// Thanks for looking
}
