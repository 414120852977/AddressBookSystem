package com.bridgelabz;

import javax.swing.*;

public class AddPerson {
    private String name;
    private String lname;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLname() {
        return lname;
    }

    public String getAddress() {
        return address;
    }

    public AddPerson(String n, String l, String a) {
       setName(n);
        setLname(l);
        setAddress(a);
    }
    // displaying record on gui
    public void print() {
        JOptionPane.showMessageDialog(null,"name:" +name + "address:"+lname + "phone no:"+address);
    }
}
