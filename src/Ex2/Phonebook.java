package Ex2;

import java.lang.reflect.Array;
import java.util.*;

public class Phonebook {
    String name;
    String phoneNumber;

    Map<String, ArrayList> phoneBook = new HashMap<>();

    public void add(String name, String phoneNumber){
        if (phoneBook.containsKey(name)) {
            ArrayList phoneNumbers = phoneBook.get(name);
            if (phoneNumbers.contains(phoneNumber)) {
                System.out.println("Номер существует");
            } else {
                phoneNumbers.add(phoneNumber);
                    }
        }
        else{
        ArrayList phoneNumbers = new ArrayList(Collections.singletonList(phoneNumber));
        phoneBook.put(name, phoneNumbers);
        }
    }

    public void get(String name){
        if (phoneBook.containsKey(name)){
            System.out.println(name + ':' + phoneBook.get(name));
        }else{
            System.out.println("Такого имени нет");
        }

    }

}
