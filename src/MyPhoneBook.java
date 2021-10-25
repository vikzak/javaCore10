import java.util.*;

public class MyPhoneBook {
    private Map<String, HashSet<String>> book;
    MyPhoneBook() {
        this.book = new HashMap<>();
    }
    // добавляем метод add
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
    // получение данных через lastname
    Set<String> getLastName(String lastName) {
        return book.get(lastName);
    }
    // печать справочника
    public void print() {
       book.forEach((key, value) -> System.out.printf("%s %s,\n", key, value));
    }
}
