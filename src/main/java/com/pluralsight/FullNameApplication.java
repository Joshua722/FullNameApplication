package com.pluralsight;

import java.util.Scanner;
public class FullNameApplication {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please insert your name. ");
        System.out.print("First Name : ");
        String userFirst = myScanner.next();
        System.out.print("Middle Name : ");
        String userMiddle = myScanner.next();
        System.out.print("Last Name : ");
        String userLast = myScanner.next();
        System.out.print("Suffix : ");
        String userSuffix = myScanner.next();
        String fullName = userFirst.toUpperCase()  + " " + userMiddle.toUpperCase() + " " + userLast.toUpperCase() + ", " + userSuffix.toUpperCase();
        System.out.println(fullName);


    }
}
