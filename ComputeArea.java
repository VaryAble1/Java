import java.util.Scanner; //Keyboard input

/**
 * Created by VaryAble on 9/16/16.
 * Computing the area
 * Introduction to Java Programming (Comprehensive Version) 10th Edition
 * By: Y. Daniel Liang
 * PG. 34 Chapter 2
 */

public class ComputeArea {
    public static void main(String[] args) {

        //Create a scanner object
        Scanner input = new Scanner(System.in);

        //Step 1: Read in radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        //Step 2: Compute area
        double area = radius * radius * 3.14159;

        //Step 3: Display the area
        System.out.println("The area for the circle of radius " + radius + " is " + area);

    }
}
