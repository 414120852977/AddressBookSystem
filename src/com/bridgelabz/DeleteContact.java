package com.bridgelabz;

import java.util.Scanner;

public class DeleteContact {
    public void deleteContact(String firstName) {
        System.out.println("enter a name to delete existing data");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        if(name.equals(firstName)) {
            System.out.println("congratulations! data deleted successfully");
        }
        else {
            System.out.println("you provide wrong name which is not in our database sorry");
        }
    }
}
