package Assessment02;

//Build a small contact manager with add, search, update, and delete operations.
// Store contacts in a Map keyed by contact ID. Validate IDs and required fields;
// handle missing contacts with clear messages.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Contact{
    int id;
    String name;
    String phone;

    Contact(int id, String name, String phone){
        this.id=id;
        this.name=name;
        this.phone=phone;
    }

    public String toString(){
        return "ID : "+ id + "  Name : "+ name+"  Phone : "+ phone;
    }
}


public class ContactManager {
    public static void main(String[] args){
        Map<Integer,Contact> Contacts= new HashMap<>();
        Scanner sc=new Scanner(System.in);

        Contacts.put(101,new Contact(101,"hari","9876554321"));
        Contacts.put(102,new Contact(102,"sukish","9876554321"));
        Contacts.put(103,new Contact(103,"kishore","9876554321"));

        Contacts.values()
                .stream()
                .forEach(System.out::println);

        System.out.print("Enter Contact Id: ");
        Integer num=sc.nextInt();
        Contacts.values()
                .stream()
                .filter(c->c.id==num)
                .forEach(System.out::println);
        Contacts.put(104,new Contact(104,"samundi", "6677366655"));
        //removing contact
        Contacts.remove(103);

        System.out.println("Contacts Available:");
        Contacts.values()
                .stream()
                .forEach(System.out::println);

    }
}
