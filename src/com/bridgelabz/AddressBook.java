package com.bridgelabz;

import javax.swing.*;
import java.util.ArrayList;
import com.bridgelabz.AddPerson;
public class AddressBook  {
    ArrayList<AddPerson> persons;

    public AddressBook(ArrayList<AddPerson> persons) {
        this.persons = persons;
    }
    public  void addPerson() {
        String name = JOptionPane.showInputDialog("enter a name");
        String lname = JOptionPane.showInputDialog("enter a last name");
        String address = JOptionPane.showInputDialog("enter a address");

        AddPerson p = new AddPerson(name,lname,address);
        persons.add(p);
    }
    public void searchPerson() {
        for(int i = 0; i<persons.size();i++){
            AddPerson p = (AddPerson) persons.get(i);

            if() {

            }
        }
    }
}
