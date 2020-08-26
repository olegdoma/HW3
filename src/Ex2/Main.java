package Ex2;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

    Phonebook phonebook = new Phonebook();
    phonebook.add("Vas0", "123");
    phonebook.add("Vas0", "1233333333");
    phonebook.add("Vas1", "1234");
    phonebook.add("Vas2", "12345");

    phonebook.get("Vas4");

    }
}
