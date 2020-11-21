package com.shahman;

import java.util.Arrays;
import java.util.Scanner;
public class LoopBack {
    int[] arr = {10, 20, 30, 2, 0, 8};
    public static void getInputs(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose numerator and denominator(not 0) from this array (enter positions 0 to 5)");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int result = (arr[a])/(arr[b]);
            System.out.println("Result of "+arr[a]+"/"+arr[b]+": "+result);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: You have chosen position which is not in the array: TRY AGAIN");
            getInputs(arr);
        }catch(ArithmeticException e) {
            System.out.println("Error: Denominator must not be zero: TRY AGAIN");
            getInputs(arr);
        }
    }
    public static void main(String [] args) {
        LoopBack obj = new LoopBack();
        System.out.println("Array: "+Arrays.toString(obj.arr));
        getInputs(obj.arr);
    }
}
