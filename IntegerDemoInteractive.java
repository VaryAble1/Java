/* IntegerDemo.java Program accepts user input
 *  Author: VaryAble
 *  Date: 5/26/2018
 */
import java.util.Scanner;

public class IntegerDemoInteractive
{
    public static void main(String[] args)
    {
        int anInt;
        byte aByte;
        short aShort;
        long aLong;
        //int anotherInt = anInt * 10000000;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer >> ");
        anInt = input.nextInt();

        System.out.print("Please enter a byte integer >> ");
        aByte = input.nextByte();

        System.out.print("Please enter a short integer >> ");
        aShort = input.nextShort();

        System.out.print("Please enter a long integer >> ");
        aLong = input.nextLong();

        System.out.println("The int is " + anInt);
        System.out.println("The byte is " + aByte);
        System.out.println("The short is " + aShort);
        System.out.println("The long is " + aLong);
        //System.out.println("Anther int is " + anotherInt);
    }
    // Thanks for looking
}
