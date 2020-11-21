package com.drawshape;

import java.util.Scanner;

public class DisplayDrawShape {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        double Length, Height, Radius;
        char type;
        System.out.println("Select shape");
        System.out.println("R = Rectangle \nS = Square \nC = Circle");
        System.out.print("Shape : ");
        type = scan.nextLine().charAt(0);

        if (type == 'R' || type == 'r'){
            System.out.print("Length : ");
            Length = scan.nextDouble();

            System.out.print("Height : ");
            Height = scan.nextDouble();

            Rectangle rec = new Rectangle(Length,Height);
            rec.draw();
            rec.getArea();
        }else if (type == 'C' || type == 'c'){
            System.out.print("Radius : ");
            Radius= scan.nextDouble();

            Circle cir = new Circle(Radius);
            cir.draw();
            cir.getArea();
        }else if (type == 'S' || type == 's'){
            System.out.print("Length : ");
            Length = scan.nextDouble();

            Square squ = new Square(Length);
            squ.draw();
            squ.getArea();
        }else {
            System.out.println("You Enter Wrong Input");
        }
    }
}
