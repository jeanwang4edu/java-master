package study.jeanwang2dev;

import java.util.ArrayList;

public class MobilePhone {

    private String name;
    private String phoneNumber;
    private ArrayList<Contact> contactList;

    public MobilePhone(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.contactList = new ArrayList<Contact>();
    }

    public void start(){
        System.out.printf("Phone %s starting...", name);
    }

    public void shutdown(){
        System.out.printf("Phone %s shutdown...", name);
    }

    public void printContactList(){
        System.out.printf("There are %d contacts in the list.%n", contactList.size() );
        for(int i = 0; i < contactList.size(); i++){
            System.out.printf("%d: Contact name: %s -> Phone Number: %s%n", i+1, contactList.get(i).getName(), contactList.get(i).getPhoneNumber());
        }
    }

    public void addContact(Contact contact){
        if(findContact(contact.getName()) == -1) {
            contactList.add(contact);
            System.out.printf("contact with name: %s and phone number: %s successfully added.", contact.getName(), contact.getPhoneNumber());
        } else {
            System.out.println("There is already a contact with this name in the list.");
        }
    }

    private int findContact(String name){
        for(int i = 0; i < contactList.size(); i++){
            if( contactList.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

    // assume contact name is identical in the list
    public void updateContact(Contact oldContact, Contact newContact){
        if( findContact(oldContact.getName()) == -1){
            System.out.printf("There isn't a contact with name %s exist in list.", oldContact.getName());
        } else if( findContact(newContact.getName()) != -1) {
            System.out.printf("There is already a contact with name %s exist in list./n Update failed.", newContact.getName());
        } else {
            contactList.set(findContact(oldContact.getName()), newContact);
            System.out.printf("Successfully replaced contact %s with %s", oldContact.getName(), newContact.getName());
        }
    }

    public void removeContact(Contact contact){
        if(findContact(contact.getName()) != -1){
            contactList.remove(findContact(contact.getName()));
        } else {
            System.out.println("There is not a contact with this name in the list.");
        }
    }

    public Contact queryContact(String contactName){
        if( findContact(contactName) != -1 ){
            System.out.printf("Found %s in the list", contactName );
            return contactList.get(findContact(contactName));

        } else {
            System.out.printf("There is no contact with the name of %s in the list", contactName);
            return null;
        }
    }

}
