//Подсчет повторяющихся имен
//
//Инструкция по использованию платформы
//
//
//
//Вы работаете с приложением для учета имен пользователей. Ваша задача - разработать программу, которая принимает на вход пять имен пользователей (или использует имена по умолчанию, если аргументы не предоставлены) и подсчитывает, сколько раз каждое имя встречается.
//Программа должна использовать HashMap для хранения имен и их количества вхождений.
//        По завершении, программа выводит результат в виде пар "имя - количество".
//
//На входе:
//
//
//        'Elena'
//        'Elena'
//        'Elena'
//        'Ivan'
//        'Ivan'
//На выходе:
//
//
//        {Ivan=2, Elena=3}


import java.util.HashMap;

class NamesCounter {
    private HashMap<String, Integer> names = new HashMap<>();

    // Метод для добавления имени в HashMap
    public void addName(String name) {
        // Введите свое решение ниже
        names.put(name, names.getOrDefault(name, 0) + 1);
    }

    // Метод для вывода содержимого HashMap
    public void showNamesOccurrences() {
        // Введите свое решение ниже
        System.out.println(names);
    }
}
//    Второе решение
//class NamesCounter {
//    private HashMap<String, Integer> names = new HashMap<>();
//
//    // Метод для добавления имени в HashMap
//    public void addName(String name) {
//        if (names.containsKey(name)) {
//            names.put(name, names.get(name) + 1);
//        } else {
//            names.put(name, 1);
//        }
//    }
//
//    // Метод для вывода содержимого HashMap
//    public void showNamesOccurrences() {
//        System.out.println(names);
//    }
//}