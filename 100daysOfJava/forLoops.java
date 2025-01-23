
import java.util.Scanner;

public class forLoops {
    public static void main(String[] args) {
        
        // 1 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        // sum using for-loop
        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }
        System.out.println("Sum using for loop: " + sumFor);

        // sum using while-loop 
        int sumWhile = 0;
        int i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;            
        }
        System.out.println("Sum using while loop: " + sumWhile);

        // sum using do-while-loop
        int sumDoWhile = 0;
        i = 1;
        do {
            sumDoWhile += i;
            i++;
        } while (i <= n);
        System.out.println("Sum using do-while loop: " + sumDoWhile);

        // sum of even integers using for-loop with continue
        int sumEven = 0;
        for (int j = 1; j <= n; j++) {
            if (j % 2 != 0) {
            continue;
            }
            sumEven += j;
        }
        System.out.println("Sum of even integers: " + sumEven);

        // generate random numbers until a number divisible by both 5 and 7 is found
        java.util.Random random = new java.util.Random();
        while (true) {
            int randomNumber = random.nextInt(100) + 1;
            if (randomNumber % 5 == 0 && randomNumber % 7 == 0) {
            System.out.println("Number divisible by both 5 and 7: " + randomNumber);
            break;
            }
        }

/*
Day 10: Loops (for, while, do-while)
1. Write a program that reads an input integer 'n' and prints the sum of integers from 1 to 'n' using three different types of loops: for, while, and do-while loops.
2. Write a program that reads an input integer 'n' and prints the sum of even integers from 1 to 'n' (use continue).
3. Write a program that generates random numbers between 1 and 100 until it finds a number divisible by both 5 and 7. When the number is found, print it and terminate the loop using the break statement.
*/


    }
}