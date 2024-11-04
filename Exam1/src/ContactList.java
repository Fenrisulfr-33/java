package Exam1.src;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class ContactList {
    private ArrayList<Contact> contacts;

    /** provided methods - used for testing  - do not modify */
    public ContactList(){
        contacts = new ArrayList<>();
    }

    /** reads data from a csv file and add Contact objects into the Arraylist contacts
     * @param fileName
     * */
    public void loadListFromFile(String fileName) {
        try {
            Scanner in = new Scanner(new File(fileName));
            while(in.hasNextLine()) {
                String line = in.nextLine();
                if(!line.isEmpty()) {
                    Contact cn = parseLine(line);
                    contacts.add(cn);
                }

            }
        }catch(Exception ex) {
            System.err.println("Error reading file: " + ex.getMessage());
            System.exit(1);
        }

    }

    /** parse a String to get the information to create a Contact object and return
     * that Contact object created
     * @param line
     * */
    private Contact parseLine(String line) {
        Scanner lineParse = new Scanner(line);
        lineParse.useDelimiter(",");
        Contact c =  new Contact(lineParse.next(), lineParse.next(), lineParse.nextLong());
        lineParse.close();
        return c;
    }

    /** returns the contacts ArrayList */
    public ArrayList<Contact> getContacts(){
        return contacts;
    }

    /** returns a String containing each one of the Contact objects in a new line*/
    public String toString() {
        String msg = "";
        for(Contact c: contacts){
            msg = msg + c + "\n";
        }
        return msg;

    }

    // end provided methods

    /** add a new object Contact to the Arraylist contacts
     * @param name
     * @param email
     * @param phone
     * */
    public void addContact(String name, String email, long phone){
        contacts.add(new Contact(name, email, phone));
    }

    /** remove Contact object by name, return true if the Contact object was removed or false if
     * Contact object does not exist in the ArrayList contacts.
     * Tip: you may need to use another method to search if an object Contact
     * with the name passed as a parameter exists in your ArrayList contacts
     * @param name
     * @return boolean
     */

    public boolean removeContact(String name){
        for (int i =1; i < contacts.size(); i++){
            if (contacts.get(i).getName().equals(name)){
                // System.out.println("TESTING: " + contacts.get(i).getName());
                contacts.remove(i);
                return true;
            }
        }
        return false;
    }

    /** return the Contact object that has the name provided in the parameter or null
     * if the contact with that name does not exist in the ArrayList of contacts
     * @param name
     * @return Contact
     */
    public Contact searchByName(String name){
        for (int i =1; i < contacts.size(); i++){
            if (contacts.get(i).getName().equals(name)){
                // System.out.println("TESTING: " + contacts.get(i).getName());
                return contacts.get(i);
            }
        }
        return null;
    }

    /** return an ArrayList of Contact containing all Contact objects that have the phone
     * passed as a parameter. If no one in the contacts ArrayList has that phone,
     * the method returns an empty ArrayList of Contact
     * @param phone
     * @return ArrayList<Contact>
     */
    public ArrayList<Contact> searchByPhone(long phone){
        ArrayList<Contact> returnList = new ArrayList<Contact>(); 
        for (int i =1; i < contacts.size(); i++){
            if (contacts.get(i).getPhone() == phone){
                returnList.add(contacts.get(i));
            }
        }
        // System.out.println("TESTING returningList with phone numbers:" + returnList);
        return returnList;
    }


    /** provided main method for testing purposes, you can add your own tests here */

    public static void main(String[] args) {
        ContactList list = new ContactList();
        list.loadListFromFile("contacts.csv");
        // list.loadListFromFile("Exam1\\src\\contacts.csv");
        System.out.println("List of contacts:");
        System.out.println(list);

        System.out.println("Searching for name: Daphne Blake");
        Contact aux = list.searchByName("Daphne Blake");
        if(aux != null)
            System.out.println(aux);
        else System.out.println("Contact does not exist!");

        System.out.println();

        System.out.println("Adding Joe Ruby");
        list.addContact("Joe Ruby", "joe@qq.com", 9700000000L);

        System.out.println();

        System.out.println("New list of contacts:");
        System.out.println(list);

        System.out.println("Removing Joe Ruby");
        if(list.removeContact("Joe Ruby"))
            System.out.println("Successfully removed!");
        else
            System.out.println("Could not remove! Person wasn't in contact list!");

        System.out.println();

        System.out.println("List of contacts:");
        System.out.println(list);

        System.out.println("Searching by phone: 9701112222L");
        ArrayList<Contact> listC = list.searchByPhone(9701112222L);
        if(listC.size() > 0) {
            System.out.println("List of Contacts with phone 9701112222:");
            for (Contact c : listC)
                System.out.println(c);
        }
        else System.out.println("No contact with that phone number!");
    }
}
