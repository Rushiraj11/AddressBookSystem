package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Adding Contact Details" + "\n2.Editing the Contact details"
                + "\n3.Deleting the Contact details" +"\n4.Add Multiple Contact"+ "\n5.Display all contact"+"\n6.Press 0 for exit");
        int option = sc.nextInt();
        switch (option) {

            case 1:
                AddressBook.addContact();
                break;
            case 2:
                AddressBook.editContact();
                break;
            case 3:
                AddressBook.deleteContact();
                break;
            case 4:
                AddressBook.addMultipleContact();
                break;
            case 5:
                AddressBook.displayAll() ;
                break;

            default:
                System.out.println("Thank You");

        }
    }
}
