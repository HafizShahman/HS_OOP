package com.store;

public class store {
    String CustName, CustID;
    int Quantity;
    double Price;

    public store(String custName, String custID, int quantity, double price){
        CustName = custName;
        CustID = custID;
        Quantity = quantity;
        Price =  price;
    }

}

class music extends store{
    String SongName, Genre, SongID, Artist;
    int Year;

    public music(String custName, String custID, int quantity, double price, String Songname,
                 String genre,String songID, String artist,int year) {
        super(custName, custID, quantity, price);

        SongName = Songname;
        Genre = genre;
        SongID = songID;
        Artist = artist;
        Year = year;
    }
    public void DMusic(){
        System.out.println("Name : " + CustName + "\tCustomer ID : " + CustID);
        System.out.println("Song ID : " + SongID + "\tSong Name : " + SongName
                + "\nGenre : " + Genre + "\tArtist : " + Artist + "\tYear : " + Year);
        System.out.println("Quantity : " + Quantity + "\tPrice : " + Price);
    }
}

class bike extends store{
    String BikeType, BikeBrand, Model, ModelID;

    double Size, Weight;

    public bike(String custName, String custID, int quantity, double price, String bikeType,
                String bikeBrand, String model,String modelID, double size, double weight) {
        super(custName, custID, quantity, price);

        BikeType = bikeType;
        BikeBrand = bikeBrand;
        Model = model;
        ModelID = modelID;
        Size = size;
        Weight = weight;
    }
    public void DBike(){
        System.out.println("Name : " + CustName + "\tCustomer ID : " + CustID);
        System.out.println("Bike Type : " + BikeType + "\tBike Brand : " + BikeBrand
                + "\nModel : " + Model + "\tModel ID" + ModelID
                + "\nSize : " + Size + "\tWeight : " + Weight);
        System.out.println("Quantity : " + Quantity + "\tPrice : " + Price);

    }
}

class grocery extends store{
    String GBrand, GName, GType;

    public grocery(String custName, String custID, int quantity, double price, String gBrand,
                   String gName, String gType) {
        super(custName, custID, quantity, price);

        GBrand = gBrand;
        GName = gName;
        GType = gType;
    }
    public void DGrocery(){
        System.out.println("Name : " + CustName + "\tCustomer ID : " + CustID);
        System.out.println("Grocery Brand" + GBrand + "\tGrocery Name : " + GName
                + "\tGrocery Type : " + GType);
        System.out.println("Quantity : " + Quantity + "\tPrice : " + Price);
    }
}