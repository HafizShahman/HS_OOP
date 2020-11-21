package com.shape;

import java.util.Scanner;

public class DisplayShape {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        char type;
        int Length, Height;

        System.out.println("Area Calculator");
        System.out.println("Please Select Shape");
        System.out.println("R = Rectangle \nS = Square");
        System.out.print("Shape : ");
        type = scan.next().charAt(0);


        if (type == 'R' || type == 'r'){
            System.out.print("Length : ");
            Length = scan.nextInt();
            System.out.print("Height : ");
            Height = scan.nextInt();
            Rectangle num = new Rectangle(Length, Height);
            num.DRectangle();

        } else if (type == 'S' || type == 's'){
            System.out.print("Length : ");
            Length = scan.nextInt();
            Square num = new Square(Length);
            num.DSquare();

        }else{
            System.out.println("You Enter Wrong Input");
        }

    }
}
