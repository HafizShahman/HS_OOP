package com.shape;

public class Shape {
    int length, height;

    public Shape(int Length, int Height){

        length = Length;
        height = Height;
    }

    public Shape(int Length) {
        length = Length;

    }

    public void DShape(){
        System.out.println("Length : " + length
                + "\nHeight : " + height);
    }
}
class Rectangle extends Shape {
    int totalAreaRec;

    public Rectangle(int Length, int Height){
        super(Length,Height);
        int tARec = 0;
        tARec = Length * Height;
        totalAreaRec = tARec;
    }

    public void DRectangle(){
        System.out.println("Length : " + length
                + "\nHeight : " + height
                + "\nTotal Area Of Rectangle : " + totalAreaRec);
    }
}
class Square extends Shape{
    int totalAreaSqu;

    public Square(int Length){
        super(Length);
        int tASqu;
        tASqu = Length * 2;
        totalAreaSqu = tASqu;
    }

    public void DSquare(){
        System.out.println("Length : " + length
                + "\nTotal Area Of Square : " + totalAreaSqu);
    }
}
