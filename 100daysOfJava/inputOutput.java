
import java.math.BigDecimal;
import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        // Scanner takes an input, if (System.in) is used. This sets up the input to receive it
        Scanner myInput = new Scanner(System.in); 

        // This prints before the Input.
        System.out.println("String, Float, Integer: ");

        String STRING = myInput.nextLine();
        float FLOAT = myInput.nextFloat();
        int INT = myInput.nextInt();

        // This prints what was received from myInput
        System.out.println("String: " + STRING);
        System.out.println("Float: " + FLOAT);
        System.out.println("Int: " + INT);

/*
**  100 days of code DAY 3
**  (https://www.100daysofcode.io/learn/java/input-output)
**
**  1. Write a program that reads user input and print it to the console.
**  2. Modify the program to read and print different data type inputs (integers, floating-point numbers, strings)
**  3. Write a program to read the user input using Scanner class
**
**  Reading List:
**  1. Explore various methods for reading different type of inputs
**
*/
    }
}