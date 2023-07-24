package com.mwakai.amigoscode;

import java.util.Scanner;

public class LoanCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter the number of years for the loan: ");
        int numYears = input.nextInt();

        System.out.print("Enter the loan amount: ");
        double loanAmount = input.nextDouble();

        // Calculate monthly interest rate from annual interest rate
        double monthlyInterestRate = annualInterestRate / 12.0;

        // Calculate monthly payment using formula: M = P * (r(1+r)^n) / ((1+r)^n - 1)
        int numMonths = numYears * 12;
        double monthlyPayment = loanAmount * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numMonths)) / (Math.pow(1 + monthlyInterestRate, numMonths) - 1);

        // Calculate total payment
        double totalPayment = monthlyPayment * numMonths;

        // Display results
        System.out.printf("Monthly payment: $%.2f\n", monthlyPayment);
        System.out.printf("Total payment: $%.2f\n", totalPayment);
    }
}
