//Перевернутый LinkedList
//
//Инструкция по использованию платформы
//
//
//
// Дан LinkedList с несколькими элементами разного типа.
// В методе revert класса LLTasks реализуйте разворот
// этого списка без использования встроенного функционала.
//
//        Пример
//
//
//// Дан
//[1, One, 2, Two]
//
//// Вывод
//        [1, One, 2, Two]
//        [Two, 2, One, 1]

import java.util.LinkedList;
import java.util.ListIterator;

class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        // Напишите свое решение ниже
        for (int i = 0; i < ll.size(); i++) {
            Object tmp = ll.removeLast();
            ll.add(i, tmp);
        }
        return ll;
    }
// Второй вариант решения
//    public static void revertLL(LinkedList<Object> ll) {
//        // Напишите свое решение ниже
//        int size = ll.size();
//        for (int i = 0; i < size / 2; i++) {
//            Object temp = ll.get(i);
//            ll.set(i, ll.get(size - i - 1));
//            ll.set(size - i - 1, temp);
//        }
//    }
}



