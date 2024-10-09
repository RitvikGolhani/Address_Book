import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, AddressBook> addressBooks = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.println("1. Create a new Address Book");
            System.out.println("2. Select an Address Book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextLine();

            switch (choice) {
                case "1":
                    createAddressBook(addressBooks, sc);
                    break;
                case "2":
                    selectAddressBook(addressBooks, sc);
                    break;
                case "3":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("3"));
    }

    private static void createAddressBook(Map<String, AddressBook> addressBooks, Scanner sc) {
        System.out.println("Enter a unique name for the Address Book:");
        String addressBookName = sc.nextLine();
        AddressBook newAddressBook = new AddressBook();
        addressBooks.put(addressBookName, newAddressBook);
        System.out.println(addressBookName + " AddressBook created.");
    }

    private static void selectAddressBook(Map<String, AddressBook> addressBooks, Scanner sc) {
        System.out.println("Available Address Books:");
        for (String name : addressBooks.keySet()) {
            System.out.println(name);
        }

        System.out.print("Enter the name of the Address Book you want to use: ");
        String addressBookName = sc.nextLine();

        if (addressBooks.containsKey(addressBookName)) {
            AddressBook addressBook = addressBooks.get(addressBookName);
            manageContacts(addressBook, sc);
        } else {
            System.out.println("No Address Book found with the name '" + addressBookName + "'.");
        }
    }

    private static void manageContacts(AddressBook addressBook, Scanner sc) {
        String action;
        do {
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");
            action = sc.nextLine();

            switch (action) {
                case "1":
                    addContact(addressBook, sc);
                    break;
                case "2":
                    editContact(addressBook, sc);
                    break;
                case "3":
                    deleteContact(addressBook, sc);
                    break;
                case "4":
                    addressBook.display();
                    break;
                case "5":
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!action.equals("5"));
    }

    private static void addContact(AddressBook addressBook, Scanner sc) {
        System.out.println("Enter firstName, lastName, city, state, email, phoneNumber:");
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String city = sc.nextLine();
        String state = sc.nextLine();
        String email = sc.nextLine();
        int phoneNumber = Integer.parseInt(sc.nextLine());
        Contact contact = new Contact(firstName, lastName, city, state, phoneNumber, email);
        addressBook.add(contact);
    }

    private static void editContact(AddressBook addressBook, Scanner sc) {
        System.out.println("Enter the name of the contact you want to edit:");
        String name = sc.nextLine();
        addressBook.editContact(name);
    }

    private static void deleteContact(AddressBook addressBook, Scanner sc) {
        System.out.println("Enter the name of the contact you want to delete:");
        String nameToDelete = sc.nextLine();
        addressBook.deleteContact(nameToDelete);
    }
}
