package com.shahman;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Display {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = null, address = null, noPhone = null, custID = null;
        double pprice = 0;


        try {
            System.out.println("Please Enter Your Detail");
            System.out.print("Name : ");
            name = scan.nextLine();

            System.out.print("Address : ");
            address = scan.nextLine();

            System.out.print("Phone no : ");
            noPhone = scan.nextLine();

            System.out.print("Customer ID : ");
            custID = scan.nextLine();

            System.out.println("\nPlease Enter Your Total Purchase Price");
            System.out.print("Price : ");
            pprice = scan.nextDouble();

            PreferredCustomer cust = new PreferredCustomer(name, address, noPhone, custID, pprice);
            cust.DCustomer();
            cust.DPreCust();


        } catch (Exception E) {

            System.out.println("Your Enter Wrong Data");
            main(args);
        } finally {

        }

    }



}
