package com.bridgelabz;

public class AddingContact {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    int phoneNo;

    public AddingContact(String firstName, String lastName, String address, String city, String state, int zip, int phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNo = phoneNo;

        System.out.println("name is :"+firstName + "lastName is :"+lastName+"adress is"+address+"city is"+city+"state is:"+state+"zip is:"+zip+"phone no is :"+phoneNo);
    }

}
