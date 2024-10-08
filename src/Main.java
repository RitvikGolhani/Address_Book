
import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Contact c1 = new Contact("Ritvik", "Golhani","BLR","KRTK",123,"aaaaaaaaaaaa");

        AddressBook a1 = new AddressBook();

        a1.add(c1);
        Scanner sc=new Scanner(System.in);
        String addMore = "yes";

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
            a1.add(c2);

            System.out.println("Do you want to add another contact? (yes/no)");
            addMore = sc.nextLine();
        }
        System.out.println("Do you want to edit a contact? (yes/no)");
        String editResponse = sc.nextLine();
        if (editResponse.equalsIgnoreCase("yes")) {
            System.out.println("Enter the name of the contact you want to edit:");
            String name = sc.nextLine();
            a1.editContact(name);
        }
        System.out.println("Do you want to delete a contact? (yes/no)");
        String deleteResponse = sc.nextLine();
        if (deleteResponse.equalsIgnoreCase("yes")) {
            System.out.println("Enter the name of the contact you want to delete:");
            String nameToDelete = sc.nextLine();
            a1.deleteContact(nameToDelete);
        }
        a1.display();


    }
}
