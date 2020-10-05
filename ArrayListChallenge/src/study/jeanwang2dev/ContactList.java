package study.jeanwang2dev;

import java.util.ArrayList;

public class ContactList {

    private ArrayList<Contact> contactList = new ArrayList<Contact>();

    public void addContact(Contact contact){
        contactList.add(contact);
    }

    public ArrayList<Contact> getContactList(){
        return contactList;
    }

    public void printList(){
        System.out.printf("There are %d contacts in the list.%n", contactList.size() );
        for(int i = 0; i < contactList.size(); i++){
            System.out.printf("Contact name: %s Phone Number: %s%n", contactList.get(i).getName(), contactList.get(i).getPhoneNumber());
        }
    }

    public void modifyContact(Contact oldContact, Contact newContact){
        if( findContact(oldContact.getName()) != -1 ){
            System.out.println("Modify the contact with name：" + oldContact.getName() );
            contactList.set(findContact(oldContact.getName()), newContact);
        } else {
            System.out.println("The contact you want to modify does not exist in the list.");
        }
    }

    private int findContact(String contactName){
        for(int i = 0; i < contactList.size(); i++){
            if( contactList.get(i).getName().toLowerCase().equals(contactName.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

    public String findContactPhoneNumber(String contactName){
        if( findContact(contactName) != -1 ){
            return contactList.get( findContact(contactName) ).getPhoneNumber();
        } else {
            return null;
        }

    }

    public boolean isContactExist(String contactName){
        for(int i = 0; i < contactList.size(); i++){
            if( contactList.get(i).getName().toLowerCase().equals( contactName.toLowerCase() ) ){
                return true;
            }
        }
        return false;
    }

    public void removeContact(String contactName){
        if( findContact(contactName) != -1 ){
            contactList.remove(findContact(contactName));
            System.out.println("Remove the contact with the name of " + contactName);
        } else {
            System.out.println("The contact you want to remove does not exist in the list.");
        }
    }

    public int getNumberOfContacts(){
        return contactList.size();
    }

//            System.out.println("Please enter the contact name you want to add :");
//    String name;
//        while( true ){
//        name = scanner.nextLine();
//        if( findContact(name) == -1){
//            break;
//        } else {
//            System.out.println("There is not a contact with this name in the list. Please enter another name:");
//        }
//    }
//        System.out.println("Please enter the contact Phone Number");
//    String phoneNumber = scanner.nextLine();
//    Contact newContact = Contact.createContact(name, phoneNumber);

}
