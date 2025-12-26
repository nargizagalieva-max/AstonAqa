package org.example;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class PhoneBook { private Map<String, List<String>> phoneBook = new HashMap<>();
    public void add(String lastName, String phoneNumber) {
        phoneBook
                .computeIfAbsent(lastName, k -> new ArrayList<>())
                .add(phoneNumber);
    }
    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, List.of());
    }
}
