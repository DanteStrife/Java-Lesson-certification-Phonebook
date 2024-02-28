//Телефонная книга
//Напишите программу, представляющую телефонную книгу. Программа должна иметь следующие функции:
//
//add(String name, Integer phoneNum): Добавляет запись в телефонную книгу.
//Если запись с именем name уже существует, добавляет новый номер телефона в существующую запись.
//Если запись с именем name не существует, создает новую запись с этим именем и номером телефона phoneNum.
//
//find(String name): Поиск номеров телефона по имени в телефонной книге.
//Если запись с именем name существует, возвращает список номеров телефона для этой записи.
//Если запись с именем name не существует, возвращает пустой список.
//
//getPhoneBook(): Возвращает всю телефонную книгу в виде HashMap, где ключи - это имена, а значения - списки номеров телефона.
//
//        Пример.
//
//На входе:
//
//add("Alice", 123456);
//add("Alice", 789012);
//add("Bob", 789012);
//На выходе:
//
//Команды:
//
//find("Alice")
//getPhoneBook()
//find("Me")
//Результат:
//
//        [123456, 789012].
//        {Bob=[789012], Alice=[123456, 789012]}
//        []

import java.util.ArrayList;
import java.util.HashMap;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {

// Введите свое решение ниже
        phoneBook.computeIfAbsent(name,k-> new ArrayList<>()).add(phoneNum);
    }

    public ArrayList<Integer> find(String name) {

// Введите свое решение ниже
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
// Введите свое решение ниже
        return phoneBook;

    }
}
// Второе решение

//class PhoneBook {
//    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
//
//    public void add(String name, Integer phoneNum) {
//        if (phoneBook.containsKey(name)) {
//            phoneBook.get(name).add(phoneNum);
//        } else {
//            ArrayList<Integer> values = new ArrayList<>();
//            values.add(phoneNum);
//            phoneBook.put(name, values);
//        }
//    }
//
//    public ArrayList<Integer> find(String name) {
//        if (phoneBook.containsKey(name)) {
//            return phoneBook.get(name);
//        }
//        return new ArrayList<Integer>();
//    }
//
//    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
//        return phoneBook;
//    }
//}

