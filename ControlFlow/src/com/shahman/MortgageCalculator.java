package com.shahman;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int principal, year, NumberOfPayment;
        final byte Percent = 100;
        final byte MonthInYear = 12;
        float monthlyInterest, annualInterest;
        double mortgage;

        System.out.print("Principal ($1K - $1M): ");
        principal = Integer.parseInt(scanner.next());
        while (!(principal >= 1000 && principal <= 1000000)) {
            System.out.println("Enter a number between 1000 and 1000000.");
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
        }

        System.out.print("Annual Interest Rate : ");
        annualInterest = scanner.nextFloat();
        while (!(annualInterest > 0 && annualInterest <= 30)) {
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
            System.out.print("Annual Interest Rate : ");
            annualInterest = scanner.nextFloat();
        }

        System.out.print("Period (Year) : ");
        year = Integer.parseInt(scanner.next());
        while (!(year > 0 && year <= 30)) {
            System.out.println("Enter a value between 1 and 30");
            System.out.print("Period (Year) : ");
            year = scanner.nextInt();
        }

        //calculation
        monthlyInterest = (annualInterest / Percent) / MonthInYear;
        NumberOfPayment = year * MonthInYear;
        mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, NumberOfPayment))
                / (Math.pow(1 + monthlyInterest, NumberOfPayment) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);


    }
}

