
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
        System.out.println("you wanna enter the contact yes/no");
        String response=sc.nextLine();
        if(response.equalsIgnoreCase("yes")) {

            System.out.println("Enter fistname lastName,city,state,email,phonenumber");
            String firstName = sc.nextLine();
            String lastName = sc.nextLine();
            String city = sc.nextLine();
            String state = sc.nextLine();
            String email = sc.nextLine();
            int phoneNumber = sc.nextInt();
            Contact c2 = new Contact(firstName, lastName, city, state, phoneNumber, email);
            a1.add(c2);
        }
        a1.display();


    }
}
