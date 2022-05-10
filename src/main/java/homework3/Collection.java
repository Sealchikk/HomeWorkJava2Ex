package homework3;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Red");
        words.add("Yellow");
        words.add("Bleak");
        words.add("Blue");
        words.add("Purple");
        words.add("White");
        words.add("Orange");
        words.add("Red");
        words.add("Purple");
        words.add("Blue");

        Set<String> words2 = new HashSet<>();
        for (int i = 0; i < words.size(); i++) {
            words2.add(words.get(i));
        }
        System.out.println(words2.size());
        System.out.println(words2);

        TelephoneBook telephonebook = new TelephoneBook();

        telephonebook.add("Petrov","89245723132");
        telephonebook.add("Petrov","89245723135");
        telephonebook.add("Petrov","89245723137");
        telephonebook.add("Ivanov","89245723138");
        telephonebook.add("Petrova","89245723139");

        telephonebook.get("Ivanov");




    }
}
