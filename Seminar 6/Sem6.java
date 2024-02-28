import java.util.*;

public class Sem6 {
    public static void main(String[] args) {
//        task0();
//        task1(creatorArr(1000, 0, 24));
        Cat cat1 = new Cat("Vellgelm", "fasd", "asdf", 7);
        Cat cat2 = new Cat("Vellgelm", "fasd", "asdf", 7);
        Cat cat3 = new Cat(".nm,.ok", "yuio", "76uyof", 1);
        Set<Cat> set=new HashSet<>();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);

        System.out.println(set);
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.hashCode());
        System.out.println(cat3.hashCode());


    }

    //      1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
//         Распечатайте содержимое данного множества.
//      2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5,6, 3}.
//         Распечатайте содержимое данного множества.
//      3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
//         Распечатайте содержимое данного множества.
    static void task0() {
        Integer[] array = {2, 8, 5, 4, 4, 3, 7, 2, 7, 8, 9};
        String[] strings = {"gsdf", "fasdfs", "fgasde", "gasdf"};

        Set<String> set1 = new HashSet<>(Arrays.asList(strings));
        Set<String> set2 = new LinkedHashSet<>(Arrays.asList(strings));
        Set<String> set3 = new TreeSet<>(Arrays.asList(strings));

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }

//        1. Напишите метод, который заполнит массив из 1000 элементов случайными
//        цифрами от 0 до 24.
//        2. Создайте метод, в который передайте заполненный выше массив и с
//        помощью Set вычислите процент уникальных значений в данном массиве и
//        верните его в виде числа с плавающей запятой.
//        Для вычисления процента используйте формулу:
//        процент уникальных чисел = количество уникальных чисел * 100 / общее
//        количество чисел в массиве.

    static Integer[] creatorArr(int n, int min, int max) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Random().nextInt(min, max + 1);

        }
//        for (Integer num : arr) {
//            num = new Random().nextInt(min, max + 1);


        return arr;
    }

    static void task1(Integer[] nums) {
        Set<Integer> set = new HashSet<>(Arrays.asList(nums));
        System.out.println((double) set.size() * 100 / nums.length);
        ;
    }

//    1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
//    приложения, которое является
//    а) информационной системой ветеринарной клиники
//    б) архивом выставки котов
//    в) информационной системой Театра кошек Ю. Д. Куклачёва
//    Можно записать в текстовом виде, не обязательно реализовывать в java.


}