
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



}
