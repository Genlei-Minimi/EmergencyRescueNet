package com.example.test4;
//data storage of strings and int
public class ContactModel {
    String contactList;
    String contactNum;
    int image;

    public ContactModel(String contactList, String contactNum, int image) {
        this.contactList = contactList;
        this.contactNum = contactNum;
        this.image = image;
    }

    public String getContactList() {
        return contactList;
    }

    public String getContactNum() {
        return contactNum;
    }

    public int getImage() {
        return image;
    }
}
