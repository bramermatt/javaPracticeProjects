import java.util.Scanner;
public class basicArithmetic {
    public static void main(String[] args) {
    // Step 1
        
        // initializing the variables
        int myIntOne = 5;
        int myIntTwo = 8;
        
        // printing it all out.
        System.out.println("myIntTwo: " + (myIntTwo) + " and " + "myIntOne: " + (myIntOne));
        System.out.println("Sum: " + (myIntTwo + myIntOne));
        System.out.println("Difference: " + (myIntTwo - myIntOne));
        System.out.println("Multiplication: " + (myIntTwo * myIntOne));
        System.out.println("Division: " + (myIntTwo / myIntOne));
        System.out.println();

    // Step 2.
        // initializing the variables
        double length;
        double width;

        // initializing scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Length: ");
        length = scanner.nextDouble();
        System.out.print("Enter Width: ");
        width = scanner.nextDouble();

        System.out.println("length: " + length);
        System.out.println("width: " + width);

        System.out.println("Area (default): " + (length * width)); // Default output
        System.out.printf("Area (formatted): %.2f%n", (length * width)); // Formatted to 2 decimal places

    /*
    **  100 days of code DAY 4
    **  (https://www.100daysofcode.io/learn/java/basic-arithmetic-operations)
    **
    **  1. Write a program that declares two integer variables and perform basic arithmetic operations (addition, subtraction, multiplication, division) on them. Print the results to the console. [DONE]
    **  2. Write a program that calculates the area of a rectangle. Prompt the user to input the length(integer) and width(integer) of the rectangle, calculate the area (length * width), and print the result. [DONE]
    **  3. Modify the above program to read decimal numbers as the length and width, and output the area to two decimal points. [DONE]
    **    
    **      Reading List:
    **      1. Learn about formatting options such as precision, alignment, and decimal places to present output in a clear and concise manner.
    **          Not knowing about the printf() function, I was unaware that is what this was in regards to. Formatting output in Java while controlling the appearance of printed data uses System.out.printf. That is the Formatter class. String formats are String.format. Specify the number of decimal places using %.nf, where n is the desired number of decimal places. Use %nX where n is the minimum width of the field. Use %-nX for left-aligned formatting. Add zero padding using %0nd, where n is the field width. Use String.format for reusable formatting. Use the Formatter class for more control.
    **
    **
    */


    }

}