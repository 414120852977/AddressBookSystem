package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        System.out.println("**Welcome to Address Book Management System**");
        /**
         * ability to create a contact in address book by using constructor
         * creating first name,last name, address,city,state,zip and mobile no
         */
        AddingContact addingContact = new AddingContact("james","ghosling","us","ug","ke",5445,55545445);
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

        EditContact edit = new EditContact();
        edit.editAddress("Ashok");
        DeleteContact delete = new DeleteContact();
        delete.deleteContact("Ashok");
        Collection collection = new Collection();
        System.out.println("Added multiple contact using list");
        collection.multipleContact("ashok","mane","aurangabad","jalna","maharashtra",431212,544545);
        collection.multipleContact("james","ghosling","uk","mh","ma",545,645645);
        ArrayList<String> list = new ArrayList<>();
        list.add("Ashok");
        list.add("Akash");
        list.add("sanket");
        list.remove("Ashok");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        MultipleAddressBook multiple = new MultipleAddressBook();
        multiple.multipleBook();
        multiple.display();

    }
}
