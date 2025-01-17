import java.util.Scanner;


public class ifElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Check if a number is odd or even
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // 2. Find the largest of three numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        System.out.println("The largest number is: " + largest);

        // 3. Check if a year is a leap year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeap = true;
            }
        }

        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();


    }

/* Day 8: Conditional Statements (if-else)
    // 1. Write a program that reads an integer as user input and prints whether the number is Odd or Even to the console
    // 2. Write a program that takes three numbers as input and prints the largest among them
    // 3. Write a program that checks if a given input year is a leap year or not
*/
}