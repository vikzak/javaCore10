import java.util.*;

public class MyPhoneBook {
    private Map<String, HashSet<String>> book;
    MyPhoneBook() {
        this.book = new HashMap<>();
    }

    void add(String lastName, String phoneUser) {
        HashSet<String> numbers;
        if (book.containsKey(lastName)) {
            numbers = book.get(lastName);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phoneUser);
        book.put(lastName, numbers);
    }

    Set<String> getLastName(String lastName) {
        return book.get(lastName);
    }

    public void print() {
       book.forEach((key, value) -> System.out.printf("%s: %s,\n", key, value));
    }
}
