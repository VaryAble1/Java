/* Receives two parameters and returns a value
* Author: VaryAble
* Date: 6/26/2018
*/
import java.util.Scanner;
public class ParadiseInfo2
{
    public static void main(String[] args)
    {
        double price;
        double discount;
        double savings;
        Scanner keyboard = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter cutoff price for discount >> ");
        price = keyboard.nextDouble();

        System.out.print("Enter discount rate as a whole number >> ");
        discount = keyboard.nextDouble();

        ParadiseInfo.displayInfo(); // From ParadiseInfo.java class
        savings = computeDiscountInfo(price, discount);

        // Display
        System.out.println("Special this week on any service over $" + price);
        System.out.println("Discount of " + discount + " percent.");
        System.out.println("That's a savings of at least $" + savings);

    }

    public static double computeDiscountInfo(double pr, double dscnt)
    {
        double savings;
        savings = pr * dscnt / 100;
        return savings;
    }
// Thanks for looking
}
