public class typeConversion {
    public static void main(String[] args) {

        String myString = "1234";

        int myInteger = Integer.parseInt(myString);
        System.out.println("String to Integer: " + myInteger);

        float myFloat = Float.parseFloat(myString);
        System.out.println("String to Float: " + myFloat);

        System.out.println();

        String integerToString1 = String.valueOf(myInteger);
        System.out.println("Integer to String using valueOf(): " + integerToString1);

        String integerToString2 = Integer.toString(myInteger);
        System.out.println("Integer to String using toString(): " + integerToString2);       

        

    /*  Write a program that performs the following tasks:
    **
    **  Convert a String to an Integer
    **  Convert a String to a Float
    **  Convert an Integer to a String using valueOf() method
    **  Convert an Integer to a String using toString() method
    **  
    **  Real-World Uses of Data Type Conversions
    **
    **
    Data Input and Validation
        User inputs are often strings and need conversion for calculations or other operations.
        Example: A budgeting app converts "1000" (string) into an integer for financial calculations.

    Data Manipulation and Formatting
        Convert numbers to strings for user-friendly displays.
        Example: Display a temperature as "Today's temperature is 72°F" in a weather app.

    Working with APIs and Data Interchange
        APIs often return strings that need parsing into usable data types.
        Example: Parse "3.14" (string) into a float for calculations, then convert results back to strings for display.

    Error Handling and Debugging
        Explicit conversions avoid unexpected behaviors and make code easier to debug.
        Example: A shopping cart app ensures precise calculations by correctly handling product prices (float) and quantities (integer).

    Optimizing Code for Different Contexts
        Conversions are necessary for working with databases, web development, mobile apps, etc.
        Example: Convert numeric data from a database into strings for user-facing reports.
    **
    */

    


    }
}