//Задание
//
//        Реализуйте структуру телефонной книги с помощью HashMap.
//        Программа также должна учитывать,
//        что во входной структуре будут повторяющиеся имена
//        с разными телефонами, их необходимо считать,
//        как одного человека с разными телефонами.
//        Вывод должен быть отсортирован по убыванию числа телефонов.


import java.util.*;

class PhoneBook {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        addContact(phoneBook, "Constantinov", "123-456-789");
        addContact(phoneBook, "Petrov", "987-654-321");
        addContact(phoneBook, "Juravlev", "111-222-333");
        addContact(phoneBook, "Ivanchenko", "555-666-777");
        addContact(phoneBook, "Ivanchenko", "999-888-777");
        addContact(phoneBook, "Petrov", "111-222-333");
        addContact(phoneBook, "Petrov", "111-232-333");
        printContact(phoneBook);
    }

    private static void addContact(Map<String, List<String>> phoneBook, String name, String PhoneNumber) {
        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(PhoneNumber);
    }

    private static void printContact(Map<String, List<String>> phonebook){
        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(phonebook.entrySet());
        entries.sort(Comparator.comparingInt(entry -> entry.getValue().size()));
        for (int i = entries.size() - 1; i >= 0; i--) {
            Map.Entry<String, List<String>> entry = entries.get(i);
            String name = entry.getKey();
            List<String> phoneNumbers = entry.getValue();
            System.out.println(name + ": " + phoneNumbers);
        }
    }
}
