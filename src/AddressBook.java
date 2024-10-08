import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contact> a = new ArrayList<Contact>();

    public void add (Contact c){
        a.add(c);
    }

    public void display(){
        System.out.println(a);
    }
    public void editContact(String firstName) {
        Scanner sc = new Scanner(System.in);
        for (Contact contact : a) {
            if (contact.getFirstName().equals(firstName)) {
                System.out.println("Edit Contact : " + contact);
                System.out.println("Enter new FirstName : ");
                String newFirstName = sc.nextLine();
                if (!newFirstName.isEmpty()) {
                    contact.setFirstName(newFirstName);
                }
                System.out.println("Enter new LastName : ");
                String newLastName = sc.nextLine();
                if (!newLastName.isEmpty()) {
                    contact.setLastName(newLastName);
                }

                System.out.println("Enter new city : ");
                String newCity = sc.nextLine();
                if (!newCity.isEmpty()) {
                    contact.setCity(newCity);
                }

                System.out.println("Enter new State : ");
                String newState = sc.nextLine();
                if (!newState.isEmpty()) {
                    contact.setState(newState);
                }


                System.out.println("Enter new phone number : ");
                String newphoneNumber = sc.nextLine();
                if (!newphoneNumber.isEmpty()) {
                    contact.setPhoneNumber(Integer.parseInt(newphoneNumber));
                }

                System.out.println("Enter new  email : ");
                String newEmail = sc.nextLine();
                if (!newEmail.isEmpty()) {
                    contact.setEmail(newEmail);
                }
                System.out.println("Contact updated!");
            } else {
                System.out.println("Contact Not Found");
            }
        }
    }

    public void deleteContact(String name) {
        a.removeIf(c -> c.getFirstName().equalsIgnoreCase(name));
        System.out.println("Contact(s) with name '" + name + "' deleted.");
    }
}