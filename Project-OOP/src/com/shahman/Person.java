package com.shahman;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Currency;

public class Person {

    String PName;
    String PAddress;
    String PNoPhone;

    public Person(String name, String address, String noPhone) {

        PName = name;
        PAddress = address;
        PNoPhone = noPhone;

    }

    public void DPerson() {
        System.out.println("Name : " + PName.toUpperCase() + "\nAddress : " + PAddress.toUpperCase()
                + "\nPhone No : " + PNoPhone.toUpperCase());
    }

}

class Customer extends Person {

    String CustID;

    public Customer(String name, String address, String noPhone, String custID) {
        super(name, address, noPhone);

        CustID = custID;
    }

    public void DCustomer() {
        System.out.println("\nName : " + PName.toUpperCase() + "\nAddress : " + PAddress.toUpperCase()
                + "\nPhone No : " + PNoPhone.toUpperCase() + "\nCustomer ID : " + CustID.toUpperCase());
    }
}

class PreferredCustomer extends Customer {

    double price;

    public PreferredCustomer(String name, String address, String noPhone, String custID, double pprice) {
        super(name, address, noPhone, custID);

        price = pprice;

    }

    public void DPreCust() {
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        double totalPrice = 0, discount = 0;
        if (price < 500) {
            totalPrice = price;

        } else if ((price >= 500) && (price <= 999)) {
            discount = price * 0.05;
            totalPrice = price - discount;

        } else if ((price >= 1000) && (price <= 1499)) {
            discount = price * 0.06;
            totalPrice = price - discount;

        } else if ((price >= 1500) && (price <= 1999)) {
            discount = price * 0.07;
            totalPrice = price - discount;

        } else {
            discount = price * 0.10;
            totalPrice = price - discount;
        }

        System.out.println("Discount : RM" + defaultFormat.format(discount)
                + "\nPrice after discount : RM" + defaultFormat.format(totalPrice));
    }
}
