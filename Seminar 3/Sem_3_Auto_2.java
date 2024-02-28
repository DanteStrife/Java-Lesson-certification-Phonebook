//
//Удаление четных элементов
//
//Инструкция по использованию платформы
//
//
//
//Дан произвольный массив целых чисел. Создайте список ArrayList,
//заполненный данными из этого массива. Необходимо удалить из списка
//четные числа и вернуть результирующий.
//
//Напишите свой код в методе removeEvenNumbers класса Answer.
//Метод removeEvenNumbers принимает на вход один параметр:
//Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>
//
//Примеры.
//Исходный массив:
//
//        1, 2, 3, 4, 5, 6, 7, 8, 9
//Результат:
//
//        [1, 3, 5, 7, 9]
//Исходный массив:
//
//        2, 4, 6, 8
//Результат:
//
//        []

import java.util.ArrayList;
import java.util.Arrays;

class Answer {
    public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> OurList = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < OurList.size(); i++) {
            if (OurList.get(i) % 2 == 0) {
                OurList.remove(i);
                i--;
            }
        }
        return OurList;
    }
}

