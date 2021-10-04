package com.bridgelabz.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Contact> contactList = new ArrayList<Contact>();
    public static void addContact() {
        Contact contact = new Contact();

        System.out.println("Enter the First Name : ");
        String firstName = sc.next();
        contact.setFirstName(firstName);

        System.out.println("Enter the Last Name : ");
        String lastName = sc.next();
        contact.setLastName(lastName);

        System.out.println("Enter the Address : ");
        String address = sc.next();
        contact.setAddress(address);

        System.out.println("Enter the City : ");
        String city = sc.next();
        contact.setCity(city);

        System.out.println("Enter the State : ");
        String state = sc.next();
        contact.setState(state);

        System.out.println("Enter the ZIP Code : ");
        long zipCode = sc.nextLong();
        contact.setZip(zipCode);

        System.out.println("Enter the Phone Number : ");
        long phoneNumber = sc.nextLong();
        contact.setPhoneNumber(phoneNumber);

        System.out.println("Enter the E-mail: ");
        String email = sc.next();
        contact.setEmail(email);

        contactList.add(contact); //adding list to contact from user

            for (Contact c : contactList) {  // displaying contact
                System.out.println("\nFirst Name: " + c.getFirstName() + "\t Last Name: " + c.getLastName()
                        + "\n Address: " + c.getAddress() + "  " +"\n city: "+ c.getCity() + "  " +"\n State: "+ c.getState()
                        + "\n Phone Number: " + c.getPhoneNumber() + "\tEmail:" + c.getEmail());
            }

        }
    }


