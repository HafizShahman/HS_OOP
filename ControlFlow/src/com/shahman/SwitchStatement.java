package com.shahman;

public class SwitchStatement {

    public static void main(String[] args) {
        String role = "admin";

        switch (role){
            case "admin":
                System.out.println("You are an admin");
                break;

            case "moderator":
                System.out.println("You are a moderator");
                break;

            default:
                System.out.println("You are a guest");
                break;
        }

        if ( role == "admin")
            System.out.println("You are an admin");
        else if (role == "moderator")
            System.out.println("You are a moderator");
        else
            System.out.println("You are a guest");
    }
}
