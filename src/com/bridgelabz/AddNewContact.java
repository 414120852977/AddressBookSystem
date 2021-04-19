package com.bridgelabz;

import java.util.Scanner;

public class AddNewContact   {
    public  void  addContactConsole() {
        System.out.println("Enter a first name :");
        Scanner sc = new Scanner(System.in);
        String fName = sc.nextLine();
        System.out.println("enter a last name:");
        String lName = sc.nextLine();
        System.out.println("enter the address");
        String address = sc.nextLine();
        System.out.println("Enter the city");
        String city = sc.nextLine();
        System.out.println("enter the state ");
        String state = sc.nextLine();
        System.out.println("enter your zip code");
        int zip = sc.nextInt();
        System.out.println("enter your mobile no");
        int mobileNo = sc.nextInt();

        System.out.println("name is :"+fName + "lastName is :"+lName+"adress is"+address+"city is"+city+"state is:"+state+"zip is"+zip+"mobile no:"+mobileNo);
    }
}
