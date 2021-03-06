package com.bridgelabz.addressbooksystem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {


     static String fname;
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System Program");
        int option;
        Map<String, List<Contact>> addressBooks = new HashMap<String, List<Contact>>();
        {
            System.out.println(
                    "Enter 1 to Create AddressBook\nEnter 2 for adding contact to AddressBook\nEnter 3 to see All Address Books Name\n"
                            + "Enter 0 to Exit");
            option = s.nextInt();
            switch (option) {
                case 1:
                    AddressBookMain.addAddressBook(addressBooks);
                    break;
                case 2:
                    AddressBookMain.editAddressBook(addressBooks);
                    break;
                case 3:
                    AddressBookMain.displayAllAddressBook(addressBooks);
                    break;

                default:
                    System.out.println("Thank You");
                    System.exit(0);

                    break;
            }
        }
    }


    public static void addAddressBook(Map<String, List<Contact>> addressBooks) {
        System.out.println("Add new AddressBook");
        String bookName = s.next();
        addressBooks.put(bookName, new ArrayList<Contact>());
    }

    public static void displayAllAddressBook(Map<String, List<Contact>> addressBooks) {
        boolean is_Empty = addressBooks.isEmpty();
        if (is_Empty == true)
            System.out.println("No Address Books are Present");
        else
            System.out.println(addressBooks);
    }

    public static void editAddressBook(Map<String, List<Contact>> addressBooks) {
        System.out.println("Enter the name of the AddressBook you want to Edit");
        String bookName1 = s.next();

        if (addressBooks.containsKey(bookName1)) {
            List<Contact> contact = addressBooks.get(bookName1);
            int choice;
            do {
                System.out.println("Enter your option : ");
                System.out.println("1.Add contact  ");
                System.out.println("2.Display all contact ");
                System.out.println("3.Edit Contact ");
                System.out.println("4.Delete Contact ");

                choice = s.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Add Contact  \n");
                        System.out.print("Enter First Name :");
                        String fName = s.next();

                        if (AddressBook.checkDuplicate(fName, contact) == false) {
                            AddressBook.addContact();
                        } else {
                            System.out.println("Already exists");
                        }
                        break;
                    case 2:
                        AddressBook.displayAll();
                        break;
                    case 3:
                        AddressBook.editContact();
                        break;
                    case 4:
                        AddressBook.addMultipleContact() ;
                        break;
                    case 5:
                        AddressBook.deleteContact();
                        break;
                    default:
                        System.out.println("Enter valid option");
                        break;
                }
                System.out.println("(1.Continue or 0.Exit)");
                choice = s.nextInt();
            } while (choice != 0);
        } else
            System.out.println("Invalid AddressBook Name Not exist");
    }

}