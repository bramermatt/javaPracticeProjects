
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
**  2. Modify the program to read and print different data type inputs (integers, floating-point numbers, strings).
**  3. Write a program to read the user input using Scanner class.
**
**  Reading List:
**  1. Explore various methods for reading different type of inputs.
**      source (https://bootcamptoprod.com/java-scanner/)
**      source (https://www.geeksforgeeks.org/how-to-take-input-from-user-in-java/#)
**      
**      Using Scanner: Scanner class in Java is part of the java.util package. It is a tool for breaking down input into meaningful tokens. A token can be a single word, a number, or even a special character. The Scanner class can identify different types of tokens and convert them into appropriate data types. 
**      Think of a Java Scanner as a listener that hears what someone types on the computer and helps your program understand it. It can be used in many situations, like when you want someone to type their name, a number, or even a sentence, and your program needs to do something with that information. For example, if you’re making a calculator, the Scanner can listen to the numbers someone types and do the math. Or if you’re making a chatbot, the Scanner can listen to what a person types and respond based on that. It’s handy whenever you need your program to interact with someone typing things in.
**
**      User Input, File Reading, Data Parsing, Tokenization, Menu Selection, Data Validation, Simple Games, Database Interaction.
**
**      Scanner Methods: 
**          next(): returns the next token as a String Object. It can be used to read a single word from input.
**          nextLine(): returns the next line of input as a String object. It reads until the end of the line, so it can be used to read a whole sentence or paragraph from the input.
**          nextInt(): returns the next token as an int value. It parses the token as an integer, so it can be used to read a numerical value from the input. It throws an InputMismatchException if the token cannot be parsed as an integer.
**          nextDouble(): returns the next token as a double value. Parses the token as a double-precision floating-point number, so it can be used to read a decimal value from the input. It throws an InputMismatchException if the token cannot be parsed as a double.
**          nextBoolean(), nextByte(), nextFloat(), nextLong(), and nextShort() also.
**
**
**
*/
    }
}