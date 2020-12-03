package com.shahman;


import java.util.Scanner;

public class Display {

    public static void main(String[] args) {
        String loop;
        PreferredCustomer cust;
        do {

            Scanner scan = new Scanner(System.in);
            String name, address, noPhone, custID;
            double pprice = 0;


            System.out.println("\nPlease Enter Your Detail");
            System.out.print("Name : ");
            name = scan.nextLine();

            System.out.print("Address : ");
            address = scan.nextLine();

            System.out.print("Phone no : ");
            noPhone = scan.nextLine();

            System.out.print("Customer ID : ");
            custID = scan.nextLine();

            try {

                System.out.println("\nPlease Enter Your Total Purchase Price");
                System.out.print("Price : RM");
                pprice = scan.nextDouble();

            } catch (Exception E) {
                System.out.println("Your Enter Wrong Data");
                main(args);
            }
            cust = new PreferredCustomer(name, address, noPhone, custID, pprice);
            System.out.println("Result");
            cust.DCustomer();
            cust.DPreCust();
            System.out.print("\nOther Input? (Y/N) : ");
            loop = scan.next();

        } while (loop.equals("Y") || loop.equals("y"));
        System.out.println("Have A Good Day 😉😉");
    }
}

