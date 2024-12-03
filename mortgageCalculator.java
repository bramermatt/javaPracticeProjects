
import java.text.DecimalFormat;
import java.util.Scanner;

public class mortgageCalculator {
    public static void main(String[] args) {

    /*
        Mortgage Calculator

        m (monthly payment)
        P (principle amount)
        tp (total price of home)
        dp (down payment)
        r (interest rate)
        n (num of months in a year)
        t (term - length of loan in years)

        P = (dp - tp)
        
        m = ((P[r/n]) / ([1 - (1 + [r/n])) ^-n(t)])
    */

        double defaultDpPercentage = 20.0;
        double defaultAnnualRate = 5.0;
        int defaultTermInYears = 30;

        try (Scanner myInput = new Scanner(System.in)) {
            System.out.println("What is the cost of the home?: ");
            double tp = myInput.nextDouble();
            
            double dp = (defaultDpPercentage / 100) * tp;
            double P = tp - dp;
            double r = defaultAnnualRate / 100 / 12;
            int n = 12 * defaultTermInYears;
            
            double m = (P * r) / (1 - Math.pow(1 + r, -n));

            /* 
            for input of all aspects
            
                System.out.println("What is the down payment percentage (usually 20% of cost of home): ");
                double dpPercentage = myInput.nextDouble();
                double dp = (dpPercentage / 100) * tp;
                
                double P = tp - dp;
                System.out.println("What is the annual interest rate?: ");
                double annualRate = myInput.nextDouble();
                double r = annualRate / 100 / 12;
                
                System.out.println("What is the term of the loan in years?: ");
                int t = myInput.nextInt();
                int n = 12 * t;
                
                double m = (P * r) / (1 - Math.pow(1 + r, -n));

            */
            
            DecimalFormat formatter = new DecimalFormat("#,###.00");
            
            System.out.println("Interest Rate: " + defaultAnnualRate);
            System.out.println("Loan Duration: " + defaultTermInYears);
            System.out.println();
            
            System.out.println("Down payment (" + defaultDpPercentage + "%): $" + formatter.format(dp));
            System.out.println("Loan amount: $" + formatter.format(P));
            System.out.println("Monthly payment: $" + formatter.format(m));

            myInput.close();
        }

    }
}