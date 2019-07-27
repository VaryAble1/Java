/* File: GetUSerInfo3.java
*  Author: Branden Lawrence
*  Date: 3-19-2019
*/ import java.util.*;

public class GetUserInfo3 {
    public static void main(String[] args){
        String name;
        int age;

        Scanner inputdevice = new Scanner(System.in);

        System.out.print("Please enter your age: "); // Asks for age
        age = inputdevice.nextInt(); // Places age in our variable

        inputdevice.nextLine(); // Eats the Enter pressed

        System.out.print("Please enter your name: ");
        name = inputdevice.nextLine();

        System.out.println("Your name is " + name + " and you are " + age + " years old.");
    }
}// Thanks for looking
