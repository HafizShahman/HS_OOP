package com.store;

import java.util.Scanner;

public class DisplayStore {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);

        String custName, custID;
        int quantity;
        double price;
        char Cate;
        String Songname, genre, songID, artist;
        int year;
        String bikeType, bikeBrand, model, modelID;
        double size = 0, weight = 0;
        String gBrand, gName, gType;

        System.out.println("Customer Details");
        System.out.print("Customer Name : ");
        custName = scan.nextLine();
        System.out.print("Customer : ");
        custID = scan.nextLine();
        System.out.println("List of Category \tM = Music \tB = Bike \tG = Grocery");
        System.out.print("Select Category : ");
        Cate = scan.nextLine().charAt(0);

        if (Cate == 'M' || Cate == 'm') {
            System.out.print("Song ID : ");
            songID = scan.nextLine();
            System.out.print("Song Name : ");
            Songname = scan.nextLine();
            System.out.print("Genre : ");
            genre = scan.nextLine();
            System.out.print("Artist : ");
            artist = scan.nextLine();
            System.out.print("Year Published : ");
            year = scan.nextInt();
            System.out.print("Quantity : ");
            quantity = scan.nextInt();
            System.out.print("Price :");
            price = scan.nextDouble();

            music m1 = new music(custName,custID,quantity,price,Songname,genre,songID,artist,year);
            m1.DMusic();
            System.out.println("Music done");


        } else if (Cate == 'B' || Cate == 'b') {
            System.out.print("Bike Type : ");
            bikeType = scan.nextLine();
            System.out.print("Bike Brand : ");
            bikeBrand = scan.nextLine();
            System.out.print("Model : ");
            model = scan.nextLine();
            System.out.print("Model ID : ");
            modelID = scan.nextLine();
            System.out.print("Size : ");
            size = scan.nextDouble();
            System.out.print("Weight : ");
            weight = scan.nextDouble();
            System.out.print("Quantity : ");
            quantity = scan.nextInt();
            System.out.print("Price :");
            price = scan.nextDouble();

            bike b1 = new bike(custName,custID,quantity,price,bikeType,bikeBrand,model,modelID,size,weight);
            b1.DBike();
            System.out.println("Bike done");

        } else if (Cate == 'G' || Cate == 'g') {
            System.out.print("Grocery Brand :");
            gBrand = scan.nextLine();
            System.out.print("Grocery Name : ");
            gName = scan.nextLine();
            System.out.print("Grocery Type :");
            gType = scan.nextLine();
            System.out.print("Quantity : ");
            quantity = scan.nextInt();
            System.out.print("Price :");
            price = scan.nextDouble();

            grocery g1 = new grocery(custName,custID,quantity,price,gBrand,gName,gType);
            g1.DGrocery();
            System.out.println("Grocery done");

        } else {
            System.out.println("Salah masuk data la");
        }

    }
}
