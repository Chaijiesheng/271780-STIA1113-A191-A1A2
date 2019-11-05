
import java.util.Scanner;

public class CarLoanCalculator {
    public static void main(String[] args) {

        final int YEAR =12;
        final int PERCENT =100;
        float totalCarLoan =0;
        float downPayment =0;
        int loanPeriod =0;
        float interestRate =0;
        float n;


        Scanner input = new Scanner(System.in);

    System.out.println("****Welcome to Car Loan Calculator****\n");


    while (true) {
        System.out.print("Enter the Car loan(RM) : ");
        totalCarLoan = input.nextFloat();
        if (totalCarLoan >= 30000 && totalCarLoan <= 100_000_000)
            break;
        System.out.println("Value should above 30000");
    }

    while (true) {
        System.out.print("Enter the Down Payment(RM) : ");
        downPayment = input.nextFloat();
        if (downPayment >= 0 && downPayment < totalCarLoan)
            break;
        System.out.println("Value should above 0");
    }

    while (true) {
        System.out.print("Enter the Loan Period(Year) : ");
        loanPeriod = input.nextInt();
        if (loanPeriod >= 5 && loanPeriod <= 9)
            break;
        System.out.println("Place a value within 5 and 9");
    }

    while (true) {
        System.out.print("Enter the Interest Rate(%) : ");
        interestRate = input.nextFloat();
        if (interestRate >= 3 && interestRate <= 7)
            break;
        System.out.println("Place a value within 3 and 7");
    }



        float  carLoan = totalCarLoan-downPayment;
        float totalInterest = carLoan* (interestRate/PERCENT)* loanPeriod;

        float totalPayment = totalInterest+carLoan;

        float monthlyPayment = totalPayment/(loanPeriod*YEAR);
        System.out.printf("Montly Repayment : RM"+"%.2f", monthlyPayment );

        System.out.println("");
        System.out.printf("\t"+"Years"+"\t"+"PRINCIPAL" + "\t"+"INTEREST"+"\t"+"BALANCE"+"\n");


        for ( n = 1;n <=loanPeriod; ++n) {
            System.out.printf("%7.0f", n);
            System.out.printf("%12.2f",((totalPayment/loanPeriod)*n));
            System.out.printf("%12.2f",(totalInterest/loanPeriod)*n);
            System.out.printf("%12.2f\n",totalPayment-(totalPayment/loanPeriod)*n);



        }
    }
}

