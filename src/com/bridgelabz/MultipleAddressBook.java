package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;


public class MultipleAddressBook {
    static String name = "Ashok";
    public void multipleBook() {

        ArrayList<String> list = new ArrayList<>();
        list.add("slam");
        list.add("glamour");
        list.add("super");

        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
    void display() {
        System.out.println("name of the adressbook is"+name);
    }
}
