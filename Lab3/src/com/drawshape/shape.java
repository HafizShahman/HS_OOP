package com.drawshape;


public interface shape {

    void draw();

}

class Shapeinterface implements shape {

    double length, height, radius;

    public Shapeinterface(double Length, double Height) {

        length = Length;
        height = Height;
    }

    public Shapeinterface(double Radius) {

        radius = Radius;
    }

    public void draw() {

    }
}

class Rectangle extends Shapeinterface {
    double length, height, TotalAreaRec;

    public Rectangle(double Length, double Height) {
        super(Length, Height);
        double totalAreaRec;
        length = Length;
        height = Height;
        totalAreaRec = Length * Height;
        TotalAreaRec = totalAreaRec;
    }

    public void draw() {

        System.out.println("Drawing Rectangle");
    }

    public void getArea() {
        System.out.println("Length : " + length + "\nHeight : " + height
                + "\nArea Of Rectangle: " + TotalAreaRec);
    }

}

class Circle extends Shapeinterface {
    double radius, TotalAreaCir;

    public Circle(double Radius) {
        super(Radius);
        double totalAreaCir;
        final double Pi = 3.142;
        radius = Radius;
        totalAreaCir = Pi * Radius * Radius;
        TotalAreaCir = totalAreaCir;
    }

    public void draw() {
        System.out.println("Drawing Circle");

    }

    public void getArea() {
        System.out.println("Radius : " + radius
                + "\nArea Of Circle: " + TotalAreaCir);
    }
}

class Square extends Shapeinterface {
    double length, TotalAreaSqu;

    public Square(double Length) {
        super(Length);
        double totalAreaSqu;
        length = Length;
        totalAreaSqu = Length * Length;
        TotalAreaSqu = totalAreaSqu;
    }

    public void draw() {
        System.out.println("Drawing Square");

    }

    public void getArea() {
        System.out.println("Radius : " + length
                + "\nArea Of Square: " + TotalAreaSqu);
    }
}
