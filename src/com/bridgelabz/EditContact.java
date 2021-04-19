package com.bridgelabz;

import java.util.Scanner;

public class EditContact {
    public void editAddress (String fName) {
        System.out.println("enter a name to edit data");
        Scanner sc1 = new Scanner(System.in);
        String name = sc1.nextLine();
        if(name.equals(fName)) {
            System.out.println("you can edit");
            System.out.println("Enter a first name :");
            Scanner sc = new Scanner(System.in);
            String fNames = sc.nextLine();
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

            System.out.println("name is :"+fNames + "lastName is :"+lName+"adress is"+address+"city is"+city+"state is:"+state+"zip is"+zip+"mobile no:"+mobileNo);
        }
        else {
            System.out.println("you cannot edit or name not be correct");
        }
    }
}
