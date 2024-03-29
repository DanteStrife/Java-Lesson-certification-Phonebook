//Анализатор списка
//
//Инструкция по использованию платформы
//
//
//
//        Реализуйте метод, который принимает на вход целочисленный массив arr:
//        - Создаёт список ArrayList, заполненный числами из исходого массива arr.
//        - Сортирует список по возрастанию и выводит на экран.
//        - Находит минимальное значение в списке и выводит на экран -
//Minimum is {число} - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
//        - Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
//Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:
//
//Integer[] arr - массив целых чисел.
//
//        Пример.
//Исходный массив:
//
//        4, 2, 7, 5, 1, 3, 8, 6, 9
//Результаты:
//
//        [1, 2, 3, 4, 5, 6, 7, 8, 9]
//Minimum is 1
//Maximum is 9

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;

class Answer_3 {
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(arr));
        result.sort(null);
        System.out.println(result);
        IntSummaryStatistics stats = new IntSummaryStatistics();
        Iterator<Integer> iterator= result.listIterator();
        while (iterator.hasNext()){
            stats.accept(iterator.next());
        }
        System.out.println("Minimum is " + stats.getMin());
        System.out.println("Maximum is " + stats.getMax());
        System.out.println("Average is = " + stats.getAverage() );
    }
}

