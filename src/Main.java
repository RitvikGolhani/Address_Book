
import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Contact c1 = new Contact("Ritvik", "Golhani","BLR","KRTK",123,"aaaaaaaaaaaa");

        AddressBook a1 = new AddressBook();

        a1.add(c1);

        a1.display();


    }
}
