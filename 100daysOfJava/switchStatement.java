import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your percentage: ");
        int percentage = scanner.nextInt();
        char grade;

        switch (percentage / 10) {
            case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
            default:
                grade = 'F';
                break;
        }

        System.out.println("Your grade is: " + grade);
        scanner.close();

        }

    /*
    Day 9: Switch Statement
        1. Write a program that reads the percentage and then prints their corresponding letter grade (A, B, C, D, or F) using switch statement

    Reading List:
        1. Understand the advantages and drawbacks of if-else and switch statements

        If-else statements offer flexibility for evaluating complex conditions and various data types but can become less readable and slower with many conditions. Switch statements are more readable and efficient for comparing a single variable against multiple constants but are limited to discrete, constant values. Choosing between them depends on the complexity and nature of the conditions being evaluated.
    */

        

    }

