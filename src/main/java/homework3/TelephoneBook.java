package homework3;

import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    private Map<String, String> map = new HashMap<>();


    public TelephoneBook() {
    }


    public void add(String surname, String number) {
        map.put(number, surname);
    }

    public void get (String surname) {
        for (Map.Entry<String, String> entry: map.entrySet()) {
            if (entry.getValue().equals(surname)) {
                System.out.println(entry.getValue() + " - " + entry.getKey());
            }
        }

    }
}
