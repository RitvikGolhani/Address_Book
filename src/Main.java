import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, AddressBook> addressBooks = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        String ResponseToCreateBook = "yes"; // Control variable for the loop

        while (ResponseToCreateBook.equalsIgnoreCase("yes")) {
            System.out.println("Do you want to create a new Address Book? (yes/no)");
            ResponseToCreateBook = sc.nextLine();

            if (ResponseToCreateBook.equalsIgnoreCase("yes")) {
                System.out.println("Enter a unique name for the Address Book:");
                String addressBookName = sc.nextLine();

                // Create a new Address Book
                AddressBook newAddressBook = new AddressBook();
                addressBooks.put(addressBookName, newAddressBook);
                System.out.println( addressBookName + "AddressBook created.");
            }

            System.out.println("Available  AddressBooks:");
            for (String name : addressBooks.keySet()) {
                System.out.println(name);
            }

            System.out.println("Enter the name of address book in which u want to create contacts");
            String addressBookName = sc.nextLine();

            if (addressBooks.containsKey(addressBookName)) {
                AddressBook AddressBook = addressBooks.get(addressBookName);

                String addMore = "yes"; // Control variable for adding contacts

                while (addMore.equalsIgnoreCase("yes")) {
                    System.out.println("Enter firstName, lastName, city, state, email, phoneNumber:");
                    String firstName = sc.nextLine();
                    String lastName = sc.nextLine();
                    String city = sc.nextLine();
                    String state = sc.nextLine();
                    String email = sc.nextLine();
                    int phoneNumber = sc.nextInt();
                    sc.nextLine(); // Consume the newline left by nextInt()

                    Contact c2 = new Contact(firstName, lastName, city, state, phoneNumber, email);
                    AddressBook.add(c2);

                    System.out.println("Do you want to add another contact? (yes/no)");
                    addMore = sc.nextLine();
                }

                // Editing a contact
                System.out.println("Do you want to edit a contact? (yes/no)");
                String editResponse = sc.nextLine();
                if (editResponse.equalsIgnoreCase("yes")) {
                    System.out.println("Enter the name of the contact you want to edit:");
                    String name = sc.nextLine();
                    AddressBook.editContact(name);
                }

                // Deleting a contact
                System.out.println("Do you want to delete a contact? (yes/no)");
                String deleteResponse = sc.nextLine();
                if (deleteResponse.equalsIgnoreCase("yes")) {
                    System.out.println("Enter the name of the contact you want to delete:");
                    String nameToDelete = sc.nextLine();
                    AddressBook.deleteContact(nameToDelete);
                }

                // Display the current contacts in the selected address book
                System.out.println("Current contacts in '" + addressBookName + "':");
                AddressBook.display();
            } else {
                System.out.println("No Address Book found with the name '" + addressBookName + "'.");
            }

            System.out.println("Do you want to perform another action? (yes/no)");
            ResponseToCreateBook = sc.nextLine();
        }


    }
}
