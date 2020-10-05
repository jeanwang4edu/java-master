package study.jeanwang2dev;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone("Samsung S10e","5431237788");

    public static void main(String[] args) {
        // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.

        myPhone.start();
        boolean quit = false;
        while(!quit){
            System.out.println("\nEnter operation action choice: 6 to show all options");
            int action;
            while(true) {
                if( scanner.hasNextInt()){
                    action = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Invalid Input, please enter number from 1 to 6");
                    scanner.nextLine();
                }
            }

            switch (action) {
                case 0:
                    myPhone.shutdown();
                    quit = true;
                    break;
                case 1:
                    myPhone.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    printInstructions();
                    break;
            }
        }

        scanner.close();
    }

    public static void printInstructions(){
            System.out.println("\nPress ");
            System.out.println("\t 0 - To print Instructions.");
            System.out.println("\t 1 - To print the list of contact list on the phone.");
            System.out.println("\t 2 - To add a contact to the list.");
            System.out.println("\t 3 - To modify a contact in the list.");
            System.out.println("\t 4 - To remove a contact from the list.");
            System.out.println("\t 5 - To search for a contact in the list.");
    }

    public static void addContact(){
        System.out.println("Please enter the contact name you want to add :");
        String name = scanner.nextLine();
        System.out.println("Please enter the phone number for this contact :");
        String number = scanner.nextLine();
        Contact newContact = Contact.createContact(name, number);
        myPhone.addContact(newContact);
    }

    public static void updateContact(){
        System.out.println("Please enter the contact name you want to update :");
        String name = scanner.nextLine();
        if(myPhone.queryContact(name) == null){
            System.out.println("There is not a contact with this name in the list.");
        } else {
            System.out.println("Please enter the name you want to update this contact to :");
            String newName = scanner.nextLine();
            System.out.println("Please enter the phone number you want to update this contact to :");
            String number = scanner.nextLine();
            Contact oldContact = myPhone.queryContact(name);
            Contact newContact = Contact.createContact(newName, number);
            myPhone.updateContact(oldContact, newContact);
        }
    }

    public static void removeContact(){
        System.out.println("Please enter the contact name you want to remove :");
        String name = scanner.nextLine();
        if(myPhone.queryContact(name) == null){
            System.out.println("There is not a contact with this name in the list.");
        } else {
            myPhone.removeContact(myPhone.queryContact(name));
        }
    }

    public static void searchForContact(){
        System.out.println("Please enter the contact name you want to search for :");
        String name = scanner.nextLine();
        Contact result = myPhone.queryContact(name);
        if(result == null){
            System.out.printf("Contact with name $s is not found in the list.", name);
        } else {
            System.out.printf("Found contact with name %s, and phone number is %s", name, result.getPhoneNumber());
        }
    }
}
