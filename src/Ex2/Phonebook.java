package Ex2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class Phonebook {
    String name;
    String phoneNumber;

    Map<String, LinkedList> phoneBook = new LinkedHashMap<>();

    public void add(String name, String phoneNumber){
        LinkedList<String> phoneNumbers = new LinkedList<>();
        if (phoneBook.containsKey(name)){
            phoneNumbers = phoneBook.get(name);
        }
        else {
            phoneNumbers.addLast(phoneNumber);
        }
        phoneBook.put(name, phoneNumbers);

    }
    public void get(String inputName){
        phoneBook.forEach((k, v) -> {
            if (inputName.equals(k)){
                System.out.println(k + ":" + v);
            }

        });
    }

}
