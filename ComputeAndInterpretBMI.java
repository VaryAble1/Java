import java.util.*;

/**
 * Created by VaryAble on 9/27/16.
 * Compute BMI
 * Java
 */

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in Pounds
        System.out.print("Please enter your weight in pounds: ");
        double weight = input.nextDouble();

        // Prompt the user to enter height in Feet
        System.out.print("Please enter your height in feet: ");
        double heightFeet = input.nextDouble();

        // Prompt the user to enter height in Inches
        System.out.print("Please enter your height in inches: ");
        double heightInches = input.nextDouble();

        //Combining height total
        double totalHeight = heightInches + heightFeet * 12;

        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254; // Constant

        // Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = totalHeight * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
                System.out.println("Normal");
            else if (bmi < 30)
                System.out.println("Overweight");
            else
                System.out.println("Obese");

    }
}
