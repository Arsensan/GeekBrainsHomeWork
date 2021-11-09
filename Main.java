 Exceptions2
Collection

 Exceptions
import org.w3c.dom.Node;

import java.util.*;

< Exceptions2
public class Main {
    public static void main(String[] args) {
        HashMapPractice();
        System.out.println();
        HashMapPractice2();
    }

    static void HashMapPractice() {

        Map<String, TelephoneBook> contact = new HashMap<>();

        contact.put("Ivanov", new TelephoneBook("Ivanov", 5541));
        contact.put("Petrov", new TelephoneBook("Petrov", 5531));
        contact.put("Ogurcov", new TelephoneBook("Ogurcov", 5412));
        contact.put("Taburetkin", new TelephoneBook("Taburetkin", 5551));
        contact.put("Rakov", new TelephoneBook("Rakov", 5761));
        contact.put("Bokov", new TelephoneBook("Bokov", 5241));
        contact.put("Bokov", new TelephoneBook("Bokov", 5555));
        for (Map.Entry<String, TelephoneBook> o : contact.entrySet()) {

            System.out.println(o.getKey() + ": " + o.getValue());
        }
        System.out.println("Вы искали:" + " " + contact.get("Ivanov"));
    }

    static void HashMapPractice2() {

        Map<String, Integer> words = new HashMap<>();

        words.put("map", 0);
        words.put("one", 0);
        words.put("key", 0);
        words.put("sleep", 0);
        words.put("bug", 0);
        words.put("carrot", 0);
        words.put("goat", 0);
        words.put("bear", 0);
        words.put("town", 0);
        words.put("city", 0);
        words.put("goal", 0);
        words.put("map", 0);
        for (Map.Entry<String, Integer> o : words.entrySet()) {
            int x = o.getValue() + 1;
            System.out.println(o.getKey() + ": Количество использований слова: " + x);
        }
    }
}
 Exceptions
public class Main {
    public static void main(String[] args) {
        HashMapPractice();
        System.out.println();
        HashMapPractice2();
    }

    static void HashMapPractice() {

        Map<String, TelephoneBook> contact = new HashMap<>();

        contact.put("Ivanov", new TelephoneBook("Ivanov", 5541));
        contact.put("Petrov", new TelephoneBook("Petrov", 5531));
        contact.put("Ogurcov", new TelephoneBook("Ogurcov", 5412));
        contact.put("Taburetkin", new TelephoneBook("Taburetkin", 5551));
        contact.put("Rakov", new TelephoneBook("Rakov", 5761));
        contact.put("Bokov", new TelephoneBook("Bokov", 5241));
        contact.put("Bokov", new TelephoneBook("Bokov", 5555));
        for (Map.Entry<String, TelephoneBook> o : contact.entrySet()) {

            System.out.println(o.getKey() + ": " + o.getValue());
        }
        System.out.println("Вы искали:" + " " + contact.get("Ivanov"));
    }

    static void HashMapPractice2() {

        Map<String, Integer> words = new HashMap<>();

        words.put("map", 0);
        words.put("one", 0);
        words.put("key", 0);
        words.put("sleep", 0);
        words.put("bug", 0);
        words.put("carrot", 0);
        words.put("goat", 0);
        words.put("bear", 0);
        words.put("town", 0);
        words.put("city", 0);
        words.put("goal", 0);
        words.put("map", 0);
        for (Map.Entry<String, Integer> o : words.entrySet()) {
            int x = o.getValue() + 1;
            System.out.println(o.getKey() + ": Количество использований слова: " + x);
        }
    }
}



